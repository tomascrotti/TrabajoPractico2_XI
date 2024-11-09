package magosVsMortifagos;

public class Expelliarmus implements Hechizo{
	@Override
	public void ejecutar(Personaje lanzador, Personaje objetivo) {
				objetivo.recibirDmg(10);
	}
}
