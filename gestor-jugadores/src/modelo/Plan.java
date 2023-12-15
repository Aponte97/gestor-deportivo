package modelo;

public class Plan {

	private String identificador;

	private String nombre;

	private Double valor;

	private int cantidadEntrenamientos;

	public Plan(String identificador, String nombre, Double valor, int cantidadEntrenamientos){
		this.identificador = identificador;
		this.nombre = nombre;
		this.valor = valor;
		this.cantidadEntrenamientos = cantidadEntrenamientos;
	}

	public String getIdentificador() {
		return identificador;
	}

	public String getNombre() {
		return nombre;
	}

	public Double getValor() {
		return valor;
	}

	public int getCantidadEntrenamientos() {
		return cantidadEntrenamientos;
	}
}
