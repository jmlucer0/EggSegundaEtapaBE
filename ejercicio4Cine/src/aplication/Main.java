package aplication;

import peliculaService.PeliculaService;

public class Main {

	public static void main(String[] args) {
		PeliculaService peli = new PeliculaService();
		peli.crearPelicula();
//		peli.mostrarLista();
//		peli.motrarMasDeUnaHora();
		peli.ordenarMayorMenor();
		peli.ordenarMenorAMayor();

	}

}
