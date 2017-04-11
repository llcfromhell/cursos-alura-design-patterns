package state;

public interface EstadoOrcamento {

	public double aplicaODescontoNo(Double valorDoOrcamento);
	
	public EstadoOrcamento setAprovado();
	public EstadoOrcamento setReprovado();
	public EstadoOrcamento setFinalizado();
	
}
