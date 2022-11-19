package testingN1E1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
/*
Crea una classe Java que insereixi en una llista ordenada els noms dels mesos de l'any.
Verifica amb jUnit que la llista té 12 posicions, que no és nul·la i que en la seva posició 8 conté el
 nom 'agost'. */

class AnyTest {

	@Test
	final void testGetLlistaMesos() {
		//fail("Not yet implemented"); // TODO
		ArrayList<String> llistaMesos = Any.getLlistaMesos();
		
		// Validem que té 12 posicions
		int actual = llistaMesos.size();
		Assertions.assertEquals(12, actual);
		
		// Validem que no és nula
		Assertions.assertNotNull(llistaMesos);
		
		// Validem posició 8
		String actual2 = llistaMesos.get(7); // el mes 8 correspon a l'index 7 en java
		Assertions.assertEquals("agost", actual2);
		
	}

}
