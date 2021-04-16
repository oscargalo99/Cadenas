package org.cuatrovientos.ed;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CadenaTest {

	Cadena cadena;
	
	@BeforeEach
	void setUp() throws Exception {
		cadena = new Cadena();
	}

	@Test
	void testLongitud() {
		int expected = 4;
		int actual = cadena.longitud("Hola");
		assertEquals(expected, actual, "Adding values");
	}
	
	@Test
	void testLongitudError() {
		int expected = 4;
		int actual = cadena.longitud("");
		assertEquals(expected, actual, "Adding values");
	}
	

	@Test
	void testVocales() {
		int expected = 2;
		int actual = cadena.vocales("Hola");
		assertEquals(expected, actual, "Adding values");
	}
	
	@Test
	void testVocalesError() {
		int expected = 2;
		int actual = cadena.vocales("");
		assertEquals(expected, actual, "Adding values");
	}

	@Test
	void testInvertir() {
		String expected = "aloh";
		String actual = cadena.invertir("hola");
		assertEquals(expected, actual, "Adding values");
	}
	
	@Test
	void testInvertirError() {
		String expected = "aloh";
		String actual = cadena.invertir("");
		assertEquals(expected, actual, "Adding values");
	}

	@Test
	void testContarLetra() {
		int expected = 1;
		int actual = cadena.contarLetra("Hola", 'a');
		assertEquals(expected, actual, "Adding values");
	}

	@Test
	void testContarLetraError() {
		int expected = 1;
		int actual = cadena.contarLetra("", 'a');
		assertEquals(expected, actual, "Adding values");
	}
	
}
