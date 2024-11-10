package magosVsMortifagos;

public class Protego implements Hechizo {
	
	private String nombre = "Protego";
	
	@Override
	public void ejecutar(Personaje lanzador, Personaje objetivo) {
		System.out.println("Puntos de defensa actuales: " + objetivo.getDefensa());
		double nuevaDefensa = -lanzador.getVarita().multDefe;
		objetivo.aumentarDefensa(nuevaDefensa);
		System.out.println("Puntos de defensa nuevos: " + objetivo.getDefensa());
	}

	public String getNombre() {
		return nombre;
	}
	
	@Override
	public String toString() {
		return "Protego - Aumenta la defensa\n";
	}
}
