package magosVsMortifagos;

public class Profesor extends Mago{
	public Profesor(String nombre, int nivelMagia, int puntosVida) {
		super(nombre, nivelMagia, puntosVida, Varita.PROFESIONAL);
	}
}
