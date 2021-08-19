package tadsPackage;

public class SistemaInscripción <T1, T2> {
	private Diccionario<Integer, Alumno1> lista;
	
	
	public SistemaInscripción() {
		lista = new Diccionario<>();
	}
	public void agregarAlumno(Integer libreta, Alumno1 alumno) {
		if(!pertenece(libreta)) {
			lista.insertar(libreta, alumno);
		}else {
			throw new RuntimeException("Ya exite el numero de libreta ingresado intente nuevamente");
		}
	}
	public void incipcionMateria(Integer libreta, Materia materia) {
		if(pertenece(libreta)) {
			lista.elemento(libreta).y.inscipcionMateria(materia);
			lista.elemento(libreta).y.agregarListado(materia);
		}
	}
	public boolean pertenece (Integer libreta) {
		return lista.pertenece(libreta);
	}
	public String materiasDisponibles(Integer libreta) {
		return lista.elemento(libreta).y.mostrarMateriasDisponibles();
	}
}
