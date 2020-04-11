package died.lab02.problema03;

public class PedidoPremium extends Pedido implements Comisionable {

	public PedidoPremium() {
		
	}
	
	protected boolean agregarProducto(Producto p) {
		if(cantProductos < 20) {
			productos.add(p);
			cantProductos++;
		} else {
			return false;
		}
		
		return true;
	}

	@Override
	public double precio() {
		double total = 0;
		if(cantProductos <= 5) {
			for(Producto p : productos) {
				if(p != null) {
					total += (p.costo * 1.20);
				}
			}
		} else if(cantProductos > 5 && cantProductos <=20){
			for(Producto p : productos) {
				if(p != null) {
					total += (p.costo * 1.30);
				}
			}
		}
		return total;
	}

	@Override
	public double comision() {
		
		if(fechaEntrega != null) {
			double total;
			
			total = (precio()*0.15);
			
			if(cantProductos > 10) {
				total += 50;
			}
			return total;
		} else {
			return 0;
		}
	}
}
