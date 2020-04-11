package died.lab02.problema01;

public class Coordenadas {
	
	double latitud, longitud;
	
	public Coordenadas() {
		
	}
	
	public Coordenadas(double latitud, double longitud) {
		this.latitud = latitud;
		this.longitud = longitud;
	}
	
	public boolean equals(Coordenadas c) {
		if(this.latitud == c.latitud && this.longitud == c.longitud) {
			return true;
		} else {
			return false;
		}
	}
	
	public String toString(Coordenadas c) {
		String cadena;
		cadena = "(";
		cadena += c.latitud;
		cadena += c.longitud;
		cadena += ")";
		
		return cadena;
	}
}
