package service;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Perro;
import entities.Persona;

public class ServicePersona {

	private static Scanner sc = new Scanner(System.in);
	
	
	public static void crearPersona(Persona persona) {
		System.out.println("Ingrese su nombre");
		persona.setNombre(sc.nextLine());
		System.out.println("Ingrese su edad");
		persona.setEdad(sc.nextInt());
		System.out.println("Ingrese su dni");
		persona.setDni(sc.nextInt());
		ArrayList<Perro> p = new ArrayList<Perro>();
		p.add(ServicePerro.creaPerro1());
		persona.setPerro(p);
		
	}
}
