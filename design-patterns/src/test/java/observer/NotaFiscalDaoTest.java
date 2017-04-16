package observer;

import org.junit.Assert;
import org.junit.Test;

public class NotaFiscalDaoTest {
	
	@Test
	public void testaQueAlterouOStatus() {
	
		NotaFiscalObserver observer = new NotaFiscalDao();
		Assert.assertEquals(new Criado(), observer.getStatus());
		
		observer.executaAposCriarNota(null);
		Assert.assertEquals(new Executado(), observer.getStatus());
	}

}
