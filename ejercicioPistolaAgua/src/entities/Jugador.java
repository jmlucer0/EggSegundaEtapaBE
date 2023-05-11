package entities;

public class Jugador {

	private int id;
	private String nombre;
	private Boolean mojado;
	public Jugador() {
		
	}
	public Jugador(int id) {
		
		this.id = id;
		this.nombre = "jugador";
		this.mojado = mojado;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Boolean getMojado() {
		return mojado;
	}
	public void setMojado(Boolean mojado) {
		this.mojado = mojado;
	}
	@Override
	public String toString() {
		return "Jugador [id=" + id + ", nombre=" + nombre + ", mojado=" + mojado + "]";
	}

	
}
