package chainOfResponsability.requisicao;

import common.Conta;

public class RespostaXml implements Resposta {

	Resposta proxima;
	
	@Override
	public String responde(Requisicao req, Conta conta) {
		if (Formato.XML.equals(req.getFormato())) {
			StringBuilder sb = new StringBuilder();
			sb.append("<conta>");
			sb.append("<titular>");
			sb.append(conta.getTitular());
			sb.append("</titular>");
			sb.append("<saldo>");
			sb.append(conta.getSaldo());
			sb.append("</saldo>");
			sb.append("</conta>");
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
