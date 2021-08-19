package tads;

public class Fecha {
	private Integer dia;
	private Integer mes;
	private Integer anio;

	public Fecha(Integer dia, Integer mes, Integer anio) {
		if(dia > 31 || mes > 12) {
			throw new RuntimeException();
		}
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}

	public Integer getDia() {
		return dia;
	}

	public Integer getMes() {
		return mes;
	}

	public Integer getAnio() {
		return anio;
	}
	
	public void sumar(Fecha fecha) {
		Integer sumaDia = this.dia + fecha.getDia();
		if(sumaDia > 31) {
			this.dia = sumaDia - 31;
			this.mes++;
		}
		else {
			this.dia = sumaDia;
		}
		Integer sumaMes = this.mes + fecha.getMes();
		
		if(sumaMes > 12) {
			this.mes = sumaMes - 12;
			this.anio++;
		}
		else {
			this.mes = sumaMes;
		}
		
		this.anio = this.anio + fecha.getAnio();
		
		if(anio > 9999)
			throw new RuntimeException();
	}


}
