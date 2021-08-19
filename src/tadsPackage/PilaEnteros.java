package tadsPackage;

import java.util.LinkedList;

public class PilaEnteros {
	private LinkedList<Integer> pila;

	public PilaEnteros() {
		super();
		this.pila = new LinkedList<Integer>() ;
	}
	public void apilar(Integer e) {
		pila.addLast(e);
	}
	public Integer desapilar() {
		return pila.removeLast();
	}
	public Integer tope() {
		return pila.getLast();
	}
	public boolean vacia() {
		return pila.isEmpty();
	}
	
	
}
