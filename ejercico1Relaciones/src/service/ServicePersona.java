package service;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Perro;
import entities.Persona;

public class ServicePersona {
	private Perro perro;
	private Persona persona;
	private Scanner sc = new Scanner(System.in);
	
	
	public void crearPersona() {
		System.out.println("Ingrese su nombre");
		persona.setNombre(sc.nextLine());
		System.out.println("Ingrese su edad");
		persona.setEdad(sc.nextInt());
		System.out.println("Ingrese su dni");
		persona.setDni(sc.nextInt());
		ServicePerro.crearPerro();
		persona.getPerro().add(perro);
		
	}
}
