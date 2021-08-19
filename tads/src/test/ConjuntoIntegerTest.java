package test;

import static org.junit.Assert.*;

import org.junit.Test;

import tads.ConjuntoInteger;

public class ConjuntoIntegerTest {

	@Test
	public void happyPathTest() {
		ConjuntoInteger conjunto = new ConjuntoInteger();
		conjunto.agregar(1);
		conjunto.agregar(2);
		conjunto.agregar(3);
		conjunto.agregar(3);
		
		assertEquals( 3 ,conjunto.tamaño());
	}
	
	@Test
	public void unionTest() {
		ConjuntoInteger conjuntoA = new ConjuntoInteger();
		conjuntoA.agregar(1);
		conjuntoA.agregar(2);
		conjuntoA.agregar(3);
		
		ConjuntoInteger conjuntoB = new ConjuntoInteger();
		conjuntoB.agregar(5);
		conjuntoB.agregar(7);
		conjuntoB.agregar(2);
		
		ConjuntoInteger conjuntoC = new ConjuntoInteger();
		conjuntoC.agregar(1);
		conjuntoC.agregar(2);
		conjuntoC.agregar(3);
		conjuntoC.agregar(5);
		conjuntoC.agregar(7);
		//Test
		ConjuntoInteger ret = ConjuntoInteger.union(conjuntoA, conjuntoB);
		
		assertEquals(conjuntoC, ret);
	}

}
