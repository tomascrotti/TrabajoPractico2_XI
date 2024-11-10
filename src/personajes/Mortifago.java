package personajes;

import java.util.ArrayList;
import java.util.List;

import hechizos.Hechizo;
import magosVsMortifagos.Dado;
import magosVsMortifagos.Varita;

public abstract class Mortifago extends Personaje {

	public Mortifago(String nombre, double puntosVida, int nivelDeMagia, ArrayList<Hechizo> hechizos, Varita varita, Dado dado) {
		super(nombre, puntosVida, nivelDeMagia, hechizos, varita, dado);
	}

	@Override
	public void lanzarHechizo(Hechizo hechizo, Personaje objetivo) {
        if (!tieneVarita) {
            System.out.println(nombre + " no puede lanzar hechizos porque no tiene su varita.");
            return;
        }
        System.out.println("\n ---- \n" + this.getNombre() + " ha lanzado " + hechizo.getNombre() + " a " + objetivo.getNombre());
		hechizo.ejecutar(this, objetivo);
	}
}
