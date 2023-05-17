package servicio;

import java.util.ArrayList;
import java.util.Random;

import entities.Pelicula;

public class ServicioPelicula {

	private ArrayList<Pelicula> peliculas = new ArrayList<>();
	
	public void crearPeliculas() {
		Random rmd = new Random();
		
		for(int i = 0; i < 4; i++) {
			Pelicula pelicula = new Pelicula();
			System.out.println("Ingrese el Titulo");
			pelicula.setTitulo("Titulo " + i);
			System.out.println("Duracion del Titulo");
			pelicula.setDuracion(120.0);
			System.out.println("Limite de Edad");
			pelicula.setLimitanteEdad(rmd.nextInt(1, 20));
			System.out.println("Director");
			pelicula.setDirector("Director " + i);
			peliculas.add(pelicula);
		}
	}
}
