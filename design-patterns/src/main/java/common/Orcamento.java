package common;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

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
	
	public Stream<Item> getItensStream() {
		return this.getItens().stream();
	}
	
	public boolean temItemRepetido() {
		return getItensStream().filter(seOutroItemTemOMesmoNome()).count() > 0;
	}

	private Predicate<Item> seOutroItemTemOMesmoNome() {
		return new Predicate<Item>() {
			@Override
			public boolean test(Item f) {
				return getItensStream().anyMatch(p -> !p.equals(f) && p.getDescricao().equals(f.getDescricao()) );
			}
		};
	}
	
}
