
public interface Producto {
	String nombre="";
	int precio=0;
	int saldo=0;
	boolean estaDisponible(int cant);
	int calcularTarifa(int cant);
}
