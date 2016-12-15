package strategy;

public class Iccc implements Imposto {

	@Override
	public double calculaAPartirDo(Orcamento orcamento) {
		
		double valor = orcamento.getValor();
		double impostoCalculado = 0.00;
		
		if (valor < 1000.00) impostoCalculado = valor * 0.05;
		
		else if (valor >= 1000.00 && valor <= 3000.00) impostoCalculado = valor * 0.07;
		
		else if (valor > 3000.00) impostoCalculado = (valor * 0.08) + 30;
		
		return impostoCalculado;
		
	}

}
