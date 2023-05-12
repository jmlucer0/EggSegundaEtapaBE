package aplication;

import java.util.ArrayList;

import entities.Jugador;
import entities.Pistola;
import service.JuegoService;
import service.JugadorService;
import service.PistolaService;

public class Main {

	public static void main(String[] args) {
		Pistola revolver = new Pistola();
		ArrayList<Jugador> jugadores = new ArrayList();

		System.out.println("--------------------");
		JuegoService.llenarJuego(jugadores, revolver);
		JuegoService.ronda(jugadores, revolver);
		System.out.println(jugadores);
	}

}
