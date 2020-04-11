package died.lab02.problema02;

public class App {

	public static void main(String[] args) {
		
		Producto p1 = new Producto("Gaseosa", 80);
		Producto p2 = new Producto("Cafe", 110);
		Producto p3 = new Producto("Leche", 50);
		Cadete c1 = new Cadete();
		Cadete c2 = new Cadete();
		
		PedidoBasico pedido = new PedidoBasico();
		pedido.express();
		PedidoPremium pedidoP = new PedidoPremium();
		
		pedido.agregarProducto(p1);
		pedido.agregarProducto(p2);
		pedido.agregarProducto(p3);
		
		pedidoP.agregarProducto(p1);
		pedidoP.agregarProducto(p2);
		pedidoP.agregarProducto(p3);
		
		c1.agregarPedido(pedido);
		c2.agregarPedido(pedidoP);
		
		pedido.entregado();
		pedidoP.entregado();
		
		System.out.println("Costo del pedido basico express: $" + pedido.precio());
		System.out.println("Comisiones del cadete 1: $" + c1.comisiones());
		System.out.println("Costo del pedido premium: $" + pedidoP.precio());
		System.out.println("Comisiones del cadete 2: $" + c2.comisiones());
		
		
	}

}
