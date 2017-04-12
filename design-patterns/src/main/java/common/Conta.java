package common;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Conta {

	private String titular;
	private double saldo;
	private Date dataAbertura;
	
	public Conta(String titular, double saldo, Date dataAbertura) {
		this.titular = titular;
		this.saldo = saldo;
		this.dataAbertura = dataAbertura;
	}
	
	public Conta(String titular, double saldo, LocalDate dataAberturaAsLocalDate) {
		this(titular, saldo, getLocalDateAsDateFrom(dataAberturaAsLocalDate));
	}
	
	
 	public String getTitular() {
		return titular;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public Date getDataAbertura() {
		return dataAbertura;
	}
	
	public LocalDate getDataAberturaAsLocalDate() {
		LocalDate localDate = dataAbertura.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		return localDate;
	}
	
	private static Date getLocalDateAsDateFrom(LocalDate localDate) {
		return Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataAbertura == null) ? 0 : dataAbertura.hashCode());
		long temp;
		temp = Double.doubleToLongBits(saldo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((titular == null) ? 0 : titular.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (dataAbertura == null) {
			if (other.dataAbertura != null)
				return false;
		} else if (!dataAbertura.equals(other.dataAbertura))
			return false;
		if (Double.doubleToLongBits(saldo) != Double.doubleToLongBits(other.saldo))
			return false;
		if (titular == null) {
			if (other.titular != null)
				return false;
		} else if (!titular.equals(other.titular))
			return false;
		return true;
	}

	
	
	
	
}
