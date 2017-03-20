package decorator;

import org.junit.Assert;
import org.junit.Test;

import common.Item;
import common.Orcamento;
import strategy.Icms;
import strategy.Imposto;


public class ImpostoMuitoAltoTest {

	@Test
	public void testaQueCalculouDoisImpostos() {
		Imposto impostoMuitoAlto = new ImpostoMuitoAlto(new Icms());
		
		double expected = 420.00;
		
		Orcamento orcamento = new Orcamento(new Item("pc gamer", 2000.00));
		Assert.assertEquals(expected, impostoMuitoAlto.calculaAPartirDo(orcamento), 0.00);
		
	}

}
