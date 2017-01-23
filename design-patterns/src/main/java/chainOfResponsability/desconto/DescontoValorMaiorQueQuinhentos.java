package chainOfResponsability.desconto;

public class DescontoValorMaiorQueQuinhentos implements Desconto {

	Desconto proximo;
	
	@Override
	public double aplicaDesconto(Orcamento orcamento) {
		if (orcamento.getValorOrcamento() > 500) {
			return orcamento.getValorOrcamento() * 0.07;
		} else {
			return proximo.aplicaDesconto(orcamento);
		}
	}

	@Override
	public void setProximo(Desconto desconto) {
		proximo = desconto;
	}

}
