package magosVsMortifagos;

public class AvadaKedavra implements Hechizo {
	@Override
	public void ejecutar(Personaje lanzador, Personaje objetivo) {
		int danio = 50 ;
		objetivo.recibirDmg(50);
		System.out.println(lanzador.nombre + " ha lanzado Avada Kedavra a " + objetivo.nombre + " y le ha quitado 50 puntos de vida.");
	}
}
