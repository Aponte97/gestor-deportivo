package modelo;

public class Entrenador {
	private String nombre;
	private long numeroIdentificacion;
	private String deporteQueInstruye;
	private String Nacionalidad;
	private int SalarioMensual;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getNumeroIdentificacion() {
		return numeroIdentificacion;
	}

	public void setNumeroIdentificacion(long numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}

	public String getDeporteQueInstruye() {
		return deporteQueInstruye;
	}

	public void setDeporteQueInstruye(String deporteQueInstruye) {
		this.deporteQueInstruye = deporteQueInstruye;
	}

	public String getNacionalidad() {
		return Nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		Nacionalidad = nacionalidad;
	}

	public int getSalarioMensual() {
		return SalarioMensual;
	}

	public void setSalarioMensual(int salarioMensual) {
		SalarioMensual = salarioMensual;
	}

	public String toString() {
		return "Nombre :" + nombre + ", Numero Identificacion : " + numeroIdentificacion +
			", Deporte que Instruye" + deporteQueInstruye + ", Nacionalidad : " + Nacionalidad + ", Salario Mensual: " + SalarioMensual;
	}

}
