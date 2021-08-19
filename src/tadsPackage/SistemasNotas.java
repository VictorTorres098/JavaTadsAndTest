package tadsPackage;

public class SistemasNotas<T1, T2> {
	private Diccionario<Integer, Alumno> lista;
	private Integer promedio; 
	
	
	public SistemasNotas () {
		lista = new Diccionario<>();
		this.promedio = promedio;
	}
	public void agregar(Integer libreta, Alumno alumno) {
		if(!pertenece(libreta)) {
			lista.insertar(libreta, alumno);
		}else {
			throw new RuntimeException("Ya exite el numero de libreta ingresado intente nuevamente");
		}
	}
	public void agregarNota(Integer libreta, String materia, Integer nota) {
		if(pertenece(libreta)) {
			lista.elemento(libreta).y.agregarNuevaMateriaNota(materia, nota);
			ingresarAlPromedio(libreta, nota);
			ingresarListaMN(libreta, materia, nota);
		}else {
			throw new RuntimeException("El numero de libreta no exite");
		}
	}
	public boolean pertenece(Integer libreta) {
		return lista.pertenece(libreta);
	}
	public Alumno elemento(Integer clave) {
		return lista.obtener(clave);
	}
	public Integer ingresarAlPromedio(Integer libreta, Integer nota) {
		return lista.elemento(libreta).y.sumarNota(nota);
	}
	public Integer promedio(Integer libreta) {
		return lista.elemento(libreta).y.getPromedio() / lista.elemento(libreta).y.tamañoListaMaterias();
	}
	public String ingresarListaMN(Integer libreta,String materia, Integer nota) {
		return lista.elemento(libreta).y.agregarlistaMateriasNotas(materia, nota);
	}
	
}
