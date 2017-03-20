package decorator;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import common.Conta;

public class FiltroMesCorrenteTest {
	
	@Test
	public void testaSeFiltraNoMesCorrente() {
		
		Filtro filtro = new FiltroMesCorrente();
		
		List<Conta> listaFiltrada = filtro.filtra(Arrays.asList(
				new Conta("Dragonborn", 666.66, new Date()),
				new Conta("Kajit", 666.66, LocalDate.of(2016, 12, 01)),
				new Conta("Nord", 200.00, new Date()),
				new Conta("Dragon", 1000.00, new Date())));
		
		Assert.assertEquals(3, listaFiltrada.size());
		
	}

}
