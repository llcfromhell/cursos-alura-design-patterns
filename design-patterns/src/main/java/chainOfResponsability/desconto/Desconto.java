package chainOfResponsability.desconto;

import common.Orcamento;

public interface Desconto {
	
	public double aplicaDesconto(Orcamento orcamento);
	
	public void setProximo(Desconto desconto);
	
}
