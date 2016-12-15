package strategy;

public class Iss implements Imposto {

	public double calculaAPartirDo(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}
	

}
