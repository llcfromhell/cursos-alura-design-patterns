package templateMethod;

import chainOfResponsability.requisicao.Conta;

public class RelatorioSimples extends Relatorio {

	@Override
	protected void imprimeCabecalho() {
		imprimeNomeTelefoneBanco();
	}

	@Override
	protected void imprimeCorpo() {
		this.listaDeContas.forEach(this::imprimeDadosConta);
	}

	@Override
	protected void imprimeRodape() {
		imprimeNomeTelefoneBanco();
	}
	
	private void imprimeDadosConta(Conta conta) {
		StringBuilder sb = new StringBuilder();
		sb.append("Titular: ");
		sb.append(conta.getTitular());
		sb.append(" - Saldo: ");
		sb.append(conta.getSaldo());
		System.out.println(sb);
	}
	
	private void imprimeNomeTelefoneBanco() {
		StringBuilder sb = new StringBuilder();
		sb.append("Banco: ");
		sb.append(this.banco.getNome());
		sb.append(" - Telefone: ");
		sb.append(this.banco.getTelefone());
		System.out.println(sb);
	}

}
