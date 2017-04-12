package chainOfResponsability.desconto;

import java.util.Arrays;
import java.util.function.Predicate;

import common.Item;
import common.Orcamento;

public class DescontoPorVendaCasada implements Desconto{

	private Desconto proximo;

	@Override
	public double aplicaDesconto(Orcamento orcamento) {
 
		
		Long numeroCanetas = orcamento.getItensStream()
			.filter(i -> Item.DESC_CANETA.equals(i.getDescricao())).count();		
		
		Long numeroLapis = orcamento.getItensStream()
				.filter(i -> Item.DESC_LAPIS.equals(i.getDescricao())).count();
		
		if (numeroCanetas > 0 && numeroLapis > 0)  {
			return orcamento.getValorOrcamento() * 0.05;
		}
		
		return proximo.aplicaDesconto(orcamento);
	}

	@Override
	public void setProximo(Desconto desconto) {
		this.proximo = desconto;	
	}

}
