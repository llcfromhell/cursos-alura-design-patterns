package builder;

public class ItemNotaFiscal {

	private String descricao;
	private Double valor;
	
	
	public ItemNotaFiscal(String descricao, Double valor) {
		super();
		this.descricao = descricao;
		this.valor = valor;
	}
	public String getDescricao() {
		return descricao;
	}
	public Double getValor() {
		return valor;
	}
	
	
	
}
