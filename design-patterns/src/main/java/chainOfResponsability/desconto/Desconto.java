package chainOfResponsability.desconto;

public interface Desconto {
	
	public double aplicaDesconto(Orcamento orcamento);
	
	public void setProximo(Desconto desconto);
	
}
