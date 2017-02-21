package chainOfResponsability.desconto;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import common.Item;
import common.Orcamento;

public class TestaVariosDescontos {
	
	private DescontoAcimaDeCindoItens d1 = new DescontoAcimaDeCindoItens();
	private DescontoValorMaiorQueQuinhentos d2 = new DescontoValorMaiorQueQuinhentos();

	@Before
	public void setUp() {
		d1.setProximo(d2);
		d2.setProximo(new SemDesconto());
	}
	
	@Test
	public void testaAcimaDeCincoItens() {
		
		Orcamento orcamento = new Orcamento(
				new Item("i1", 10.00), 
				new Item("i2", 10.00), 
				new Item("i3", 10.00), 
				new Item("i4", 10.00), 
				new Item("i5", 10.00),
				new Item("i6", 10.00));
		
		Assert.assertEquals(6.00, d1.aplicaDesconto(orcamento), 0.01);
		
	}
	
	@Test
	public void testaValorMaiorQueQuinhentos() {

		Orcamento orcamento = new Orcamento(new Item("GTX 1060", 1000.00));
		
		Assert.assertEquals(70.00, d1.aplicaDesconto(orcamento), 0.01);
		
	}

}
