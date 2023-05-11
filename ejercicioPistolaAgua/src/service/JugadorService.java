package service;

import java.util.ArrayList;

import entities.Jugador;
import entities.Pistola;

public class JugadorService {
	private static int id;
	private static String nombre;
	
	public static boolean disparo(Jugador jugador, Pistola revolver) {
		boolean shot = PistolaService.mojar();
		
		
		
		if(shot == true) {
			jugador.setMojado(true);
			return true;
		}else {
			PistolaService.siguienteChorro();
			return false;
		}
		
	}
	
	
}
