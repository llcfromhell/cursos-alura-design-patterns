package strategy;

import java.util.Random;

public class InvestimentoModerado implements Investimento {

	private double valorInvestido;
	
	@Override
	public Double getValorRendido() {
		if (new Random().nextDouble() > 0.50) return valorInvestido * 0.025;
		else return valorInvestido * 0.007;
	}

	@Override
	public void setaValorInvestido(double valorDoSaldoAtual) {
		this.valorInvestido = valorDoSaldoAtual;
	}

}
