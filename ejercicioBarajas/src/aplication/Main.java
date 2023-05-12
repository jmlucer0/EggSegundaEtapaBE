package aplication;

import entities.Baraja;
import service.BarajaService;

public class Main {

	public static void main(String[] args) {
		BarajaService sb = new BarajaService();
		sb.crearBaraja();	
		sb.barajar();
		sb.mostrarBaraja();
		sb.darCartas();
		sb.cartasMonton();
		System.out.println("------------------------------");
		sb.mostrarBaraja();
	}

}
