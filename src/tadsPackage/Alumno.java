package tadsPackage;

import java.util.HashMap;

public class Alumno {
	private String nombre;
	private String apellido;
	private String materia;
	private Integer nota;
	private Integer promedio;
	private String listaMateriasNotas;
	private String notaString;
	private HashMap <String, Integer> listaMaterias;
	
	public Alumno(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.materia = materia;
		this.nota = nota;
		promedio = 0;
		notaString = "";
		listaMaterias = new HashMap<>();

	}
	//crear Alumno
	public void agregarNuevaMateriaNota(String T1,Integer T2) {
		listaMaterias.put(T1,T2);
	}
	public String toString() {
		return " "+nombre.toString() + " "+apellido.toString() + " " + listaMateriasNotas;  //si mostramos solo y solo mostraria la referencia 
	}
	public Integer sumarNota(Integer nota) {
		return promedio += nota;
	}
	public Integer getPromedio() {
		return promedio;
	}
	public void setPromedio(Integer promedio) {
		this.promedio = promedio;
	}
	public Integer tamaListaMaterias() {
		return listaMaterias.size();
	}
	public String agregarlistaMateriasNotas(String materia, Integer nota) {
		notaString = nota.toString();
		return listaMateriasNotas = listaMateriasNotas +"{ " + " "+materia.toString() + " "+notaString + " }";
	}

}
