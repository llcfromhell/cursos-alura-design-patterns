package chainOfResponsability.requisicao;

public class RespostaPorCento implements Resposta {

	Resposta proxima;
	
	@Override
	public String responde(Requisicao req, Conta conta) {
		
		if (Formato.PORCENTO.equals(req.getFormato())) {
			StringBuilder sb = new StringBuilder();
			sb.append(conta.getTitular());
			sb.append("%");
			sb.append(conta.getSaldo());
			return sb.toString();
		} else {
			return proxima.responde(req, conta);
		}
		
	}

	@Override
	public void setProxima(Resposta resposta) {
		this.proxima = resposta;
	}

}
