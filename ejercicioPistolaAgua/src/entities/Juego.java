package entities;

import java.util.ArrayList;

public class Juego {
	private ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
	private Pistola revolver;

	public Juego() {
		super();
	}

	public Juego(ArrayList<Jugador> jugadores, Pistola revolver) {
		super();
		this.jugadores = jugadores;
		this.revolver = revolver;
	}

	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	public Pistola getRevolver() {
		return revolver;
	}

	public void setRevolver(Pistola revolver) {
		this.revolver = revolver;
	}

	@Override
	public String toString() {
		return "Juego [jugadores=" + jugadores + ", revolver=" + revolver + "]";
	}

}
