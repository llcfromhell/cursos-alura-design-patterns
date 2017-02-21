package chainOfResponsability.desconto;

import org.junit.Assert;
import org.junit.Test;

import common.Item;
import common.Orcamento;

public class DescontoAcimaDeCintoItensTest {

	@Test
	public void testaQueGeraDesconto() {
		
		DescontoAcimaDeCindoItens desconto = new DescontoAcimaDeCindoItens();
		desconto.setProximo(new SemDesconto());
		
		Orcamento orcamento = new Orcamento(
				new Item("Memoria DDR4", 250.00), 
				new Item("Placa Mãe", 350.00),
				new Item("CPU AMD Zen", 650.00),
				new Item("Gabinete Slim", 200.00),
				new Item("Razer Turret", 1000.00),
				new Item("GTX 1050 LP", 700.00));
		
		Assert.assertEquals(315.00, desconto.aplicaDesconto(orcamento), 0.01);
		
	}
	
}
