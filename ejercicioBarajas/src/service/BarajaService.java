package service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import entities.Baraja;
import entities.Carta;

public class BarajaService {
	Scanner sc = new Scanner(System.in);
	Baraja baraja = new Baraja();
	private ArrayList<Carta> monton = new ArrayList();

	public void crearBaraja() {
		for (String palo : baraja.getPalos()) {
			for (int i = 1; i < 13; i++) {
				if (i != 8 && i != 9) {
					Carta cartas = new Carta(palo, i);
					baraja.getCartas().add(cartas);

				}
			}
		}

	}

	public void mostrarBaraja() {
		for (Carta carta : baraja.getCartas()) {
			System.out.println(carta);
		}
	}

	public void barajar() {
		Collections.shuffle(baraja.getCartas());
	}

	public void siguienteCarta() {
		if (baraja.getCartas().isEmpty()) {
			System.out.println("No hay mas cartas en el Mazo.");
		} else {
			monton.add(baraja.getCartas().get(0));
			baraja.getCartas().remove(0);
		}
	}

	public void cartasDisponibles() {
		System.out.println("Quedan " + baraja.getCartas().size() + " Cartas.");
	}

	public void darCartas() {
		System.out.println("Cuantas carta quiere?");
		int cantidadCartas = sc.nextInt();
		if (cantidadCartas > baraja.getCartas().size()) {
			System.out.println("No hay suficientes cartas en el Mazo");

		} else {
			for (int i = 0; i < cantidadCartas; i++) {
				siguienteCarta();
			}
		}
	}

	public void cartasMonton(){
		if(monton.isEmpty()) {
			System.out.println("No hay cartas en el Monton");
		}else {
			for (Carta carta : monton) {
				System.out.println(carta);
			}	
		}
	}
		
	
	
}
