package died.lab02.problema03;

import java.util.Date;


public class App {

	public static void main(String[] args) {
		Producto p1 = new Producto("Gaseosa", 80);
		Producto p2 = new Producto("Cafe", 110);
		Producto p3 = new Producto("Leche", 50);
		Cadete c1 = new Cadete();
		Tramite t1 = new Tramite("Pago EPE", "Salta 10", new Date(java.lang.System.currentTimeMillis()-1000), new Date(java.lang.System.currentTimeMillis()-1000000));
		
		PedidoPremium pedido = new PedidoPremium();
		
		pedido.agregarProducto(p1);
		pedido.agregarProducto(p2);
		pedido.agregarProducto(p3);
		
		c1.agregarPedido(pedido);
		c1.agregarPedido(t1);
		
		System.out.println("Costo del pedido: $" + pedido.precio());
		System.out.println("Comisiones del cadete: $" + c1.comisiones());
		
	}

}
