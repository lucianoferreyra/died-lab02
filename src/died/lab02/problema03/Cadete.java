package died.lab02.problema03;

import java.util.ArrayList;

public class Cadete {
	
	ArrayList<Comisionable> pedidos = new ArrayList<Comisionable>();
	
	public void agregarPedido(Comisionable p) {
		pedidos.add(p);
	}
	
	public double comisiones() {
		double total = 0;
		
		for(Comisionable p : pedidos) {
			if(p != null) {
				total += p.comision();
			}
		}
		
		return total;
	}
}
