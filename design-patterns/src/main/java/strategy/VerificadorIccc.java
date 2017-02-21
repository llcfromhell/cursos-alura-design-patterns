package strategy;

import common.Orcamento;

public interface VerificadorIccc {

	public double aplicaImpostoSobreO(Orcamento orcamento);
	public VerificadorIccc proximo();
	
}
