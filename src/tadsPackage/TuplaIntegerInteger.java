package tadsPackage;

import java.util.ArrayList;

public class TuplaIntegerInteger <t1, t2>{
	t1 x;
	t2 y;
	//
	private ArrayList<TuplaIntegerInteger<Integer,Integer>> coordenadas1;
	
	public TuplaIntegerInteger(t1 x, t2 y) { 
		this.x=x;
		this.y=y;
	}

	public t1 getX() {
		return x;
	}

	public void setX(t1 x) {
		this.x = x;
	}

	public t2 getY() {
		return y;
	}

	public void setY(t2 y) {
		this.y = y;
	}
	public String toString() {
		return "x="+x.toString() + "y="+y.toString();  //si mostramos solo y solo mostraria la referencia 
	}
//	public void agregar(t1 x, t2 y) {
//		coordenadas1.add(new TuplaIntegerInteger(x,y));
//	}

	/*
	 * public void agregar(Integer x, Integer y) { coordenadas.add(new
	 * TuplaIntegerInteger(x,y)); } public int cantidadDeElemtos() { return
	 * coordenadas.size(); }
	 */
	Tupla<Integer, Integer> tupla;
	

}
