package observer;

import builder.NotaFiscal;

public class NotaFiscalEmailSender implements NotaFiscalObserver {

	private StatusNotaFiscalObserver status = new Criado();
	
	@Override
	public void executaAposCriarNota(NotaFiscal nf) {
		status = status.executa();
	}

	@Override
	public StatusNotaFiscalObserver getStatus() {
		return status;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NotaFiscalEmailSender other = (NotaFiscalEmailSender) obj;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}
	
	

}
