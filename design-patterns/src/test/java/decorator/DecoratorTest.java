package decorator;

import org.junit.Assert;
import org.junit.Test;

import common.Item;
import common.Orcamento;
import strategy.Iccc;
import strategy.Icms;
import strategy.Imposto;
import templateMethod.ICCP;

public class DecoratorTest {

	@Test
	public void testaQueDoisImpostosForamCalculados() {
		
		Imposto impostoComOutroImposto = new Iccc(new Icms());
		
		double expected = 80.00;
		
		Orcamento orcamento = new Orcamento(new Item("gtx 1060", 1000.0));
		Assert.assertEquals(expected, impostoComOutroImposto.calculaAPartirDo(orcamento) , 0.00);
		
	}
	
	@Test
	public void testaQueTresImpostosForamCalculados() {
		
		Imposto impostoComOutroImposto = new Iccc(new Icms(new ICCP()));
		
		double expected = 150.00;
		
		Orcamento orcamento = new Orcamento(new Item("gtx 1060", 1000.0));
		Assert.assertEquals(expected, impostoComOutroImposto.calculaAPartirDo(orcamento) , 0.00);
		
	}
	
	
	
}
