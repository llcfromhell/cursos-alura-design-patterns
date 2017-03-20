package templateMethod;

import common.Orcamento;

public class IHIT extends TemplateImpostoCondicional {

	@Override
	protected double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValorOrcamento() * (orcamento.getItens().size() * 0.01);
	}

	@Override
	protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.temItemRepetido();
	}

	
	@Override
	protected double maximaTaxacao(Orcamento orcamento) {
		return (orcamento.getValorOrcamento() * 0.13) + 100.00;
	}

}
