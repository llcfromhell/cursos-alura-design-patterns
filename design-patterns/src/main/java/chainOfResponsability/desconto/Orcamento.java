package chainOfResponsability.desconto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Orcamento {

	private List<Item> itens = new ArrayList<>();
	
	public Orcamento(Item... itens) {
		this.itens = Arrays.asList(itens);
	}
	
	public double getValorOrcamento() {
		return itens.stream().mapToDouble(Item::getValor).sum();
	}
	
	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}
	
}
