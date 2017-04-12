package common;

public class DescontoJaCalculadoException extends RuntimeException {

	public DescontoJaCalculadoException() {
		super("Desconto já calculado");
	}
	
}
