package templateMethod;


import common.Orcamento;
import strategy.Imposto;


public abstract class TemplateImpostoCondicional extends Imposto {

	public TemplateImpostoCondicional(Imposto outroImposto) {
		super(outroImposto);
	}
	
	public TemplateImpostoCondicional() {
		super();
	}

	@Override
	public final double calculaImpostoDo(Orcamento orcamento) {
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
