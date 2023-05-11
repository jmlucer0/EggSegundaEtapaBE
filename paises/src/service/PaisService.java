package service;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

import entities.Pais;

public class PaisService {

	static Scanner sc = new Scanner(System.in);

	
	
	public static void ingresarPaises(TreeSet<Pais> paises) {
		System.out.println("Ingrese el nombre del pais");
		String pais =sc.nextLine();
		paises.add(new Pais(pais));
		System.out.println("Desea ingresar otro pais? s/n");
		String confirmation = sc.nextLine();
		if (confirmation.equalsIgnoreCase("s")) {
			ingresarPaises(paises);
		} else {
			for (Pais paises1 : paises) {
				System.out.println(paises1.toString());
			}
		}
	}

	public static void buscarPais(TreeSet<Pais> paises) {
		Iterator it = paises.iterator();
		System.out.println("ingrese el pais a buscar");
		String buscador = sc.nextLine();

		while (it.hasNext()) {
			Pais p = (Pais) it.next();
			if (p.getNombre().equalsIgnoreCase(buscador)) {
				it.remove();
			}else {
				System.out.println("el pais a buscar no esta en la lista");
			}		
		}
	}
}