package strategy;

import common.Orcamento;

public class Icms implements Imposto {

	public double calculaAPartirDo(Orcamento orcamento) {
		return orcamento.getValorOrcamento() * 0.01;
	}

}
