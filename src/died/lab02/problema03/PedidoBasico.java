package died.lab02.problema03;

public class PedidoBasico extends Pedido implements Comisionable {
	public boolean express = false;
	
	public PedidoBasico() {
		
	}
	
	public void express() {
		express = true;
	}
	
	public boolean agregarProducto(Producto p) {
		if(cantProductos < 5) {
			productos.add(p);
			cantProductos++;
		} else {
			return false;
		}
		
		return true;
	}
	
	@Override
	public double precio() {
		double subtotal = 0, total = 0;
		
		if(express == true) {
			for(Producto p : productos) {
				if(p != null) {
					subtotal += (p.costo * 1.05);
				}
			}
			
			total = subtotal*1.20;
		} else {
			for(Producto p : productos) {
				if(p != null) {
					total += (p.costo * 1.05);
				}
			}
		}
		
		return total;
	}
	
	@Override
	public double comision() {
		if(fechaEntrega != null) {
			double total;
			
			total = (precio()*0.10);
			
			return total;
		} else {
			return 0;
		}
	}

}
