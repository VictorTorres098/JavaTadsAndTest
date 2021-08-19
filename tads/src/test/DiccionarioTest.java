package test;

import static org.junit.Assert.*;

import org.junit.Test;

import tads.Diccionario;

public class DiccionarioTest {
	
	@Test
	public void happyPathTest() {
		Diccionario dicc = new Diccionario();
		dicc.agregar("auto", "rojo y cuatro ruedas");
		dicc.agregar("computadora", "intel");
		dicc.agregar("auto", "rojo y tres ruedas");
		
		assertEquals(2, dicc.cantEntradas());
		assertEquals("rojo y tres ruedas",dicc.obtenerValor("auto"));
	}
}
