package died.lab02.problema03;

import java.util.ArrayList;
import java.time.LocalDate;

public abstract class Pedido implements Comisionable {
	
	public int cantProductos = 0;
	public LocalDate fechaEntrega = LocalDate.now();
	ArrayList<Producto> productos = new ArrayList<Producto>();
	
	public abstract double precio();
	
	
}
