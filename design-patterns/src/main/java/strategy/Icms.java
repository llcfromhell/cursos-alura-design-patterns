package strategy;

public class Icms implements Imposto {

	public double calculaAPartirDo(Orcamento orcamento) {
		return orcamento.getValor() * 0.01;
	}

}
