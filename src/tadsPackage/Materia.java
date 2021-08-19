package tadsPackage;

public class Materia {
	private String materia;
	private String comision;
	private Integer cupoDisponible;
	
	public Materia(String materia, String comision) {
		this.materia = materia;
		this.comision = comision;
		this.cupoDisponible = 44;
	}
	public Integer cupoDisponibles() {
		return cupoDisponible;
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public String getComision() {
		return comision;
	}
	public void setComision(String comision) {
		this.comision = comision;
	}
	

}
