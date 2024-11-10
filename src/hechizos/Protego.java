package hechizos;

import personajes.Personaje;

public class Protego implements Hechizo {
	
	private String nombre = "Protego";
		
	@Override
	public void ejecutar(Personaje lanzador, Personaje objetivo) {
		if(!lanzador.tieneProtego()) {
			lanzador.setProtegido(true);
		} else {
			System.out.println(lanzador.getNombre() + " ya tiene Protego\n");
		}
	}

	public String getNombre() {
		return nombre;
	}
	
	@Override
	public String toString() {
		return nombre + " - Crea un escudo protector invisible que desvía hechizos o ataques.\n";
	}
}
