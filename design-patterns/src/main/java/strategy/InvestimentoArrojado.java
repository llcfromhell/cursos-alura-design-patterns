package strategy;

import java.util.Random;

public class InvestimentoArrojado implements Investimento {

	private double valorInvestido;

	@Override
	public Double getValorRendido() {
		
		Double chances = new Random().nextDouble();
		Double trintaPorcento = 0.30;
		Double cinquentaPorcento = 0.50;
		
		if ( chances >= cinquentaPorcento) return valorInvestido * 0.006;
		else if (chances < cinquentaPorcento && chances >= trintaPorcento ) return valorInvestido * 0.03;
		else return valorInvestido * 0.05;
		
	}

	@Override
	public void setaValorInvestido(double valorDoSaldoAtual) {
		this.valorInvestido = valorDoSaldoAtual;
	}

}
