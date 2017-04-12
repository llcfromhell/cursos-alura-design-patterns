package chainOfResponsability.requisicao;

import org.junit.Test;

import org.junit.Assert;

public class TestaRespostaRequisicao {

	private String contaPorCento = "Andy Black%666.0";
	private String contaXml = "<conta><titular>Matt Heafy</titular><saldo>666.0</saldo></conta>";
	private String contaCsv = "Adrian Smith,666.0";
	
	@Test
	public void testaQueRespondeXml() {
		RespostaXml respXml = new RespostaXml();
		Requisicao req = new Requisicao(Formato.XML);
		Conta conta = new Conta("Matt Heafy", 666.00, "Snow", "7");
		Assert.assertEquals(contaXml, respXml.responde(req, conta));
	}
	
	@Test
	public void testaQueRespondeCsv() {
		RespostaCsv respCsv = new RespostaCsv();
		Requisicao req = new Requisicao(Formato.CSV);
		Conta conta = new Conta("Adrian Smith", 666.00);
		Assert.assertEquals(contaCsv, respCsv.responde(req, conta));
	}
	
	@Test
	public void testaQueRespondePorcento() {
		RespostaPorCento respPorCento = new RespostaPorCento();
		Requisicao req = new Requisicao(Formato.PORCENTO);
		Conta conta = new Conta("Andy Black", 666.00);
		Assert.assertEquals(contaPorCento, respPorCento.responde(req, conta));
	}
	
	@Test
	public void testaChain() {
		RespostaPorCento respPorCento = new RespostaPorCento();
		RespostaCsv respCsv = new RespostaCsv();
		RespostaXml respXml = new RespostaXml();
		
		respXml.setProxima(respPorCento);
		respPorCento.setProxima(respCsv);

		Requisicao reqPorcento = new Requisicao(Formato.PORCENTO);
		Conta conta1 = new Conta("Andy Black", 666.00);
		Assert.assertEquals(contaPorCento, respXml.responde(reqPorcento, conta1));
		
		Requisicao reqCsv = new Requisicao(Formato.CSV);
		Conta conta2 = new Conta("Adrian Smith", 666.00);
		Assert.assertEquals(contaCsv, respXml.responde(reqCsv, conta2));
		
		Requisicao reqXml = new Requisicao(Formato.XML);
		Conta conta3 = new Conta("Matt Heafy", 666.00);
		Assert.assertEquals(contaXml, respXml.responde(reqXml, conta3));
		
	}
}
