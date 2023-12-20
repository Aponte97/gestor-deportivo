package modelo;

public class Jugador {
	private int peso;
	private String nombre;
	private String identificacion;
	private String planAsociado;

	public Jugador(int peso, String nombre, String identificacion) {
		setPeso(peso);
		setNombre(nombre);
		setIdentificacion(identificacion);
	}

	public Jugador() {
		// TODO Auto-generated constructor stub
	}

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

	public String getPlanAsociado() {
		return planAsociado;
	}

	public void setPlanAsociado(String planAsociado) {
		this.planAsociado = planAsociado;
	}

	@Override
	public String toString() {
		return "Jugador [peso=" + peso + ", nombre=" + nombre + ", identificacion=" + identificacion + ", planAsociado="
				+ planAsociado + "]";
	}

	
}
