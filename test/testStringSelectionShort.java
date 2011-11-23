import static org.junit.Assert.*;

import org.junit.Test;


public class testStringSelectionShort {

	@Test
	public void deveOrdenarTest() {
		String linhas = stringSelectionShort.selectionSort("Eu odeio os jabutis");
		assertEquals("Eu os odeio jabutis",linhas);

}
	
	@Test
	public void deveOrdenarTest2() {
		String linhas = stringSelectionShort.selectionSort("O rato roeu a roupa do rei de roma");
		assertEquals("O a do de rei rato roeu roma roupa",linhas);

}
	
	@Test
	public void deveOrdenarTest3() {
		String linhas = stringSelectionShort.selectionSort("h hhhh hhhh h hhhhh hh hhh hh hhhh");
		assertEquals("h h hh hh hhh hhhh hhhh hhhh hhhhh",linhas);

}

}
