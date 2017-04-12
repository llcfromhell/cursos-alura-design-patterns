package templateMethod;

import org.junit.Assert;
import org.junit.Test;

import common.Item;
import common.Orcamento;
import strategy.Icms;
import strategy.Imposto;

public class IKCVTest {

	@Test
	public void testaMaximaTaxacao() {

		Orcamento orcamento = new Orcamento(new Item("PS4", 800.00));

		Imposto ikcv = new IKCV();

		Assert.assertEquals(80.00, ikcv.calculaAPartirDo(orcamento), 0.00);

	}

	@Test
	public void testaMinimaTaxacao() {

		Orcamento orcamento = new Orcamento(new Item("PS3", 500.00));

		Imposto ikcv = new IKCV();

		Assert.assertEquals(30.00, ikcv.calculaAPartirDo(orcamento), 0.00);

	}

	@Test
	public void testaIKCVComOutroImposto() {

		Orcamento orcamento = new Orcamento(new Item("PS3", 500.00));

		Imposto ikcv = new IKCV(new Icms());

		Assert.assertEquals(35.00, ikcv.calculaAPartirDo(orcamento), 0.00);

	}
}
