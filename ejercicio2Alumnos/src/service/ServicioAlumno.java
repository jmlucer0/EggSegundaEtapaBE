package service;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Alumno;

public class ServicioAlumno {

	private ArrayList <Alumno> listaAlumno = new ArrayList<>();
	private Scanner sc = new Scanner(System.in);
	
	public void crearAlumno() {
		String opcion;
		String nombre;
		ArrayList <Integer> notas = new ArrayList<>();
		do {
			System.out.println("Ingrese el nombre");
			nombre = sc.nextLine();
			
			for (int i = 0; i < 3; i++) {
				System.out.println("Ingrese la nota " + (i+1));
				notas.add(sc.nextInt());
			}
			System.out.println("Desea ingresar otro alumno?");
			opcion = sc.next();
		}while(!opcion.equalsIgnoreCase("n"));
		Alumno alumno = new Alumno(nombre, notas);
		listaAlumno.add(alumno);
		
	}
	
	public void notaFinal(String alumno) {
		double notaFinal = 0.0;
			int sumaNotas = 0;
		for(Alumno alumno1: listaAlumno) {
			
			if(alumno1.getNombre().equalsIgnoreCase(alumno)) {
				ArrayList<Integer> notas = alumno1.getNotas();
			
				for(int i = 0; i < notas.size(); i++) {
					sumaNotas += notas.get(i);
					
				}
				notaFinal =  sumaNotas/3;
				
			}
		}
		
		
		if(!listaAlumno.equals(alumno)) {
			System.out.println("el alumno ingresado no se encuentra en la lista");
			
		}else {
			
			System.out.println(sumaNotas);
			System.out.println(notaFinal);
			
		}
		
	}
	

}
