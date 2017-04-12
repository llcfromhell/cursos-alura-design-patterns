package templateMethod;

import java.util.List;

import common.Conta;

public abstract class Relatorio {
	
	protected Banco banco;
	protected List<Conta> listaDeContas;
	
	public Relatorio dadoO(Banco banco) {
		this.banco = banco;
		return this;
	}
	
	public void imprimeRelatorioDa(List<Conta> listaDeContas) {
		this.listaDeContas = listaDeContas;
		imprimeCabecalho();
		imprimeCorpo();
		imprimeRodape();
	}
	
	protected abstract void imprimeCabecalho();
	
	protected abstract void imprimeCorpo();
	
	protected abstract void imprimeRodape();
	
}
