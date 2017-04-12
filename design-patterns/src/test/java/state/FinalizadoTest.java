package state;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import common.Item;
import common.Orcamento;
import exception.ChangeEstadoOrcamentoException;

public class FinalizadoTest {

	private Orcamento orcamento;
	private EstadoOrcamento estado;

	@Before
	public void buildOrcamentoAprovado() {
		orcamento = new Orcamento(new Item("GTX 1060", 1000.00));
		estado = new Finalizado();
	}
	
	@Test
	public void testaQueAplicouODesconto() {
		Assert.assertEquals(00.00, estado.aplicaODescontoNo(orcamento.getValorOrcamento()), 0.00);
	}
	
	@Test(expected=ChangeEstadoOrcamentoException.class)
	public void testaQueTentouAprovar() {
		estado.setAprovado();
	}
	
	@Test(expected=ChangeEstadoOrcamentoException.class)
	public void testaQueTentouReprovar() {
		estado.setReprovado();
	}
	
	@Test(expected=ChangeEstadoOrcamentoException.class)
	public void testaQueTentouFinalizar() {
		estado.setFinalizado();
	}
}
