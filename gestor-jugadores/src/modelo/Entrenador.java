package modelo;

public class Entrenador {
public String nombre;
public long numeroIdentificacion;
public String deporteQueInstruye;
public String Nacionalidad;
public int SalarioMensual;

public Entrenador() {
	
}
public String toString () {
	return "Nombre :"+ nombre+  ", Numero Identificacion : "+ numeroIdentificacion +
			", Deporte que Instruye" + deporteQueInstruye + ", Nacionalidad : " + Nacionalidad + ", Salario Mensual: "+ SalarioMensual;
}
	
}
