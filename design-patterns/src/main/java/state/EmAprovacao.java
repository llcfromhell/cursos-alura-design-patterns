package state;

import exception.ChangeEstadoOrcamentoException;

public class EmAprovacao implements EstadoOrcamento {

	private final String FINALIZADO_MSG = "Orçamento EM APROVAÇÃO. Não pode ser finalizado";
	
	@Override
	public double aplicaODescontoNo(Double valorDoOrcamento) {
		return valorDoOrcamento * 0.05;
	}

	@Override
	public EstadoOrcamento setAprovado() {
		return new Aprovado();
	}

	@Override
	public EstadoOrcamento setReprovado() {
		return new Reprovado();
	}

	@Override
	public EstadoOrcamento setFinalizado() {
		throw new ChangeEstadoOrcamentoException(FINALIZADO_MSG);
	}

}
