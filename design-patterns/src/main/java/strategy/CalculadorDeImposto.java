package strategy;

public class CalculadorDeImposto {

	private Imposto imposto;
	
	public CalculadorDeImposto dadoO(Imposto imposto) { 
		this.imposto = imposto;
		return this;
	}
	
	public double calculaImpostoDo(Orcamento orcamento) {
		return imposto.calculaAPartirDo(orcamento);
	}
	
}
