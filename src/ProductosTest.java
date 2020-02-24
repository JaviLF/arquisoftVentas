import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class ProductosTest {

	@Test
	void articuloConstructorTest() {
		Product product1= new Articulo("Cocoa",5,1);
		Assert.assertEquals("Cocoa", product1.getNombre());
		Assert.assertEquals(5, product1.getPrecio());
		Assert.assertEquals(1, ((Articulo)product1).getCantidad());
	}
	@Test
	void articuloSetter() {
		Product product1= new Articulo();
		product1.setNombre("Cafe");
		product1.setPrecio(7);
		((Articulo)product1).setCantidad(3);
		Assert.assertEquals("Cafe", product1.getNombre());
		Assert.assertEquals(7, product1.getPrecio());
		Assert.assertEquals(3, ((Articulo)product1).getCantidad());
	}
	@Test
	void articuloDisponibilidad() {
		Product product1= new Articulo();
		((Articulo)product1).setCantidad(3);
		Assert.assertEquals(false, ((Articulo)product1).estaDisponible(5));
		Assert.assertEquals(true, ((Articulo)product1).estaDisponible(3));
	}
	@Test
	void articuloCalcularTarifa() {
		Product product1= new Articulo("Cocoa",5,1);
		Assert.assertEquals(15, ((Articulo)product1).calcularTarifa(3));
	}
	
	@Test
	void servicioConstructorTest() {
		Product product1= new Servicio("Reparacion",6,12);
		Assert.assertEquals("Reparacion", product1.getNombre());
		Assert.assertEquals(6, product1.getPrecio());
		Assert.assertEquals(12, ((Servicio)product1).getCantidad());
	}
	@Test
	void servicioSetter() {
		Product product1= new Servicio("Reparacion",6,12);
		product1.setNombre("Atencion");
		product1.setPrecio(7);
		((Servicio)product1).setCantidad(5);
		Assert.assertEquals("Atencion", product1.getNombre());
		Assert.assertEquals(7, product1.getPrecio());
		Assert.assertEquals(5, ((Servicio)product1).getCantidad());
	}
}
