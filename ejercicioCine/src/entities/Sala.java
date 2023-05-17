package entities;

public class Sala {
	private Pelicula pelicula = new Pelicula();
	private String[][] asientos = new String[8][6];

	public Sala() {
		ordenSala();
	}

	public Sala(Pelicula pelicula, String[][] asientos) {

		this.pelicula = pelicula;
		this.asientos = asientos;
		ordenSala();
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	public String[][] getAsientos() {
		return asientos;
	}

	public void setAsientos(String[][] asientos) {
		this.asientos = asientos;
	}

	private final void ordenSala() {
		String letra = "";
		for (int i = 1; i < 9; i++) {
			for (int j = 1; j < 7; j++) {
				switch (j) {
				case 1:
					letra = "A";
					break;
				case 2:
					letra = "B";
					break;
				case 3:
					letra = "C";
					break;
				case 4:
					letra = "D";
					break;
				case 5:
					letra = "E";
					break;
				case 6:
					letra = "F";
					break;	
				}
				asientos[i][j] = (9-i) + letra + " ";
			}
		}
	}
}
