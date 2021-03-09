package oscar.gestion;
import java.util.*;
import oscar.facturacion.*;
import oscar.facturacion.Producto.Impuesto;



public class ejercicio3 {
		
	static Producto producto;
	static Factura factura;
	static Impuesto impuestos;
	static Date fechaRealizacion = new Date;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		List <Producto> productos = new ArrayList<>();
		List <Producto> productosBorrador; 
		
		
		int random;
		
		
		producto = new Producto(0.75 , "Leche" , impuestos = Impuesto.REDUCIDO);
		productos.add(producto);
		
		producto = new Producto(0.50 , "Pan" , impuestos = Impuesto.SUPERREDUCIDO);
		productos.add(producto);
		
		producto = new Producto(8.99 , "Salmon", impuestos = Impuesto.REDUCIDO);
		productos.add(producto);
		
		producto = new Producto(2.95 , "Aguacates", impuestos = Impuesto.NORMAL);
		productos.add(producto);
		
		producto = new Producto(1.20 , "Friegasuelos", impuestos = Impuesto.NORMAL);
		productos.add(producto);
		
		producto = new Producto(0.56 , "Cerveza", impuestos = Impuesto.NORMAL);
		productos.add(producto);
		
		producto = new Producto(1.45 , "Sandia", impuestos = Impuesto.SUPERREDUCIDO);
		productos.add(producto);
		
		for (int i = 0; i < 5; i++) 
		{
			int random2 = ((int) (Math.random()*7));
			
			productosBorrador = new ArrayList<>();
			
			for(int x = random2; x < productos.size(); x += random2 + 1)
			{
				productosBorrador.add(productos.get(x));
			}
			factura = new Factura(i+1,productosBorrador, fechaRealizacion);
			facturas.add(factura);
		}
		for (Factura f:facturas)
		{
			f.visual();
		}
	}
}
		
		