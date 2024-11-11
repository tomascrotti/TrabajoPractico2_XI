package personajes;

import hechizos.Hechizo;
import magosVsMortifagos.Dado;
import magosVsMortifagos.Varita;

public abstract class Mago extends Personaje {
	public Mago(String nombre, double puntosVida, int nivelDeMagia, Varita varita, Dado dado) {
		super(nombre, puntosVida, nivelDeMagia, varita, dado);
	}

	@Override
	public void lanzarHechizo(Hechizo hechizo, Personaje objetivo) {
        if (!tieneVarita()) {
            System.out.println(nombre + " no puede lanzar hechizos porque no tiene su varita.\n");
            return;
        }
        System.out.println("\n ---- \n" + this.getNombre() + " ha lanzado " + hechizo.getNombre());
        if(objetivo.tieneProtego()) {
        	objetivo.setProtegido(false);
        	return;
        }
		hechizo.ejecutar(this, objetivo);
	}
}
