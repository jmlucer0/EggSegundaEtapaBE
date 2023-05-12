package entities;

public class Carta {

	private String palo;
	private int valor;

	public Carta() {
	
	}

	public Carta(String palo, int valor) {
		
		this.palo = palo;
		this.valor = valor;
	}

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Carta [palo=" + palo + ", valor=" + valor + "]";
	}

}
