
public abstract class Product {
	String nombre="";
	int precio=0;
	int saldo=0;
	
	boolean estaDisponible(int cant) {
		return false;
	}
	int calcularTarifa(int cant) {
		return 0;
	}
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
}
