package peliculaService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import entities.Pelicula;

public class PeliculaService {
	private ArrayList<Pelicula> listaPelicula = new ArrayList<>();
	private Scanner sc = new Scanner(System.in);

	public void crearPelicula() {

		System.out.println("Ingrese el titulo de la pelicula ");
		String titulo = sc.nextLine();
		System.out.println("Ingrese el autor de la pelicula");
		String autor = sc.nextLine();
		System.out.println("Ingrese la duracion de la pelicula");
		Double duracion = sc.nextDouble();
		Pelicula pelicula = new Pelicula(titulo, autor, duracion);
		listaPelicula.add(pelicula);

		System.out.println("Desea agregar otra pelicuala? s/n");
		String opcion = sc.next();
		if (opcion.equalsIgnoreCase("s")) {
			sc.nextLine();
			crearPelicula();
		} else {
			mostrarLista();
		}
	}

	
	public void mostrarLista() {
		for(Pelicula peli:listaPelicula) {
			System.out.println(peli);
		}
	}
	
	public void motrarMasDeUnaHora() {
		for(Pelicula peli:listaPelicula) {
			if(peli.getDuracion() > 1.0) {
				System.out.println(peli);
			}
		}
	}
	

	public void ordenarMayorAMenor() {
        Collections.sort(listaPelicula, new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula o1, Pelicula o2) {
                return Double.compare(o2.getDuracion(), o1.getDuracion());
            }
        });
        for (Pelicula ListaPeli : listaPelicula) {
            System.out.println("Las pelis de mayor a menor duracion son: " + ListaPeli);
        }
    }
	
	public void ordenarMayorMenor() {
        Collections.sort(listaPelicula, new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula o1, Pelicula o2) {
                return Double.compare(o2.getDuracion(), o1.getDuracion());
            }
        });
        for (Pelicula ListaPeli : listaPelicula) {
            System.out.println("Las pelis de mayor a menor duracion son: " + ListaPeli);
        }
    }
	
	public void ordenarMenorAMayor() {
        Collections.sort(listaPelicula, new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula o1, Pelicula o2) {
                return Double.compare(o1.getDuracion(), o2.getDuracion());
            }
        });
        for (Pelicula ListaPeli : listaPelicula) {
            System.out.println("Las pelis de menor a mayor duracion son: " + ListaPeli);
        }
    }
}
