package personajes;

import java.util.ArrayList;
import java.util.List;

import hechizos.Hechizo;
import magosVsMortifagos.Dado;
import magosVsMortifagos.Varita;

public class Mortifago extends Personaje {

	public Mortifago(String nombre, double puntosVida, int nivelDeMagia, ArrayList<Hechizo> hechizos, Varita varita, Dado dado) {
		super(nombre, puntosVida, nivelDeMagia, hechizos, varita, dado);
	}

	@Override
	public void lanzarHechizo(Hechizo hechizo, Personaje objetivo) {
        if (!tieneVarita) {
            System.out.println(nombre + " no puede lanzar hechizos porque no tiene su varita.");
            this.setTieneVarita(true);
            return;
        }
		hechizo.ejecutar(this, objetivo);
	}
}
