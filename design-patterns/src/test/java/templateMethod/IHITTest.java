package templateMethod;

import org.junit.Assert;
import org.junit.Test;

import common.Item;
import common.Orcamento;
import strategy.Imposto;

public class IHITTest {
	
	@Test
	public void testaTaxacaoMaxima() {
		Imposto ihit = new IHIT();
		Orcamento orcamento = new Orcamento(
				new Item("ps4", 600),
				new Item("ps4", 650));
		
		Assert.assertEquals(262.5, ihit.calculaAPartirDo(orcamento), 0.00);
	}
	
	@Test
	public void testaTaxacaoMinima() {
		Imposto ihit = new IHIT();
		Orcamento orcamento = new Orcamento(
				new Item("ps3", 500),
				new Item("ps4", 800));
		
		Assert.assertEquals(26, ihit.calculaAPartirDo(orcamento), 0.00);
	}

}
