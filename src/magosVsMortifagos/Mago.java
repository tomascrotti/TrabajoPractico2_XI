package magosVsMortifagos;

import java.util.ArrayList;

public class Mago extends Personaje {
	public Mago(String nombre, double puntosVida, int nivelDeMagia, ArrayList<Hechizo> hechizos, Varita varita, Dado dado) {
		super(nombre, puntosVida, nivelDeMagia, hechizos, varita, dado);
	}

	@Override
	public void lanzarHechizo(Hechizo hechizo, Personaje objetivo) {
        if (!tieneVarita) {
            System.out.println(nombre + " no puede lanzar hechizos porque no tiene su varita.");
            return;
        }
		System.out.println("\n ---- \n" + this.getNombre() + " ha lanzado " + hechizo.getNombre());
		hechizo.ejecutar(this, objetivo);
	}
	
}
