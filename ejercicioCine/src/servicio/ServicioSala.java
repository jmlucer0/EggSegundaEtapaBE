package servicio;

import entities.Sala;

public class ServicioSala {

	public void asignarAsiento() {
		if () {
			System.out.println("Asiento asignado");
		}else {
			System.out.println("El Asiento esta ocupado");
		}
			

	}

	public Boolean asientoVacio(Sala sala, String ubica) {
		String[][] asientos = sala.getAsientos();
		for (int i = 0; i < asientos.length; i++) {
			for (int j = 0; j < asientos.length; j++) {
				if (asientos[i][j].equalsIgnoreCase(ubica + " ")) {
					asientos[i][j] = ubica + "X";
					sala.setAsientos(asientos);
					return true;
				}
			}

		}
		return false;
	}
}
