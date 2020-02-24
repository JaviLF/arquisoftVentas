import java.util.ArrayList;

public class Venta {
	ArrayList<Product> listaProductos=new ArrayList<Product>();
	int totalVenta=0;
	
	String agregarProducto(Product producto,int cant) {
		if(producto.estaDisponible(cant)){
			Product productoAux=producto;
			
			productoAux.setCantidad(cant);
			listaProductos.add(productoAux);
			return "Producto agregado";
		}
		else
			return "Cantidad no disponible";
	}
	
	int totalVenta() {
		for(int i=0;i<listaProductos.size();i++) {
			Product productoAux=listaProductos.get(i);
			totalVenta=totalVenta+productoAux.calcularTarifa(productoAux.getCantidad());
		}
		return totalVenta;
	}
}
