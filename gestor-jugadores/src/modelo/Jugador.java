package modelo;

public class Jugador {
	private int peso;
	private String nombre;
	private String identificacion;

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	@Override
	public String toString() {
		return " Nombre: " + nombre +
			", Identificacion: " + identificacion +
			", Peso: " + peso;
	}
}
