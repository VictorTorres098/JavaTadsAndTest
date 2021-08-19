package tadsPackage;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Conjunto elemento = new Conjunto();
		elemento.agregar(5);
		elemento.agregar(100);
		
		Conjunto <String> elemento2 = new Conjunto<>();
		elemento2.agregar("hola");
		elemento2.agregar("adios");
		
		//System.out.println(elemento2.dameUnElemento());
		
		Diccionario<String, Integer> testDic = new Diccionario<>();
		Diccionario<Integer, Alumno> dicAlum = new Diccionario<>();
		
		testDic.insertar("victor ", 23);
		
		//System.out.println(testDic.size());
		
//		for(int i = 0; i < dicAlum.size(); i++) {
//			System.out.println(dicAlum.returnElemento(i));
//		}
		//elemento.cantidadDeElementos();
		//System.out.print(elemento.cantidadDeElementos());
		//creo una tupla
//		Tupla tupla = new Tupla("personas",22);
//		System.out.println(tupla.getX());
//		System.out.println(tupla.getY());
		//Tupla tuplaInt = new Tupla(333,1222);
		//ejemplos de conjuntos con tuplas
		//elemento.agregar(new Tupla("personas",22));
		//ArrayList<Tupla<new Tupla(22,33)>> = new ArrayList<>();
//		ArrayList<Tupla<Integer,Integer>> tuplaInt = new ArrayList<Tupla<Integer,Integer>>();
//		tuplaInt.add(new Tupla(22,33));
//		ArrayList<Tupla<Integer,Integer>> coordenadas = new ArrayList();
//		Tupla tupla = new Tupla(33,33);
//		coordenadas.add(tupla);
//		Tupla tupla1 = new Tupla(344,3322);
//		coordenadas.add(tupla1);
//		System.out.println(coordenadas.get(0));
//		System.out.println(coordenadas.get(1));
//		PilaEnteros pila = new PilaEnteros();
//		pila.apilar(1);
		//Alumno victor = new Alumno("victor","torres");
		//dicAlum.insertar(1, victor);
		//System.out.println(dicAlum.obtener(1));
		
		
		
		//creo Sistemas Notas la cual recibe Un Integer que funciona como el numero de libreta
		//y por segundo parametro recibe el obj Alumno
		
		SistemasNotas<Integer, Alumno> lista1 = new SistemasNotas<>();

		//se crea el alumno
		Alumno fulanito = new Alumno("Fulanito", "Menganito");
		
		//se agrega al sistema el alumno
		lista1.agregar(2, fulanito);
		
		//Al Alumno se agregan las notas que se desea
		lista1.agregarNota(2, "programcion2", 10);
		lista1.agregarNota(2, "SOR", 6);
		
		//Imprime el Alumno con las materias y notas ingresadas 
		System.out.println(lista1.elemento(2));
		
		//Imprime el promedio del Alumno
		System.out.println(lista1.promedio(2));
	}

}
