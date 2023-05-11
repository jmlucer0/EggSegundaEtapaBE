package entities;

public class Pistola {

	private int posicionActual;
	private int posicionAgua;
	public Pistola() {
		
	}
	public Pistola(int posicionActual, int posicionAgua) {
		
		this.posicionActual = posicionActual;
		this.posicionAgua = posicionAgua;
	}
	public int getPosicionActual() {
		return posicionActual;
	}
	public void setPosicionActual(int posicionActual) {
		this.posicionActual = posicionActual;
	}
	public int getPosicionAgua() {
		return posicionAgua;
	}
	public void setPosicionAgua(int posicionAgua) {
		this.posicionAgua = posicionAgua;
	}
	@Override
	public String toString() {
		return "Pistola [posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + "]";
	}

	

}
