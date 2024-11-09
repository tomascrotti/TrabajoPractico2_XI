package magosVsMortifagos;

public class Mago extends Personaje {
	public Mago(String nombre, double puntosVida, Varita varita, Dado dado) {
		super(nombre, puntosVida, varita, dado);
	}

	@Override
	public void lanzarHechizo(Hechizo hechizo, Personaje objetivo) {
        if (!tieneVarita) {
            System.out.println(nombre + " no puede lanzar hechizos porque no tiene su varita.");
            return;
        }
		System.out.println(this.getNombre() + " ha lanzado " + hechizo.getNombre());
		hechizo.ejecutar(this, objetivo);
	}
	
}
