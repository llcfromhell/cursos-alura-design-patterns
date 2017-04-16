package builder;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import observer.Executado;
import observer.NotaFiscalDao;
import observer.NotaFiscalEmailSender;
import observer.NotaFiscalObserver;

public class NotaFiscalBuilderTest {

	private static final String OBS = "New Cpu comes around";
	private static final String CNPJ = "666/9999";
	private static final String RAZAO = "Lorens Gaming";

	@Test
	public void testaQueConstroiUmaNotaFiscal() {

		NotaFiscal nota = new NotaFiscalBuilder()
				.comRazaoSocial(RAZAO)
				.comCnpj(CNPJ)
				.comObservacoes(OBS)
				.com(new ItemNotaFiscal("ryzen", 550.00), 
						new ItemNotaFiscal("mb", 450.00))
				.build();

		Assert.assertEquals(1000.00, nota.getValorBruto(), 0.00);
		Assert.assertEquals(22.5 + 27.5, nota.getImpostos(), 0.00);
		Assert.assertEquals(OBS, nota.getObservacoes());
		Assert.assertEquals(CNPJ, nota.getCnpj());
		Assert.assertEquals(RAZAO, nota.getRazaoSocial());

	}

	@Test
	public void testaQueExecutouOsObservadores() {

		NotaFiscalObserver observer = new NotaFiscalDao();
		NotaFiscalBuilder builder = new NotaFiscalBuilder()
				.comObserver(observer)
				.comRazaoSocial(RAZAO)
				.comCnpj(CNPJ)
				.comObservacoes(OBS)
				.com(new ItemNotaFiscal("ryzen", 550.00), 
						new ItemNotaFiscal("mb", 450.00));
		
		NotaFiscal nf = builder.build();
		
		Assert.assertEquals(new Executado(), observer.getStatus());

	}

}
