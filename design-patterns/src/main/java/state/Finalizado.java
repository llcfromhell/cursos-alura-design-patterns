package state;

import exception.ChangeEstadoOrcamentoException;

public class Finalizado implements EstadoOrcamento {

	private final String MSG = "Orçamento já finalizado";
	
	@Override
	public double aplicaODescontoNo(Double valorDoOrcamento) {
		return 0;
	}

	@Override
	public EstadoOrcamento setAprovado() {
		throw new ChangeEstadoOrcamentoException(MSG);
	}

	@Override
	public EstadoOrcamento setReprovado() {
		throw new ChangeEstadoOrcamentoException(MSG);
	}

	@Override
	public EstadoOrcamento setFinalizado() {
		throw new ChangeEstadoOrcamentoException(MSG);
	}

}
