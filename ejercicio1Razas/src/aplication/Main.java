package aplication;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> razas = new ArrayList();
		Scanner sc = new Scanner(System.in);
		int contador = 1;
		String raza;
		String opcion;
		for(int i = 0; i < contador; i++) {
			System.out.println("Ingrese una raza");
			raza = sc.nextLine();
			razas.add(raza);
			
			System.out.println("Desea ingresear otra raza?");
			opcion = sc.nextLine();
			
			if (opcion.equalsIgnoreCase("s")) {
				contador++;
			}else {
				break;
			}
		}
		System.out.println("Elija una raza");
		for(String raza1:razas) {
			System.out.println(raza1);
		}
		String eliminarRaza= sc.nextLine();
		Iterator <String> itera = razas.iterator();
		while(itera.hasNext()) {
			String raza1 = itera.next();
			if(raza1.equalsIgnoreCase(eliminarRaza)) {
				itera.remove();
				
			}
			
		}
		Collections.sort(razas);
		
		for(String raza1:razas) {
			System.out.println(raza1);
		}
	}

}
