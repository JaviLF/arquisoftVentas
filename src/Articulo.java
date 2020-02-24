
public class Articulo extends Product{
	int cantidad;
	
	Articulo(){
		this.nombre=" ";
		this.precio=0;
		this.cantidad=0;
	}
	Articulo(String nombre,int precio, int cant){
		this.nombre=nombre;
		this.precio=precio;
		this.cantidad=cant;
	}
	
	public void setCantidad(int cant) {
		this.cantidad=cant;
	}
	public int getCantidad() {
		return this.cantidad;
	}
	
	@Override
	public boolean estaDisponible(int cant) {
		return(cant<=cantidad);
	}
	@Override
	public int calcularTarifa(int cant) {
		return this.precio*cant;
	}
}
