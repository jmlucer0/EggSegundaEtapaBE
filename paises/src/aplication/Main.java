package aplication;

import java.util.TreeSet;

import entities.Pais;
import service.PaisService;

public class Main {

	public static void main(String[] args) {
		TreeSet<Pais> paises = new TreeSet<Pais>();
		PaisService.ingresarPaises(paises);
//		PaisService.buscarPais(paises);

	}

}
