package magosVsMortifagos;

public class Protego implements Hechizo {
	
	private String nombre = "Protego";
	
	@Override
	public void ejecutar(Personaje lanzador, Personaje objetivo) {
		double nuevaDefensa = -lanzador.getVarita().multDefe;
		objetivo.aumentarDefensa(nuevaDefensa);
	}

	public String getNombre() {
		return nombre;
	}	
}
