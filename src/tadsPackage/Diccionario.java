package tadsPackage;

import java.util.ArrayList;

public class Diccionario <T1, T2> {
	private ArrayList <Tupla <T1, T2>> elems; //defino una lista de tuplas 
	
	Conjunto<T1> claves; //defino un conjunto de claves
	
	public Diccionario() {
		elems = new ArrayList<>(); //inicializo la lista
		claves= new Conjunto<>();  //inicializo el conjunto
	}
	public void insertar(T1 clave, T2 valor) {
		if(!pertenece(clave)) { //si la clave no pertenece
			elems.add(new Tupla<>(clave,valor)); //agrego a la lista de elems la tupla con una clave y un valor
			claves.agregar(clave); //agrego la clave a el conjunto
		}
	}
	public void eliminar(T1 clave) {
		if(pertenece(clave)) {
			claves.eliminar(clave);
			elems.remove(elemento2(clave));
		}
	}
	public boolean pertenece(T1 clave) {
		return claves.pertenece(clave); //El conjunto ya tiene implementado el pertenece que devuelve un boolena si pertenece
	}
	public T2 obtener(T1 clave) {	
		if(pertenece(clave)) {		
			Tupla<T1, T2> aux = elemento2(clave); //creo una aux con el elemento de la clave 
			return aux.getY(); //retorno el elemento //get dato2 = y
		}
		throw new RuntimeException("Clave inexistente"); //si la clave no exite lanzo un Exception
	}
	public boolean vacio() {
		return claves.vacio(); //si claves esta vacio por lo tanto elems esta vacio
	}
	public Conjunto<T1> claves(){
		return claves(); //devuelvo el conjunto
	}
	public Tupla<T1, T2> elemento(T1 clave){ //!!!!! solo de prueba !!!!!!!!
		for(int i = 0; i < elems.size(); i++) { //recorro los elementos
			if(elems.get(i).getX().equals(clave)) {  //getdato1 = x //elemento dame la x y la x la comparo con clave //ojo equals
				return elems.get(i); 
			}
		}
		return null;
	}
	private Tupla<T1, T2> elemento2(T1 clave){
		for(int i = 0; i < elems.size(); i++) { //recorro los elementos
			if(elems.get(i).getX().equals(clave)) {  //getdato1 = x //elemento dame la x y la x la comparo con clave //ojo equals
				return elems.get(i); 
			}
		}
		return null;
	}
	public int size() {
		return elems.size();
	}
	public Tupla<T1, T2> returnElemento (int i){
		return elems.get(i);
	}
	public Tupla<T1, T2> dameTodosElementos(){
		for(int i = 0; i < elems.size(); i++) {
				return elems.get(i);
		}
		return null;
	}
	
}
