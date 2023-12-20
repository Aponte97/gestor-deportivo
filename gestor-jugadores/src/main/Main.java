package main;

import negocio.Club;

public class Main {
	public static void main(String[] args) {
		Club club = new Club();
		club.crearJugador("Elena Aponte", "1239847612", 60);
		club.crearJugador("William Cuervo", "923817641", 54);
		club.crearJugador("Fabian Aponte", "12893712", 65);
		club.crearJugador("Cristian Cuervo", "92386721", 70);

		club.mostrarJugadores();

		club.editarJugador("123442345", "Gerardo Aponte", "98752634", 80);
		club.mostrarJugadores();
		club.eliminarJugador("923817641");
/*
		club.crearEntrenador("Jorge", 2455665, "futbol", "Colombia", 2000000);
		club.crearEntrenador("Daniel", 565665, "tenis", "Colombia ", 1500000);
		club.crearEntrenador("Carlos", 3055965, "futbol sala", "Colombia ", 1250000);

		club.mostrarEntrenador();
		club.editarEntrenador(3055965, "David ", 294303, "beisbol", "Ecuador", 2150000);
		club.mostrarEntrenador();
		club.eliminarEntrenador(2455665);
		club.mostrarEntrenador();
 */

		club.crearPlan("A1", "Futbol 5 Principiantes", 80000.0, 10);
		club.crearPlan("A2", "Futbol Senior", 300000.0, 20);
		club.mostrarPlanes();
		club.asociarPlan("92386721", "A1");
		club.mostrarJugadores();
		club.mostrarPlanJugador("92386721");
	}
}