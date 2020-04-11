package died.lab02.problema01;

import java.util.ArrayList;
import java.lang.Math;

public class Camino {

		ArrayList<Coordenadas> camino = new ArrayList<Coordenadas>();
		
		public Camino() {
			
		}
		
		public void agregar(Coordenadas x) {
			camino.add(x);
		}
		
		public void agregar(double lat, double lng) {
			Coordenadas c = new Coordenadas(lat, lng);
			
			camino.add(c);
		}
		
		public void agregar(int mtsLt, int mtsLn) {
			double lat, lng;
			lat = (mtsLt/6378000)*(180/Math.PI);
			lng = (mtsLt/6378000)*(180/Math.PI)/(Math.cos(lat * Math.PI/180));
			
			Coordenadas c = new Coordenadas(lat, lng);
			
			camino.add(c);			
		}
		
		public ArrayList<Coordenadas> buscar(Coordenadas no, Coordenadas se){
			ArrayList<Coordenadas> dentro = new ArrayList<Coordenadas>();
			
			for(Coordenadas c : camino) {
				if(c.latitud < no.latitud && c.latitud > se.latitud && c.longitud < se.longitud && c.longitud > no.longitud) {
					dentro.add(c);
				}
			}
			
			return dentro;
		}
		
		public ArrayList<Coordenadas> buscar(Coordenadas c, int mts){
	
			Camino aux = new Camino();
			
			aux.agregar(c.latitud+mts, c.longitud-mts); 
			aux.agregar(c.latitud-mts, c.longitud+mts);
			
			return (buscar(aux.camino.get(0), aux.camino.get(1)));
		}
} 
