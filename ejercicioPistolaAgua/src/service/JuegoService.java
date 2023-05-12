package service;

import java.util.ArrayList;

import entities.Jugador;
import entities.Pistola;

public class JuegoService {
	
	private static Jugador jugador = new Jugador();
	
	public static void llenarJuego(ArrayList<Jugador> jugadores, Pistola revolver) {
		int contador = 0;
		for(int i = 0; i < 6; i++) {
			Jugador jugador1 = new Jugador();
			jugador1.setId(i + 1);
			jugador1.setMojado(false);
			jugador1.setNombre("Jugador " + (i+1));
			jugadores.add(jugador1);
			contador++;
		}
		
		PistolaService.llenarPistola();
	}
	
	public static void ronda(ArrayList<Jugador> jugadores, Pistola revolver) {
		boolean finJuego = false;
		
			for(Jugador ju: jugadores ) {
				finJuego= JugadorService.disparo(ju, revolver);
				System.out.println(ju.getNombre() + " " + ju.getMojado());
				if(ju.getMojado() == true ) {
					System.out.println(ju.getNombre() + " Fin del Juego");
					finJuego=true;
					break;
				}else {
					System.out.println(ju.getNombre() + " safaste");
				}
				
			}
		
		
	}
}
