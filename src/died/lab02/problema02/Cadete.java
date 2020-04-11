package died.lab02.problema02;

import java.util.ArrayList;

public class Cadete {
	
	ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
	
	public Cadete() {
		
	}
	
	public void agregarPedido(Pedido p) {
		pedidos.add(p);
	}
	
	public double comisiones() {
		double total = 0;
		
		for(Pedido p : pedidos) {
			if(p != null) {
				total += p.comision();
			}
		}
		
		return total;
	}
}
