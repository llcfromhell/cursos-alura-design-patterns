package common;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

import chainOfResponsability.desconto.Desconto;
import state.EmAprovacao;
import state.EstadoOrcamento;

public class Orcamento {

	private List<Item> itens = new ArrayList<>();
	
	private EstadoOrcamento estado = new EmAprovacao();
	
	private Double valorOrcamento;
	
	private Double valorDesconto;
	
	private Double valorOrcamentoComDesconto;
	
	public Orcamento(Item... itens) {
		this.itens = Arrays.asList(itens);
		valorOrcamento = calculaValorOrcamento();
	}
	
	public Stream<Item> getItensStream() {
		return this.getItens().stream();
	}
	
	public boolean temItemRepetido() {
		return getItensStream()
				.filter(new SeOutroItemTemOMesmoNome())
				.count() > 0;
	}

	public void changeToAprovado() {
		estado = estado.setAprovado();
	}
	
	public void changeToFinalizado() {
		estado = estado.setFinalizado();
	}
	
	public void changeToReprovado() {
		estado = estado.setReprovado();
	}
	
	private double calculaValorOrcamento() {
		return itens.stream().mapToDouble(Item::getValor).sum();
	}

	public Double calculaValorDescontoPeloEstado() {
		
		if (descontoJaCalculado()) {
		
			throw new DescontoJaCalculadoException();	
			
		} else {
			
			this.valorDesconto = estado.aplicaODescontoNo(this.getValorOrcamento());
			
			this.valorOrcamentoComDesconto = this.getValorOrcamento() - this.getValorDesconto();
			
			return this.getValorDesconto();
		}
	}

	private boolean descontoJaCalculado() {
		return valorDesconto != null;
	}
	
	public Double getValorOrcamentoComDesconto() {
		return valorOrcamentoComDesconto;
	}

	
	public Double getValorDesconto() {
		return valorDesconto;
	}

	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}
	
	public Double getValorOrcamento() {
		return valorOrcamento;
	}

	public EstadoOrcamento getEstado() {
		return estado;
	}
	
	public class SeOutroItemTemOMesmoNome implements Predicate<Item>{
		
		@Override
		public boolean test(Item f) {
			
			return getItensStream().anyMatch( p -> !p.equals(f) && p.getDescricao().equals(f.getDescricao()) );
			
		}
	}
	
}
