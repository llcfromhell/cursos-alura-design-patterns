package state;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import common.Item;
import common.Orcamento;
import exception.ChangeEstadoOrcamentoException;

public class EmAprovacaoTest {
	
	private Orcamento orcamento;
	private EstadoOrcamento estado;
	
	@Before
	public void buildOrcamentoAprovado() {
		orcamento = new Orcamento(new Item("GTX 1060", 1000.00));
		estado = new EmAprovacao();
	}
	
	@Test
	public void testaQueAplicouODesconto() {
		Assert.assertEquals(50.00, estado.aplicaODescontoNo(orcamento.getValorOrcamento()), 0.00);
	}
	
	@Test
	public void testaQueAprovou() {
		Assert.assertTrue( estado.setAprovado() instanceof Aprovado);
	}
	
	@Test
	public void testaQueReprovou() {
		Assert.assertTrue( estado.setReprovado() instanceof Reprovado);
	}
	
	@Test(expected=ChangeEstadoOrcamentoException.class)
	public void testaQueTentouFinalizar() {
		estado.setFinalizado();
	}

}
