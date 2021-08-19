package test;

import static org.junit.Assert.*;

import org.junit.Test;

import tads.Fecha;

public class FechaTest {

	
	@Test
	public void happyPathTest() {
		Fecha fecha = new Fecha(5,12,1998);
		
		assertEquals(fecha.getDia(),(Integer) 5);
		assertEquals(fecha.getMes(),(Integer) 12);
		assertEquals(fecha.getAnio(),(Integer) 1998);
		
	}
	
	@Test(expected = RuntimeException.class)
	public void fechaInvalidaTest() {
		@SuppressWarnings("unused")
		Fecha fecha = new Fecha(12,30,1998);
	}
	
	@Test
	public void sumarFechasTest() {
		Fecha fecha = new Fecha(1,1,1);
		Fecha fecha2 = new Fecha(31,1,1);
		
		fecha.sumar(fecha2);
		
		assertEquals(fecha.getDia(),(Integer) 1);
		assertEquals(fecha.getMes(),(Integer) 3);
		assertEquals(fecha.getAnio(),(Integer) 2);
	}
	
	@Test(expected = RuntimeException.class)
	public void sumarFechasInvalidasTest() {
		Fecha fecha = new Fecha(5,5,9000);
		Fecha fecha2 = new Fecha(27,3,1998);
		
		fecha.sumar(fecha2);
	}

}
