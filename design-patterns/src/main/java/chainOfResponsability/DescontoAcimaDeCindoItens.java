package chainOfResponsability;

public class DescontoAcimaDeCindoItens implements Desconto {

	Desconto proximo;
	
	@Override
	public double aplicaDesconto(Orcamento orcamento) {

		if (orcamento.getItens().size() > 5) {
			return orcamento.getValorOrcamento() * 0.10; 
		} else {
			return proximo.aplicaDesconto(orcamento);
		}
	}

	@Override
	public void setProximo(Desconto desconto) {
		proximo = desconto;
	}

}
