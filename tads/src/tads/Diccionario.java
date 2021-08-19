package tads;

import java.util.ArrayList;

public class Diccionario {
	//Que estructura utilizamos acá?
	private ArrayList<TuplaStrStr> entradas;
	
	public Diccionario() {
		entradas = new ArrayList<TuplaStrStr>();
	}
	
	public void agregar(String clave, String significado) {
		//Entrada del diccionario
		TuplaStrStr entrada = new TuplaStrStr(clave, significado);
		if(existeEntrada(entrada)) {
			//reemplazo
		}
		else {
			entradas.add(entrada);
		}
	}
	// O(n)
	public String obtenerValor(String clave) {
		for(TuplaStrStr entrada: entradas) {
			if(entrada.getX().equals(clave))
				return entrada.getY();
		}
		return null;
	}

	public int cantEntradas() {
		return entradas.size();
	}
	
	private boolean existeEntrada(TuplaStrStr entr) {
		for(TuplaStrStr entrada: entradas) {
			if(entrada.getX().equals(entr.getX()))
				return true;
		}
		return false;
	}
}
