package builder;

import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import observer.NotaFiscalObserver;

public class NotaFiscalBuilder {

	private String razao;
	private String cnpj;
	private String obs;
	private List<ItemNotaFiscal> itens;
	private double valorBruto;
	private double valorImpostos;
	private Date data;
	
	private Set<NotaFiscalObserver> observers = new HashSet<NotaFiscalObserver>();

	public NotaFiscalBuilder() {
	}
	
	public NotaFiscalBuilder comObserver(NotaFiscalObserver observer) {
		observers.add(observer);
		return this;
	}

	public NotaFiscalBuilder comRazaoSocial(String razao) {
		this.razao = razao;
		return this;
	}

	public NotaFiscalBuilder comCnpj(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}

	public NotaFiscalBuilder comObservacoes(String obs) {
		this.obs = obs;
		return this;
	}
	
	public NotaFiscalBuilder comData(Date data) {
		this.data = data;
		return this;
	}

	public NotaFiscalBuilder com(ItemNotaFiscal... itens) {
		this.itens = Arrays.asList(itens);
		this.valorBruto = this.itens.stream().mapToDouble(i -> i.getValor()).sum();
		this.valorImpostos = this.itens.stream().mapToDouble(i -> i.getValor() * 0.05).sum();
		return this;
	}

	public NotaFiscal build() {
		
		NotaFiscal notaFiscal = new NotaFiscal(razao, cnpj, data == null ? new Date() : data, valorBruto, valorImpostos, itens, obs);
		
		observers.forEach(o -> o.executaAposCriarNota(notaFiscal));
		
		return notaFiscal;
	}

}
