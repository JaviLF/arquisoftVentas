import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class VentasTest {

	@Test
	void agregarProductoTest() {
		Product product1= new Articulo("Cocoa",5,3);
		Venta venta1=new Venta();
		Assert.assertEquals("Cantidad no disponible", venta1.agregarProducto(product1,4));
		Assert.assertEquals("Producto agregado", venta1.agregarProducto(product1,2));
	}
	
	@Test
	void totalVentasTest() {
		Product product1= new Articulo("Cocoa",5,3);
		Product product2= new Servicio("Reparacion",6,12);
		Venta venta1=new Venta();
		venta1.agregarProducto(product1,2);
		venta1.agregarProducto(product2,10);
		Assert.assertEquals(190, venta1.totalVenta());
	}
}
