package tadsPackage;

import java.util.ArrayList;

public class Conjunto<T> {
	
	private ArrayList<T> elementos; //new se implementa en el contructor 
	
	private int actual;
	
	public Conjunto() {
		
		elementos = new ArrayList<T>(); 
		actual = 0;
	}
	public void agregar(T e) {
		if(!pertenece(e)) {
			elementos.add(e);
		}
	}
	public boolean pertenece(T e) {
		return elementos.contains(e);
	}
	public void eliminar (T e) {
		if(!pertenece(e)) {
			elementos.remove(e);
		}
	}
	public boolean vacio() {
		return elementos.size()==0;
	}
	public int cantidadDeElementos() {
		return elementos.size();
	}
	public T dameUnElemento() {
		T aux = null;
		while(!vacio()) {
			aux=elementos.get(actual);
			return aux;
		}
		actual++;
		if(actual==elementos.size()) {
			actual = 0;
		}
		return aux;
		
	}
	public Alumno dameTodosElementos(){
		return null;
	}
	@Override
	public boolean equals(Object o) {
		//si tengo que buscar la igualdad ===>
		boolean pertenece = true;
		if(o==null) {
			return false;
		}
		if(!(this.getClass()==o.getClass())) {
			return false;
		}
		
		Conjunto<T> temp = (Conjunto)o; //casteo
		if(this.cantidadDeElementos()==temp.cantidadDeElementos());
		
		for(int i = 0; i < this.cantidadDeElementos(); i++) {
			pertenece = pertenece && temp.pertenece(this.dameUnElemento());
		}
		return pertenece;
	}

}
