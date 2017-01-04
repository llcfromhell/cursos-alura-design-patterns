package chainOfResponsability;

public class SemDesconto implements Desconto {

	@Override
	public double aplicaDesconto(Orcamento orcamento) {
		return 0;
	}

	@Override
	public void setProximo(Desconto desconto) {
	}

}
