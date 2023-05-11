package aplication;

import java.util.Scanner;

import service.ServicioAlumno;

public class Main {

	public static void main(String[] args) {
		ServicioAlumno sa = new ServicioAlumno();
		Scanner sc = new Scanner(System.in);
		sa.crearAlumno();
		
		System.out.println("Ingrese el nombre de un alumno a Buscar");
		sa.notaFinal(sc.nextLine());
		
	}

}
