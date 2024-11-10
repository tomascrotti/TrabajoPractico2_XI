package magosVsMortifagos;

import java.util.List;

public class Mortifago extends Personaje {

	public Mortifago(String nombre, double puntosVida, int nivelDeMagia, List<Hechizo> hechizos, Varita varita, Dado dado) {
		super(nombre, puntosVida, nivelDeMagia, hechizos, varita, dado);
	}

	@Override
	public void lanzarHechizo(Hechizo hechizo, Personaje objetivo) {
        if (!tieneVarita) {
            System.out.println(nombre + " no puede lanzar hechizos porque no tiene su varita.");
            return;
        }
		hechizo.ejecutar(this, objetivo);
	}	
}
