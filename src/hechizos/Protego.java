package hechizos;

import personajes.Personaje;

public class Protego implements Hechizo {
	
	private String nombre = "Protego";
		
	@Override
	public void ejecutar(Personaje lanzador, Personaje objetivo) {
		if(!objetivo.tieneProtego()) {
			objetivo.setProtegido(true);
			System.out.println(objetivo.getNombre() + " ha sido protegido por Protego\n");
		} else {
			System.out.println(objetivo.getNombre() + " ya esta protegido con Protego\n");
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
