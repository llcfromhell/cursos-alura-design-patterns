package decorator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import common.Conta;

abstract class Filtro {
	
	private Filtro outroFiltro;
	
	public Filtro() { };
	public Filtro(Filtro outroFiltro) {
		this.outroFiltro = outroFiltro;
	}
	
	public List<Conta> filtraAPartirDas(List<Conta> contas) {
		
		Set<Conta> contasFiltradas = new HashSet<Conta>();
		
		contasFiltradas.addAll(filtra(Collections.unmodifiableList(contas)));
		
		if (outroFiltro != null) {
			contasFiltradas.addAll(outroFiltro.filtraAPartirDas(contas));
		}
		
		return Collections.unmodifiableList(new ArrayList<Conta>(contasFiltradas));
	}
	
    protected abstract List<Conta> filtra(List<Conta> contas);
}
