package entities;

import java.util.ArrayList;

public class Baraja {

	private ArrayList<Carta> cartas = new ArrayList();
	private String[] palos = {"Oro", "Basto", "Copa", "Espada"};

	public Baraja() {
		
	}

	public Baraja(ArrayList<Carta> cartas) {
		
		this.cartas = cartas;
		
	}

	public ArrayList<Carta> getCartas() {
		return cartas;
	}

	public void setCartas(ArrayList<Carta> cartas) {
		this.cartas = cartas;
	}

	public String[] getPalos() {
		return palos;
	}

	public void setPalos(String[] palos) {
		this.palos = palos;
	}

	

	
	
}
