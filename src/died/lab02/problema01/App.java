package died.lab02.problema01;

public class App {
	public static void main(String[] args) {
		
		Coordenadas c1 = new Coordenadas(-31.65, -60.72); //SE
		Coordenadas c2 = new Coordenadas(-31.62, -60.73);
		Coordenadas c3 = new Coordenadas(-31.55, -60.77); //NO
		Coordenadas c4 = new Coordenadas(-31.58, -60.75);
		
		Camino camino = new Camino();
		
		camino.agregar(c1); //SE
		camino.agregar(c2);
		camino.agregar(-31.55, -60.77); //NO
		camino.agregar(-31.58, -60.75);
		
		System.out.println(camino.buscar(c3, c1));
		
		System.out.println(camino.buscar(c2, 100));
		
		
	}
}
