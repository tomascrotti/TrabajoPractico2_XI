package magosVsMortifagos;

public class Mago extends Personaje {
	public Mago(String nombre, int nivelMagia, double puntosVida, Varita varita) {
		super(nombre, nivelMagia, puntosVida, varita);
		System.out.println("out");
	}

	@Override
	public void lanzarHechizo(Hechizo hechizo, Personaje objetivo) {
		// TODO Auto-generated method stub
		
	}
	
}
