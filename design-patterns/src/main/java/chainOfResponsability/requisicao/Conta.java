package chainOfResponsability.requisicao;

public class Conta {

	private String titular;
	private double saldo;
	private String agencia;
	private String numeroConta;
	
	public Conta(String titular, double saldo) {
		this(titular, saldo, null, null);
	}
	
	public Conta(String titular, double saldo, String agencia, String numeroConta) {
		this.titular = titular;
		this.saldo = saldo;
		this.agencia = agencia;
		this.numeroConta = numeroConta;
	}

	public String getTitular() {
		return titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getAgencia() {
		return agencia;
	}

	public String getNumeroConta() {
		return numeroConta;
	}
	
	
	
}
