package entities;

public class Pelicula {

	private String titulo;
	private Double duracion;
	private Integer limitanteEdad;
	private String director;

	public Pelicula() {

	}

	public Pelicula(String titulo, Double duracion, Integer limitanteEdad, String director) {
		super();
		this.titulo = titulo;
		this.duracion = duracion;
		this.limitanteEdad = limitanteEdad;
		this.director = director;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Double getDuracion() {
		return duracion;
	}

	public void setDuracion(Double duracion) {
		this.duracion = duracion;
	}

	public Integer getLimitanteEdad() {
		return limitanteEdad;
	}

	public void setLimitanteEdad(Integer limitanteEdad) {
		this.limitanteEdad = limitanteEdad;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

}
