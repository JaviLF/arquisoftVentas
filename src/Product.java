
public abstract class Product {
	String nombre;
	int precio;
	int cantidad;
	
	abstract boolean estaDisponible(int cant);
	
	abstract int calcularTarifa(int cant);
	
	void setNombre(String nombre) {
		this.nombre=nombre;
	}
	String getNombre() {
		return this.nombre;
	}
	void setPrecio(int precio) {
		this.precio=precio;
	}
	int getPrecio() {
		return this.precio;
	}
	public void setCantidad(int cant) {
		this.cantidad=cant;
	}
	public int getCantidad() {
		return this.cantidad;
	}
}
