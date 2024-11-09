package magosVsMortifagos;

public class Mortifago extends Personaje {

	public Mortifago(String nombre, int nivelMagia, double puntosVida, Varita varita) {
		super(nombre, nivelMagia, puntosVida, varita);
	}

	@Override
	public void lanzarHechizo(Hechizo hechizo, Personaje objetivo) {
		hechizo.ejecutar(objetivo);
	}	
}
