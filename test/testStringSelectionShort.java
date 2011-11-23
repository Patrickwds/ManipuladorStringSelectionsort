import static org.junit.Assert.*;

import org.junit.Test;


public class testStringSelectionShort {

	@Test
	public void manipularStringDeRatoRoeu() {
		String fraseFormatada = stringSelectionShort.selectionSort("O rato roeu a roupa do rei de roma");
		assertEquals("O a do de rei roeu rato roma roupa", fraseFormatada);
	}

	@Test
	public void manipularStringDeCegonhas() {
		String fraseFormatada = stringSelectionShort.selectionSort("Um pequeno jabuti xereta viu dez cegonhas felizes.");
		assertEquals("Um viu dez xereta jabuti pequeno cegonhas felizes.", fraseFormatada);
	}

	@Test
	public void manipularStringDoJoao() {
		String fraseFormatada = stringSelectionShort.selectionSort("A Maria compro pao na casa do Joao.");
		assertEquals("A na do pao casa Maria Joao. compro", fraseFormatada);
	}

	@Test
	public void manipularStringDoComecoGrande() {
		String fraseFormatada = stringSelectionShort.selectionSort("Carmelita Maria compro pao na casa do Joao.");
		assertEquals("na do pao casa Maria Joao. compro Carmelita", fraseFormatada);
	}
	@Test
	public void manipularStringDoFinalMenor() {
		String fraseFormatada = stringSelectionShort.selectionSort("Eu odeio os Jabutis malditos ha .");
		assertEquals(". os ha Eu odeio Jabutis malditos", fraseFormatada);
	}
}
