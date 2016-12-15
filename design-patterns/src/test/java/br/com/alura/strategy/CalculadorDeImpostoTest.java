package br.com.alura.strategy;

import org.junit.Assert;
import org.junit.Test;

import strategy.CalculadorDeImposto;
import strategy.Iccc;
import strategy.Icms;
import strategy.Iss;
import strategy.Orcamento;

public class CalculadorDeImpostoTest {

	@Test
	public void testaCalculoDoIss() {
		
		CalculadorDeImposto calculador = new CalculadorDeImposto();
		
		double impostoCalculado = calculador
			.dadoO(new Iss())
			.calculaImpostoDo(new Orcamento(100));
		
		Assert.assertEquals(6.0, impostoCalculado, 0.01);
		
	}
	
	@Test
	public void testaCalculoDoIcms() {
		
		CalculadorDeImposto calculador = new CalculadorDeImposto();
		
		double impostoCalculado = calculador
			.dadoO(new Icms())
			.calculaImpostoDo(new Orcamento(100));
		
		Assert.assertEquals(1.0, impostoCalculado, 0.01);
		
		double impostoCalculado1000 = calculador
				.dadoO(new Icms())
				.calculaImpostoDo(new Orcamento(1000));
			
		Assert.assertEquals(10.0, impostoCalculado1000, 0.01);
		
	}
	
	@Test
	public void testaCalculoDoIccc() {
		
		// menor que 1000
		CalculadorDeImposto calculador = new CalculadorDeImposto();
		
		double impostoCalculadoMenorQue1000 = calculador
			.dadoO(new Iccc())
			.calculaImpostoDo(new Orcamento(999));
		
		Assert.assertEquals(49.95, impostoCalculadoMenorQue1000, 0.01);
		
		// 1000 e 3000
		double impostoCalculado1000 = calculador
				.dadoO(new Iccc())
				.calculaImpostoDo(new Orcamento(1000));
			
		Assert.assertEquals(70.0, impostoCalculado1000, 0.01);
		
		// mais que 3000
		double impostoCalculado3001 = calculador
				.dadoO(new Iccc())
				.calculaImpostoDo(new Orcamento(3001));
			
		Assert.assertEquals(270.08, impostoCalculado3001, 0.01);
		
	}
	
}
