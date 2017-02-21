package templateMethod;


import common.Orcamento;
import strategy.Imposto;


public abstract class TemplateImpostoCondicional implements Imposto {

	@Override
	public double calculaAPartirDo(Orcamento orcamento) {
		if (deveUsarMaximaTaxacao(orcamento)) {
			return maximaTaxacao(orcamento);
		} else {
			return minimaTaxacao(orcamento);
		}
	}

	protected abstract double minimaTaxacao(Orcamento orcamento);

	protected abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

	protected abstract double maximaTaxacao(Orcamento orcamento);

}
