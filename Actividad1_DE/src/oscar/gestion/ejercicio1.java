package oscar.gestion;
import java.util.*;
import oscar.facturacion.*;

public class ejercicio1 {
		
	static Producto producto;
	static Factura factura;
	static impuesto impuestos[]
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		List <Producto> productos = new ArrayList<>();
		
		
		producto = new Producto(0.75 , "Leche");
		productos.add(producto);
		
		producto = new Producto(0.50 , "Pan");
		productos.add(producto);
		
		producto = new Producto(8.99 , "Salmon");
		productos.add(producto);
		
		producto = new Producto(2.95 , "Aguacates");
		productos.add(producto);
		
		producto = new Producto(1.20 , "Friegasuelos");
		productos.add(producto);
		
		producto = new Producto(0.56 , "Cerveza");
		productos.add(producto);
		
		producto = new Producto(1.45 , "Sandia");
		productos.add(producto);
		
		factura = new Factura(0 , productos); 
		factura.visual();
		
			
	}
	
		
		
		
		

	}


