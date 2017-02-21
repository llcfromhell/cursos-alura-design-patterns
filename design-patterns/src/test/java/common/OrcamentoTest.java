package common;

import org.junit.Assert;
import org.junit.Test;

public class OrcamentoTest {

	@Test
	public void testaSeEncontraItensComOMesmoNome() {
		
		Orcamento orcamento = new Orcamento(
				new Item("pc", 1500),
				new Item("pc", 1800),
				new Item("servidor", 3000),
				new Item("pc", 1900));
		
		Assert.assertTrue(orcamento.temItemRepetido());
		
		
		Orcamento orcamentoSemRepetidos = new Orcamento(
				new Item("pc", 1500),
				new Item("mac", 1800),
				new Item("servidor", 3000),
				new Item("ps4 pro", 1900));
		
		Assert.assertFalse(orcamentoSemRepetidos.temItemRepetido());
		
	}
	
}
