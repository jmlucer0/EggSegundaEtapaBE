package entities;

import java.util.ArrayList;

public class Persona {
	private String nombre;
	private Integer edad;
	private Integer dni;
	private ArrayList<Perro> perro = new ArrayList<Perro>();

	public Persona() {
		super();
	}

	public Persona(String nombre, Integer edad, Integer dni, ArrayList<Perro> perro) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.perro = perro;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public ArrayList<Perro> getPerro() {
		return perro;
	}

	public void setPerro(ArrayList<Perro> perro) {
		this.perro = perro;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", perro=" + perro + "]";
	}

}
