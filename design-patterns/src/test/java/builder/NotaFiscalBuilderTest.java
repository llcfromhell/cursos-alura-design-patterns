package builder;

import java.util.Date;

import org.junit.Assert;

public class NotaFiscalBuilderTest {

	private static final String OBS = "New Cpu comes around";
	private static final String CNPJ = "666/9999";
	private static final String RAZAO = "Lorens Gaming";

	public void testaQueConstroiUmaNotaFiscal() {
		
		NotaFiscal nota = new NotaFiscalBuilder()
				.comRazaoSocial(RAZAO)
				.comCnpj(CNPJ)
				.observacoes(OBS)
				.comItens(new ItemNotaFiscal("ryzen", 550.00), new ItemNotaFiscal("mb", 450.00))
				.build();
		
		Assert.assertEquals(1000.00, nota.getValorBruto(), 0.00);
		Assert.assertTrue(nota.getDataDeEmissao().getTime().equals(new Date()));
		Assert.assertEquals(OBS, nota.getObservacoes());
		Assert.assertEquals(CNPJ, nota.getCnpj());
		Assert.assertEquals(CNPJ, nota.getCnpj());
		
	}
	
}
