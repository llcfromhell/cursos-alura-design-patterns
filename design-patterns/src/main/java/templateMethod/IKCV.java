package templateMethod;

import common.Orcamento;
import strategy.Imposto;

public class IKCV extends TemplateImpostoCondicional {

	
	public IKCV(Imposto outroImposto) {
		super(outroImposto);
	}
	
	public IKCV() {
		super();
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		
		boolean temProdutoValorMaior100 = orcamento.getItens().stream().anyMatch(o -> o.getValor() > 100.00);
		
		return (orcamento.getValorOrcamento() > 500.00 && temProdutoValorMaior100); 
	}
	
	
	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValorOrcamento() * 0.06;
	}
	

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValorOrcamento() * 0.10;
	}

}
