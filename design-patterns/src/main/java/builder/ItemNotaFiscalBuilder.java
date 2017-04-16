package builder;

public class ItemNotaFiscalBuilder {
	
	private String desc;
	private Double valor;
	
	public ItemNotaFiscalBuilder comDescricao(String desc) {
		this.desc = desc;
		return this;
	}

	public ItemNotaFiscalBuilder comValor(Double valor) {
		this.valor = valor;
		return this;
	}
	
	public ItemNotaFiscal build() {
		return new ItemNotaFiscal(desc, valor);
	}
}
