package decorator;

import java.util.List;
import java.util.stream.Collectors;

import common.Conta;

public class FiltroValorPequeno extends Filtro {

	public FiltroValorPequeno() {
		super();
	}

	public FiltroValorPequeno(Filtro outroFiltro) {
		super(outroFiltro);
	}

	@Override
	public List<Conta> filtra(List<Conta> contas) {
		return contas.stream()
				.filter(c -> c.getSaldo() < 100.00)
				.collect(Collectors.toList());
	}

}
