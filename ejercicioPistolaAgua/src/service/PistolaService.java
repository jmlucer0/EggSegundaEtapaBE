package service;

import java.util.Random;

import entities.Pistola;

public class PistolaService {

	static Pistola revolver = new Pistola();

	public static void llenarPistola() {
		Random rdm = new Random();

		int posicionAgua = rdm.nextInt(6) + 1;
		int posicionActual = rdm.nextInt(6) + 1;
		revolver.setPosicionActual(posicionActual);
		revolver.setPosicionAgua(posicionAgua);
		System.out.println(posicionAgua + " " + posicionActual);
	}

	public static boolean mojar() {
		boolean mojado = false;
		if(revolver.getPosicionActual() == revolver.getPosicionAgua()) {
			mojado = true;
		}
		return mojado;

	}

	public static void siguienteChorro() {
		if (revolver.getPosicionActual() == 6) {
			revolver.setPosicionActual(1);
		} else {
			revolver.setPosicionActual(revolver.getPosicionActual() + 1);
		}
	}

	public static void mostrar() {
		System.out.println("Posicion Actual " + revolver.getPosicionActual());
		System.out.println("Posicion Agua " + revolver.getPosicionAgua());
	}

	
	
}
