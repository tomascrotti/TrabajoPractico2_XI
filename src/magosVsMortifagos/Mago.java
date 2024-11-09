package magosVsMortifagos;

public class Mago extends Personaje {
	public Mago(String nombre, int nivelMagia, double puntosVida, Varita varita) {
		super(nombre, nivelMagia, puntosVida, varita);
	}

	@Override
	public void lanzarHechizo(Hechizo hechizo, Personaje objetivo) {
		System.out.println(this.getNombre() + " ha lanzado " + hechizo.getNombre());
		hechizo.ejecutar(objetivo);
	}
	
}
