package decorator;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import common.Conta;

public class FiltroValorPequenoTest {
	
	@Test
	public void testaQueFiltraValoresPequenos() {
		Filtro filtro = new FiltroValorPequeno();
		
		List<Conta> listaFiltrada = filtro.filtra(Arrays.asList(
				new Conta("Dragonborn", 666.66, new Date()),
				new Conta("Kajit", 50.66, LocalDate.of(2016, 12, 01)),
				new Conta("Nord", 200.00, new Date()),
				new Conta("Dragon", 40.00, new Date())));
		
		Assert.assertEquals(2, listaFiltrada.size());
	}
	
}
