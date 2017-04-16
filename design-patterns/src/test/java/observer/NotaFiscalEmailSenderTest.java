package observer;

import org.junit.Assert;
import org.junit.Test;

public class NotaFiscalEmailSenderTest {
	
	@Test
	public void testaQueAlterouOStatus() {
	
		NotaFiscalObserver observer = new NotaFiscalEmailSender();
		Assert.assertEquals(new Criado(), observer.getStatus());
		
		observer.executaAposCriarNota(null);
		Assert.assertEquals(new Executado(), observer.getStatus());
	}

}
