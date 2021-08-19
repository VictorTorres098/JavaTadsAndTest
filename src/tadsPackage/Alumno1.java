package tadsPackage;

import java.util.ArrayList;

public class Alumno1 {
	private String nombre;
	private String apellido;
	private ArrayList <Materia> listaMaterias;
	private String listadoDeMatereriasinscriptas;
	private String listadoMateriasDiponibles;
	
	public Alumno1 (String nombre, String apellido) {
		listaMaterias = new ArrayList<>();
		this.nombre = nombre;
		this.apellido = apellido;
		listadoDeMatereriasinscriptas = " ";
		listadoMateriasDiponibles = " ";
	}
	public void inscipcionMateria(Materia materia) {
		if(materia.cupoDisponibles()>0)
			listaMaterias.add(materia);
	}
	public String agregarListado(Materia materia) {
		return listadoDeMatereriasinscriptas = listadoDeMatereriasinscriptas + "{" + materia.getMateria().toString() + " " + materia.getComision().toString() + "}" ;
	}
	public String mostrarMateriasDisponibles() {
		for (int i = 0; i < listaMaterias.size(); i++) {
			if(listaMaterias.get(i).cupoDisponibles()>0)
				listadoMateriasDiponibles = listadoMateriasDiponibles + " " + listaMaterias.get(i).toString();
		}
		return listadoMateriasDiponibles;
	}
	
}
