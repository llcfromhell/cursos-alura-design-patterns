package br.com.alura.strategy;

import org.junit.Assert;
import org.junit.Test;

import strategy.ContaBancaria;
import strategy.InvestimentoArrojado;
import strategy.InvestimentoConservador;
import strategy.InvestimentoModerado;
import strategy.RealizadorDeInvestimentos;

public class RealizadorDeInvestimentosTest {

	@Test
	public void testaInvestimentoConservador() {

		RealizadorDeInvestimentos realizador = new RealizadorDeInvestimentos()
				.paraA(new ContaBancaria().de("Ross").comSaldoInicialDe(100.00));

		realizador.dadoO(new InvestimentoConservador()).invistaOSaldoDaConta();

		Assert.assertEquals(100.60, realizador.getValorDoSaldoAtual(), 0.01);

	}

	@Test
	public void testaInvestimentoModerado() {

		RealizadorDeInvestimentos realizador = new RealizadorDeInvestimentos()
				.paraA(new ContaBancaria().de("Ross").comSaldoInicialDe(100.00));

		realizador.dadoO(new InvestimentoModerado()).invistaOSaldoDaConta();

		Assert.assertTrue( (realizador.getValorDoSaldoAtual() == 101.875 || realizador.getValorDoSaldoAtual() == 100.525) );

	}

	@Test
	public void testaInvestimentoArrojado() {
		
		RealizadorDeInvestimentos realizador = new RealizadorDeInvestimentos()
				.paraA(new ContaBancaria().de("Ross").comSaldoInicialDe(100.00));

		realizador.dadoO(new InvestimentoArrojado()).invistaOSaldoDaConta();

		Assert.assertTrue( (realizador.getValorDoSaldoAtual() == 100.45 
				|| realizador.getValorDoSaldoAtual() == 103.75
				|| realizador.getValorDoSaldoAtual() == 102.25) );
		
	}

}
