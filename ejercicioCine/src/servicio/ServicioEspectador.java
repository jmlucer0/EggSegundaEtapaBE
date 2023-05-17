package servicio;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import entities.Espectador;

public class ServicioEspectador {

	private ArrayList<Espectador> espectadores = new ArrayList<>();
	private Scanner sc = new Scanner(System.in);
	
	public void crearEspectadores() {
		Random rmd = new Random();
	
		for(int i = 0; i < 30; i++) {
			Espectador espectador = new Espectador();
			System.out.println("Ingrese Nombre");
			espectador.setNombre("Espectador " + i);
			System.out.println("Ingrese edad");
			espectador.setEdad(rmd.nextInt(5, 30));
			System.out.println("Dinero");
			espectador.setDinero(rmd.nextInt(0, 20));
			espectadores.add(espectador);
		}	
	}
	
	
}
