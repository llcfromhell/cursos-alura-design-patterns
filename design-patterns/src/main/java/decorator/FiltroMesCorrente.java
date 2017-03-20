package decorator;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.List;
import java.util.stream.Collectors;

import common.Conta;

public class FiltroMesCorrente extends Filtro {

	public FiltroMesCorrente() {
		super();
	}

	public FiltroMesCorrente(Filtro outroFiltro) {
		super(outroFiltro);
	}

	@Override
	protected List<Conta> filtra(List<Conta> contas) {
		
		LocalDate today = LocalDate.now();
		YearMonth yearMonthOfToday = YearMonth.of(today.getYear(), today.getMonth());
		
		return contas.stream()
				.filter(c -> YearMonth.from(c.getDataAberturaAsLocalDate()).equals(yearMonthOfToday))
				.collect(Collectors.toList());
	}


}
