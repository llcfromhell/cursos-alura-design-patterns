package observer;

import builder.NotaFiscal;

public interface NotaFiscalObserver {

	public void executaAposCriarNota(NotaFiscal nf);
	
	public StatusNotaFiscalObserver getStatus();
	
}
