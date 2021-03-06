package templateMethod;

import org.junit.Assert;
import org.junit.Test;

import common.Item;
import common.Orcamento;
import strategy.Icms;
import strategy.Imposto;

public class ICCPTest {


	@Test
	public void testMaximaTaxacao() {
		
		Orcamento orcamento = new Orcamento(new Item("ps3", 500.00));
		
		Imposto iccp = new ICCP();
		
		Assert.assertEquals(35.00, iccp.calculaAPartirDo(orcamento), 0.00);
		
	}
	
	@Test
	public void testaComOutroImposto() {
		
		Orcamento orcamento = new Orcamento(new Item("ps3", 500.00));
		
		Imposto iccp = new ICCP(new Icms());
		
		Assert.assertEquals(40.00, iccp.calculaAPartirDo(orcamento), 0.00);
		
	}
	
}
