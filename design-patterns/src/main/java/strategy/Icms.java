package strategy;

import common.Orcamento;

public class Icms extends Imposto {

	public Icms(Imposto outroImposto) {
		super(outroImposto);
	}

	public Icms() {
		super();
	}

	@Override
	public double calculaImpostoDo(Orcamento orcamento) {
		return orcamento.getValorOrcamento() * 0.01;
	}

}
