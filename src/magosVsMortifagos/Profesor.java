package magosVsMortifagos;

public class Profesor extends Mago{
	public Profesor(String nombre, int nivelMagia, double puntosVida) {
		super(nombre, nivelMagia, puntosVida, Varita.PROFESIONAL);
	}
}
