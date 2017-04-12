package templateMethod;

import java.util.Arrays;

import org.junit.Test;

import common.Conta;

public class RelatorioCompletoTest {

	@Test
	public void testaImpressao(){
		
		Relatorio relatorio = new RelatorioComplexo();
		
		relatorio.dadoO(new Banco("Morphin Bank", "66-77889900", "Alameda dos Anjos, S/N", "zordon@gogo.power.rangers"))
			.imprimeRelatorioDa(Arrays.asList(
					new Conta("Ranger Vermelho", 1000, "Alameda 1", "555"),
					new Conta("Ranger Azul", 200, "Alameda 1", "444"),
					new Conta("Ranger Preto", 300, "Alameda 1", "222"),
					new Conta("Ranger Rosa", 700, "Alameda 4", "111"),
					new Conta("Ranger Amarelo", 500, "Alameda 1", "333")));
	}
	
}
