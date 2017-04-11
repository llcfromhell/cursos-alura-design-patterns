package state;

import exception.ChangeEstadoOrcamentoException;

public class Aprovado implements EstadoOrcamento {

	private static final String MSG_REPROVADO = "Orçamento já APROVADO, não pode ser reprovado.";
	private static final String MSG_APROVADO = "Orçamento já APROVADO.";

	@Override
	public double aplicaODescontoNo(Double valorDoOrcamento) {
		return valorDoOrcamento * 0.02;
	}

	@Override
	public EstadoOrcamento setAprovado() {
		throw new ChangeEstadoOrcamentoException(MSG_APROVADO);
	}

	@Override
	public EstadoOrcamento setReprovado() {
		throw new ChangeEstadoOrcamentoException(MSG_REPROVADO);
	}

	@Override
	public EstadoOrcamento setFinalizado() {
		return new Finalizado();
	}

}
