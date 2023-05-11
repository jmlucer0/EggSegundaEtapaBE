package entities;

public class Pais implements Comparable<Pais> {
	private String nombre;

	public Pais(String nombre) {
		super();
		this.nombre = nombre;
	}

	public Pais() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Pais [nombre=" + nombre + "]";
	}

	@Override
	public int compareTo(Pais o) {
		// TODO Auto-generated method stub
		return 0;
	}


}
