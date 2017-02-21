package templateMethod;

import common.Orcamento;

public class ICCP extends TemplateImpostoCondicional {	

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValorOrcamento() >= 500.00;
	}
	
	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValorOrcamento() * 0.05;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValorOrcamento() * 0.07;
	}

}
