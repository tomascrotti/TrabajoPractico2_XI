package hechizos;

import personajes.Personaje;

public interface Hechizo {
	void ejecutar(Personaje lanzador, Personaje objetivo);
	String getNombre();
}
