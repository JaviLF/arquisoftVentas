
public class Servicio extends Product{
	int cantHoras;
	
	Servicio(){
		this.nombre=" ";
		this.precio=0;
		this.cantHoras=0;
	}
	Servicio(String nombre,int precio, int cantHoras){
		this.nombre=nombre;
		this.precio=precio;
		this.cantHoras=cantHoras;
	}

	public void setCantidad(int cant) {
		this.cantHoras=cant;
	}
	public int getCantidad() {
		return this.cantHoras;
	}
	
	@Override
	public boolean estaDisponible(int cant) {
		return (cant>=this.cantHoras);
	}
	@Override
	public int calcularTarifa(int cant) {
		return this.cantHoras*this.precio*cant;
	}
}