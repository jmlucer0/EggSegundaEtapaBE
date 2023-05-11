package entities;

import java.util.Comparator;

public class ComparadorPeliculas implements Comparator<Pelicula> {
	@Override
    public int compare(Pelicula p1, Pelicula p2) {
        return (int) (p2.getDuracion() - p1.getDuracion());
    }
}
