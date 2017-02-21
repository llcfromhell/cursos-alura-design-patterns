package chainOfResponsability.desconto;

import common.Orcamento;

public class SemDesconto implements Desconto {

	@Override
	public double aplicaDesconto(Orcamento orcamento) {
		return 0;
	}

	@Override
	public void setProximo(Desconto desconto) {
	}

}
