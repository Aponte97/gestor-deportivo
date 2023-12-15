package modelo;

public class Jugador {
	public int peso;
	public String nombre;
	public String identificacion;

	// Constructor
	public Jugador(){
		//	System.out.println("Estan quieriendo crear un jugador");
	}

	@Override
	public String toString() {
		return " Nombre: " + nombre +
			", Identificacion: " + identificacion +
			", Peso: " + peso;
	}
}
