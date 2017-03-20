package decorator;

import common.Orcamento;
import strategy.Imposto;

public class ImpostoMuitoAlto extends Imposto {

	
	public ImpostoMuitoAlto() {
		super();
	}

	public ImpostoMuitoAlto(Imposto outroImposto) {
		super(outroImposto);
	}

	@Override
	protected double calculaImpostoDo(Orcamento orcamento) {
		// 20%
		return orcamento.getValorOrcamento() * 0.20;
	}

}
