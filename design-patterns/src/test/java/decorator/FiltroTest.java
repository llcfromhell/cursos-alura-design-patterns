package decorator;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import common.Conta;

public class FiltroTest {
	
	@Test
	public void testaQueUsaTodosOsFiltros() {
		
		Filtro filtro = new FiltroValorGrande(new FiltroMesCorrente(new FiltroValorPequeno()));
		
		List<Conta> listaFiltrada = filtro.filtraAPartirDas(Arrays.asList(
				new Conta("Dragonborn", 600000.66, new Date()),
				new Conta("Kajit", 666.66, LocalDate.of(2016, 12, 01)),
				new Conta("Commom Folk", 30, LocalDate.of(2016, 12, 01)),
				new Conta("Nord", 50.00, new Date()),
				new Conta("Dragon", 1000.00, new Date())));
		
		Assert.assertEquals(4, listaFiltrada.size());
		
	}

}
