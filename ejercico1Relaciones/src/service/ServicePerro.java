package service;

import java.util.Scanner;

import entities.Perro;

public class ServicePerro {
	private static Perro perro;
	private static Scanner sc = new Scanner(System.in);
	
	public static void crearPerro() {
		System.out.println("Ingrese el nombre del Perro");
		perro.setNombre(sc.nextLine());
		System.out.println("Ingrese la Raza");
		perro.setRaza(sc.nextLine());
		System.out.println("Ingrese el tamanio (Chico, Mediano, Grande)");
		perro.setTamanio(sc.nextLine());
		System.out.println("Ingrese la edad");
		perro.setEdad(sc.nextInt());
		
	}
	
	
}
