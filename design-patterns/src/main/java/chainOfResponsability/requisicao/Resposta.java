package chainOfResponsability.requisicao;

import common.Conta;

public interface Resposta {

	String responde(Requisicao req, Conta conta);

	void setProxima(Resposta resposta);

}
