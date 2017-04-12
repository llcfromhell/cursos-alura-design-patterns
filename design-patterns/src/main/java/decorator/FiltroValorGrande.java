package decorator;

import java.util.List;
import java.util.stream.Collectors;

import common.Conta;

public class FiltroValorGrande extends Filtro {
	
	public FiltroValorGrande() {
		super();
	}

	public FiltroValorGrande(Filtro outroFiltro) {
		super(outroFiltro);
	}

	@Override
	protected List<Conta> filtra(List<Conta> contas) {
		
		double quinhentosMil = 500000.00;
		
		return contas.stream()
				.filter(c -> c.getSaldo() > quinhentosMil)
				.collect(Collectors.toList());
	}

}
