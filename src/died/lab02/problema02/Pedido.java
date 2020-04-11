package died.lab02.problema02;

import java.util.ArrayList;
import java.time.LocalDate;

public abstract class Pedido {
	
	public int cantProductos = 0;
	public LocalDate fechaEntrega;
	ArrayList<Producto> productos = new ArrayList<Producto>();
	
	public abstract double precio();
	
	public abstract double comision();
	
	
}
