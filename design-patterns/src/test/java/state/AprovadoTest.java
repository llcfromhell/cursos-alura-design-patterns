package state;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import common.Item;
import common.Orcamento;
import exception.ChangeEstadoOrcamentoException;

public class AprovadoTest {

	private Orcamento orcamento;
	private EstadoOrcamento estado;
	
	@Before
	public void buildOrcamentoAprovado() {
		orcamento = new Orcamento(new Item("GTX 1060", 1000.00));
		estado = new Aprovado();
	}
	
	@Test
	public void testaQueAplicouODesconto() {
		
		Assert.assertEquals(20.00, estado.aplicaODescontoNo(orcamento.getValorOrcamento()), 0.00);
	}
	
	@Test(expected=ChangeEstadoOrcamentoException.class)
	public void testaQueTentouAprovar() {
		estado.setAprovado();
	}
	
	@Test
	public void testaQueFinalizou() {
		Assert.assertTrue(estado.setFinalizado() instanceof Finalizado);
	}
	
	@Test(expected=ChangeEstadoOrcamentoException.class)
	public void testaQueTentouReprovar() {
		estado.setReprovado();
	}
	
}
