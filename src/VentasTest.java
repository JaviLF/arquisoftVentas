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

}
