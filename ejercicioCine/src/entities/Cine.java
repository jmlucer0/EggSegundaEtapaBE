package entities;

import java.util.ArrayList;

public class Cine {
	private ArrayList<Sala> salas = new ArrayList<>();
	private int price = 5;

	public Cine() {

	}

	public Cine(ArrayList<Sala> salas) {

		this.salas = salas;
	}

	public ArrayList<Sala> getSalas() {
		return salas;
	}

	public void setSalas(ArrayList<Sala> salas) {
		this.salas = salas;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
}
