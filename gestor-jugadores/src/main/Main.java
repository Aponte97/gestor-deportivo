package main;

import modelo.Jugador;
import negocio.Club;

public class Main {

    // Visibilidad TIPO_DATO_RETORNO nombreMetodo (PARÁMETROS) {}


    public static void main(String[] args) {
        Club club = new Club();
        club.crearJugador("Martha Aponte", "1239847612", 60);
        club.crearJugador("William Cuervo", "923817641", 54);
        club.crearJugador("Fabian Aponte", "12893712", 65);
        club.crearJugador("Cristian Cuervo", "92386721", 70);

        club.mostrarJugadores();

        club.editarJugador("123442345", "Gerardo Aponte", "98752634", 80);
        club.mostrarJugadores();
        club.eliminarJugador("923817641");
        
        club.crearEntrenador("Jorge", 2455665, "futbol", "Colombia ", 2000000);
        club.crearEntrenador("Daniel", 565665, "tenis", "Colombia ", 1500000);
        club.crearEntrenador("Carlos", 3055965, "futbol sala", "Colombia ", 1250000);
        
        club.mostrarEntrenador();
        club.editarEntrenador(3055965, "David ",294303, "beisbol", "Ecuador", 2150000);
        club.mostrarEntrenador();
        club.eliminarEntrenador(2455665);
        club.mostrarEntrenador();

    }
}