package chainOfResponsability.requisicao;

public interface Resposta {

	String responde(Requisicao req, Conta conta);

	void setProxima(Resposta resposta);

}
