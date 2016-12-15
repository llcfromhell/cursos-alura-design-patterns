package strategy;

public interface VerificadorIccc {

	public double aplicaImpostoSobreO(Orcamento orcamento);
	public VerificadorIccc proximo();
	
}
