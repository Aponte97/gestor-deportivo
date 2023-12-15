package negocio;

import modelo.Entrenador;
import modelo.Jugador;

import java.util.ArrayList;
import java.util.List;

public class Club {

	private ArrayList<Jugador> jugadores;
	private ArrayList<Entrenador> entrenador;

	public Club() {
		this.jugadores = new ArrayList<>();
		this.entrenador = new ArrayList<>();
	}

	public void crearJugador(String nombre, String identificacion, int peso) {
		Jugador nuevoJugador = new Jugador();
		nuevoJugador.nombre = nombre;
		nuevoJugador.identificacion = identificacion;
		nuevoJugador.peso = peso;
		jugadores.add(nuevoJugador);
	}

	public void mostrarJugadores() {
		System.out.println("------ JUGADORES DEL CLUB ------------");
		for (Jugador jugador : jugadores) {
			System.out.println(jugador.toString());
		}
		System.out.println("");
	}

<<<<<<< HEAD
	public void editarJugador(String identificaionJugador, String nuevoNombre, String nuevoIdentificacion,
			int nuevoPeso) {
		int posicionJugador = 0;
=======
	public void editarJugador(String identificaionJugador, String nuevoNombre, String nuevoIdentificacion, int nuevoPeso) {
>>>>>>> 3eca05478a995cb100142a6f5de94bb271dedd25
		for (int i = 0; i < this.jugadores.size(); i++) {
			if (this.jugadores.get(i).identificacion.equals(identificaionJugador)) {
				this.jugadores.get(i).nombre = nuevoNombre;
				this.jugadores.get(i).identificacion = nuevoIdentificacion;
				this.jugadores.get(i).peso = nuevoPeso;
				return;
			}
		}
		System.out.println("No se encontró el jugador");
	}

	public void eliminarJugador(String identificacion) {
		int posicionJugador = 0;
		for (int i = 0; i < this.jugadores.size(); i++) {
			if (this.jugadores.get(i).identificacion.equals(identificacion)) {
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
		nuevoEntrenador.nombre = nombre;
		nuevoEntrenador.numeroIdentificacion = numeroIde;
		nuevoEntrenador.deporteQueInstruye = deporteQueInstruye;
		nuevoEntrenador.Nacionalidad = Nacionalidad;
		nuevoEntrenador.SalarioMensual = salario;
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
			if (this.entrenador.get(i).numeroIdentificacion == identificador) {
				pocicion = i;
				this.entrenador.get(pocicion).nombre = nuevoNombre;
				this.entrenador.get(pocicion).numeroIdentificacion = nuevoIde;
				this.entrenador.get(pocicion).deporteQueInstruye = nuevoDeporte;
				this.entrenador.get(pocicion).Nacionalidad = nuevaNacionalidad;
				this.entrenador.get(pocicion).SalarioMensual = nuevoSalario;
			}
		}
	}
	 
	public void eliminarEntrenador(long identificacion) {
		int posicion = -1;
		for(int i = 0 ; i < this.entrenador.size(); i++ ) {
			if (this.entrenador.get(i).numeroIdentificacion == identificacion) {
				posicion = i;
				entrenador.remove(posicion);
			}
		}
	}
}
