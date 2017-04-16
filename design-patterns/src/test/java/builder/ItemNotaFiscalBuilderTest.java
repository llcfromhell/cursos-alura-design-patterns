package builder;

import org.junit.Assert;
import org.junit.Test;

public class ItemNotaFiscalBuilderTest {
	
	@Test
	public void testaQueCriouItemNotaFiscal() {
		
		ItemNotaFiscal itemNotaFiscal = new ItemNotaFiscalBuilder().comDescricao("gtx").comValor(1000.00).build();
		
		Assert.assertEquals("gtx", itemNotaFiscal.getDescricao());
		Assert.assertEquals(1000.00, itemNotaFiscal.getValor(), 0.00);
		
	}

}
