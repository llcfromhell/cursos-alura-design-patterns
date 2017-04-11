package state;

import exception.ChangeEstadoOrcamentoException;

public class Reprovado implements EstadoOrcamento {

	private static final String APROVADO_MSG = "Orçamento já REPROVADO, não pode ser aprovado.";
	private static final String REPROVADO_MSG = "Orçamento já REPROVADO.";

	@Override
	public double aplicaODescontoNo(Double valorDoOrcamento) {
		return 0;
	}

	@Override
	public EstadoOrcamento setAprovado() {
		throw new ChangeEstadoOrcamentoException(APROVADO_MSG);
	}

	@Override
	public EstadoOrcamento setReprovado() {
		throw new ChangeEstadoOrcamentoException(REPROVADO_MSG);
	}

	@Override
	public EstadoOrcamento setFinalizado() {
		return new Finalizado();
	}

}
