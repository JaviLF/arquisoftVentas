
public class Servicio extends Product{
	
	Servicio(){
		this.nombre=" ";
		this.precio=0;
		this.cantidad=0;
	}
	Servicio(String nombre,int precio, int cantidad){
		this.nombre=nombre;
		this.precio=precio;
		this.cantidad=cantidad;
	}
	
	@Override
	public boolean estaDisponible(int cant) {
		return (cant<=this.cantidad);
	}
	@Override
	public int calcularTarifa(int cant) {
		return 3*this.precio*cant;
	}
}