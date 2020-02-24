import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class ProductosTest {

	@Test
	void articuloConstructorTest() {
		Product product1= new Articulo("Cocoa",5,1);
		Assert.assertEquals("Cocoa", product1.getNombre());
		Assert.assertEquals(5, product1.getPrecio());
		Assert.assertEquals(1, ((Articulo)product1).getSaldo());
	}
	
	@Test
	void articuloSetter() {
		Product product1= new Articulo();
		product1.setNombre("Cafe");
		product1.setPrecio(7);
		((Articulo)product1).setSaldo(3);
		Assert.assertEquals("Cafe", product1.getNombre());
		Assert.assertEquals(7, product1.getPrecio());
		Assert.assertEquals(3, ((Articulo)product1).getSaldo());
	}

}
