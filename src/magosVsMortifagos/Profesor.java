package magosVsMortifagos;

public class Profesor extends Mago{
	public Profesor(String nombre, double puntosVida) {
		super(nombre, puntosVida, Varita.PROFESIONAL, Dado.CUATROCARAS);
	}
}
