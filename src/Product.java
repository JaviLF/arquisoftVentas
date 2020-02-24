
public abstract class Product {
	String nombre="";
	int precio=0;
	int saldo=0;
	
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
}
