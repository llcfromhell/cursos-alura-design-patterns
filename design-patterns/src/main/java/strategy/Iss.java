package strategy;

import common.Orcamento;

public class Iss extends Imposto {

	public double calculaImpostoDo(Orcamento orcamento) {
		return orcamento.getValorOrcamento() * 0.06;
	}
	

}
