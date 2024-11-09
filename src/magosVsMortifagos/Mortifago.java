package magosVsMortifagos;

public class Mortifago extends Personaje {

	public Mortifago(String nombre, double puntosVida, Varita varita, Dado dado) {
		super(nombre, puntosVida, varita, dado);
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
