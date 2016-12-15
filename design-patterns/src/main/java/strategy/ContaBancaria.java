package strategy;

public class ContaBancaria {

	private String titular;
	private double saldo;

	public ContaBancaria de(String titular) {
		this.titular = titular;
		return this;
	}

	public ContaBancaria comSaldoInicialDe(double saldo) {
		
		this.saldo = saldo;
		return this;
	}
	
	public String getTitular() {
		return titular;
	}

	public double getValorDoSaldoAtual() {
		return new Double(saldo);
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}
	
}
