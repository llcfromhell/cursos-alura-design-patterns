package strategy;

import common.Orcamento;

public abstract class Imposto {

	protected Imposto outroImposto;

	public Imposto(Imposto outroImposto) {
		this.outroImposto = outroImposto;
	}

	public Imposto() {
	}
	
	public double calculaAPartirDo(Orcamento orcamento) {
		
		double retorno = calculaImpostoDo(orcamento);
		
		if (outroImposto != null)
			retorno += outroImposto.calculaAPartirDo(orcamento);
		
		return retorno;
		
	}
	
	protected abstract double calculaImpostoDo(Orcamento orcamento);

}
