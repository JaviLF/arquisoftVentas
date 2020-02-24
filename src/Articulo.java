
public class Articulo extends Product{
	Articulo(){
		this.nombre=" ";
		this.precio=0;
		this.saldo=0;
	}
	Articulo(String nombre,int precio, int saldo){
		this.nombre=nombre;
		this.precio=precio;
		this.saldo=saldo;
	}
	
	
	public void setSaldo(int saldo) {
		this.saldo=saldo;
	}
	public int getSaldo() {
		return this.saldo;
	}

	public boolean estaDisponible(int cant) {
		return(cant<=saldo);
	}
	public int calcularTarifa(int cant) {
		return 0;
	}
}
