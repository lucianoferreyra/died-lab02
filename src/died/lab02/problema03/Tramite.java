package died.lab02.problema03;

import java.util.Date;

public class Tramite implements Comisionable {

	String descripcion, domicilio;
	Date fechaARealizar = new Date(); 
	Date fechaRealizado = new Date();
	
	public Tramite() {
		
	}
	
	public Tramite(String descripcion, String domicilio, Date fechaARealizar, Date fechaRealizado) {
		this.descripcion = descripcion;
		this.domicilio = domicilio;
		this.fechaARealizar = fechaARealizar;
		this.fechaRealizado = fechaRealizado;
	}
	
	public double comision() {
		Date actual = new Date();
		
		if(fechaRealizado.after(actual)) {
			return 20;
		} else {
			return 0;
		}
	}
}
