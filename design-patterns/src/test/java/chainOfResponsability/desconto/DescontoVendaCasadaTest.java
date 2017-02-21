package chainOfResponsability.desconto;

import org.junit.Assert;
import org.junit.Test;

import common.Item;
import common.Orcamento;

public class DescontoVendaCasadaTest {

	@Test
	public void testaQueAplicaDescontoVendaCasada() {
		
		Orcamento orcamento = new Orcamento(
				new Item("i1", 10.00), 
				new Item("Lapis", 10.00), 
				new Item("i3", 30.00), 
				new Item("i4", 10.00), 
				new Item("Caneta", 10.00),
				new Item("i6", 30.00));
		
		Desconto desc = new DescontoPorVendaCasada();
		desc.setProximo(new SemDesconto());
		
		Assert.assertEquals(5.00, desc.aplicaDesconto(orcamento), 0.01);
		
	}

	@Test
	public void testaQueNaoAplicaDescontoVendaCasada() {
		
		Orcamento orcamento = new Orcamento(
				new Item("i1", 10.00), 
				new Item("La", 10.00), 
				new Item("i3", 30.00), 
				new Item("i4", 10.00), 
				new Item("Ca", 10.00),
				new Item("i6", 30.00));
		
		Desconto desc = new DescontoPorVendaCasada();
		desc.setProximo(new SemDesconto());
		
		Assert.assertEquals(0.00, desc.aplicaDesconto(orcamento), 0.01);
		
	}
	
}
