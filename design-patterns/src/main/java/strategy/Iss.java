package strategy;

import common.Orcamento;

public class Iss implements Imposto {

	public double calculaAPartirDo(Orcamento orcamento) {
		return orcamento.getValorOrcamento() * 0.06;
	}
	

}
