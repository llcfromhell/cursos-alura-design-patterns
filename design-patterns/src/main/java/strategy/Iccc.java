package strategy;

import common.Orcamento;

public class Iccc extends Imposto {

	
	public Iccc(Imposto outroImposto) {
		super(outroImposto);
	}

	public Iccc() {
		super();
	}

	@Override
	public double calculaImpostoDo(Orcamento orcamento) {
		
		double valor = orcamento.getValorOrcamento();
		double impostoCalculado = 0.00;
		
		if (valor < 1000.00) impostoCalculado = valor * 0.05;
		
		else if (valor >= 1000.00 && valor <= 3000.00) impostoCalculado = valor * 0.07;
		
		else if (valor > 3000.00) impostoCalculado = (valor * 0.08) + 30;
		
		return impostoCalculado;
		
	}

}
