package tadsPackage;


public class Tupla<t1, t2> {
	t1 x; //son obj
	t2 y; 
	
	Tupla(t1 x, t2 y){
		this.x = x;
		this.y = y;
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
		return ""+x.toString() + ""+y.toString();  //si mostramos solo y solo mostraria la referencia 
	}													// con el metodo toString mostramos el obj
	Tupla<t1, t2> tupla;
}
