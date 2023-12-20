package negocio;

import modelo.Entrenador;
import modelo.Jugador;
import modelo.Plan;

import java.util.ArrayList;

public class Club {
	private ArrayList<Jugador> jugadores;
	private ArrayList<Entrenador> entrenador;
	private ArrayList<Plan> planes;

	public Club() {
		this.jugadores = new ArrayList<>();
		this.entrenador = new ArrayList<>();
		this.planes = new ArrayList<>();
	}

	public void crearJugador(String nombre, String identificacion, int peso) {
		Jugador nuevoJugador = new Jugador(peso, nombre, identificacion);
		jugadores.add(nuevoJugador);
	}

	public void mostrarJugadores() {
		System.out.println("------ JUGADORES DEL CLUB ------------");
		for (Jugador jugador : jugadores) {
			System.out.println(jugador.toString());
		}
		System.out.println("");
	}

	public void editarJugador(String identificaionJugador, String nuevoNombre, String nuevoIdentificacion,
			int nuevoPeso) {
		for (int i = 0; i < this.jugadores.size(); i++) {
			if (this.jugadores.get(i).getIdentificacion().equals(identificaionJugador)) {
				this.jugadores.get(i).setNombre(nuevoNombre);
				this.jugadores.get(i).setIdentificacion(nuevoIdentificacion);
				this.jugadores.get(i).setPeso(nuevoPeso);
				return;
			}
		}
		System.out.println("No se encontró el jugador");
	}

	public void eliminarJugador(String identificacion) {
		int posicionJugador = 0;
		for (int i = 0; i < this.jugadores.size(); i++) {
			if (this.jugadores.get(i).getIdentificacion().equals(identificacion)) {
				posicionJugador = i;
				jugadores.remove(posicionJugador);
				System.out.println("---------- SE elimino------");
				for (Jugador jugador : jugadores) {
					System.out.println(jugador.toString());
				}
				return;
			}
		}
		for (Jugador jugador : jugadores) {
			System.out.println(jugador.toString());
		}
	}

	public void crearEntrenador(String nombre, long numeroIde, String deporteQueInstruye, String Nacionalidad,
			int salario) {
		Entrenador nuevoEntrenador = new Entrenador();
		nuevoEntrenador.setNombre(nombre);
		nuevoEntrenador.setNumeroIdentificacion(numeroIde);
		nuevoEntrenador.setDeporteQueInstruye(deporteQueInstruye);
		nuevoEntrenador.setNacionalidad(Nacionalidad);
		nuevoEntrenador.setSalarioMensual(salario);
		entrenador.add(nuevoEntrenador);
	}

	public void mostrarEntrenador() {
		System.out.println("\n --------- ENTRENADORES ----------");

		for (Entrenador entrenador : entrenador) {
			System.out.println(entrenador.toString());

		}
	}

	public void editarEntrenador(long identificador, String nuevoNombre, long nuevoIde, String nuevoDeporte,
			String nuevaNacionalidad, int nuevoSalario) {
		int pocicion = -1;
		for (int i = 0; i < this.entrenador.size(); i++) {
			if (this.entrenador.get(i).getNumeroIdentificacion() == identificador) {
				pocicion = i;
				this.entrenador.get(pocicion).setNombre(nuevoNombre);
				this.entrenador.get(pocicion).setNumeroIdentificacion(nuevoIde);
				this.entrenador.get(pocicion).setDeporteQueInstruye(nuevoDeporte);
				this.entrenador.get(pocicion).setNacionalidad(nuevaNacionalidad);
				this.entrenador.get(pocicion).setSalarioMensual(nuevoSalario);
			}
		}
	}

	public void eliminarEntrenador(long identificacion) {
		int posicion = -1;
		for (int i = 0; i < this.entrenador.size(); i++) {
			if (this.entrenador.get(i).getNumeroIdentificacion() == identificacion) {
				posicion = i;
				entrenador.remove(posicion);
			}
		}
	}

	// ******************** CRUD PLANES **************************

	public void crearPlan(String identificador, String nombre, Double valor, int cantidadEntrenamientos) {
		Plan plan = new Plan(identificador, nombre, valor, cantidadEntrenamientos);
		this.planes.add(plan);
	}

	public void mostrarPlanes() {
		System.out.println("------ PLANES DEL CLUB ------------");
		for (Plan plan : planes) {
			System.out.println("Identificador: " + plan.getIdentificador() + ", Nombre: " + plan.getNombre()
					+ ", Valor: " + plan.getValor() + ", # Entrenamientos: " + plan.getCantidadEntrenamientos());
		}
		System.out.println("");
	}

	public void asociarPlan(String identificacionJugador, String identificadorPlan) {
		for (int i = 0; i < this.jugadores.size(); i++) {
			if (this.jugadores.get(i).getIdentificacion().equals(identificacionJugador)) {
				for (int j = 0; j < this.planes.size(); j++) {
					if (this.planes.get(j).getIdentificador().equals(identificadorPlan)) {
						this.jugadores.get(i).setPlanAsociado(identificadorPlan);
					}
				}
			}
		}
	}

	public void mostrarPlanJugador (String identificacionJugador) {
		String nombreJugador ;
		String identificacionDelJugador = null ;
		String identificadorPlan ;
		String nombrePlan;
		double valorPlan;
		int entrenamientos;
		System.out.println("------------ JUGADOR POR PLAN -----------------");
	for (int i = 0; i < jugadores.size(); i++) {
		for( Plan plan : planes) {
		identificadorPlan =	plan.getIdentificador();
			if (this.jugadores.get(i).getIdentificacion().equalsIgnoreCase(identificacionJugador) ) {	
					if (this.jugadores.get(i).getPlanAsociado().equalsIgnoreCase(identificadorPlan)) {
		nombreJugador =	this.jugadores.get(i).getNombre(); 
		identificacionDelJugador =	this.jugadores.get(i).getIdentificacion(); 
		nombrePlan = plan.getNombre();
		valorPlan = plan.getValor();
		entrenamientos = plan.getCantidadEntrenamientos();
		System.out.println("NOMBRE:"+ nombreJugador +" \t IDENTIFICACION JUGADOR:"+ identificacionDelJugador+ " \t NOMBRE PLAN:"+ nombrePlan + "\t VALOR PLAN:"+valorPlan + "\tNUMERO ENTRENAMIENTO:"+entrenamientos);
			}
		}
	}}
	
	}
}
