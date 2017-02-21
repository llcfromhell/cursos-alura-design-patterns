package chainOfResponsability.desconto;

import java.util.Arrays;

import common.Item;
import common.Orcamento;

public class DescontoPorVendaCasada implements Desconto{

	private Desconto proximo;

	@Override
	public double aplicaDesconto(Orcamento orcamento) {
 
		if (orcamento.getItens().containsAll(Arrays.asList(new Item("Caneta", 0.0), new Item("Lapis", 0.0)))) {
			return orcamento.getValorOrcamento() * 0.05;
		}
		
		return proximo.aplicaDesconto(orcamento);
	}

	@Override
	public void setProximo(Desconto desconto) {
		this.proximo = desconto;	
	}

}
