package templateMethod;

import java.text.SimpleDateFormat;
import java.util.Date;

import chainOfResponsability.requisicao.Conta;

public class RelatorioComplexo extends Relatorio {

	@Override
	protected void imprimeCabecalho() {
		StringBuilder sb = new StringBuilder();
		sb.append("Banco: ");
		sb.append(this.banco.getNome());
		sb.append(" - ");

		sb.append("Endereço: ");
		sb.append(this.banco.getEndereco());
		sb.append(" - ");
		
		sb.append("Telefone: ");
		sb.append(this.banco.getTelefone());
		
		System.out.println(sb);
		
		
		
	}

	@Override
	protected void imprimeCorpo() {
		this.listaDeContas.forEach(this::imprimeDadosConta);
	}

	@Override
	protected void imprimeRodape() {
		StringBuilder sb = new StringBuilder();
		sb.append("Email: ");
		sb.append(this.banco.getEmail());
		sb.append(" - ");

		sb.append("Data: ");
		sb.append(new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date()));
		
		System.out.println(sb);
	}
	
	private void imprimeDadosConta(Conta conta) {
		StringBuilder sb = new StringBuilder();
		sb.append("Titular: ");
		sb.append(conta.getTitular());
		sb.append(" - Agência: ");
		sb.append(conta.getAgencia());
		sb.append(" - Conta: ");
		sb.append(conta.getNumeroConta());
		sb.append(" - Saldo: ");
		sb.append(conta.getSaldo());
		System.out.println(sb);
	}

}
