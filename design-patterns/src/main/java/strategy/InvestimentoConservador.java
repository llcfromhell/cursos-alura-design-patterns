package strategy;

public class InvestimentoConservador implements Investimento {

	private double valorInvestido = 0.0;
	
	@Override
	public Double getValorRendido() {
		return valorInvestido * 0.008;
	}

	@Override
	public void setaValorInvestido(double valor) {
		valorInvestido = valor;
	}

}
