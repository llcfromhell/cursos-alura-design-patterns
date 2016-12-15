package strategy;

public class RealizadorDeInvestimentos {
	
	private ContaBancaria conta;
	private Investimento investimento;

	public RealizadorDeInvestimentos paraA(ContaBancaria conta) {
		this.conta = conta;
		return this;
	}
	
	public RealizadorDeInvestimentos dadoO(Investimento investimento) {
		this.investimento = investimento;
		return this;
	}
	
	public void invistaOSaldoDaConta() {
		
		investimento.setaValorInvestido(conta.getValorDoSaldoAtual());
		conta.deposita(lucroSemImpostosDoInvestimento());
		
	}

	private Double lucroSemImpostosDoInvestimento() {
		return investimento.getValorRendido() * 0.75;  
	}

	public Double getValorDoSaldoAtual() {
		return conta.getValorDoSaldoAtual();
	}

}
