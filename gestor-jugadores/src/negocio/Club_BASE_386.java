package negocio;

import modelo.Jugador;

import java.util.ArrayList;

public class Club {

	private ArrayList<Jugador> jugadores;

	public Club() {
		this.jugadores = new ArrayList<>();
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

	public void editarJugador(String identificaionJugador, String nuevoNombre, String nuevoIdentificacion, int nuevoPeso) {
		int posicionJugador = 0;
		for (int i = 0; i < this.jugadores.size(); i++) {
			if (this.jugadores.get(i).identificacion.equals(identificaionJugador)) {
				posicionJugador = i;
				this.jugadores.get(posicionJugador).nombre = nuevoNombre;
				this.jugadores.get(posicionJugador).identificacion = nuevoIdentificacion;
				this.jugadores.get(posicionJugador).peso = nuevoPeso;
			}
		}
	}
}
