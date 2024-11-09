package magosVsMortifagos;

public class Main {

	public static void main(String[] args) {
		Mago harry = new Profesor("Harry El Sucio Potter", 100);
		Mortifago videla = new Seguidor("Luquitas Videla", 100);
		harry.lanzarHechizo(new Expelliarmus(), videla);
		harry.lanzarHechizo(new Expelliarmus(), videla);
		harry.lanzarHechizo(new Expelliarmus(), videla);
		harry.lanzarHechizo(new Expelliarmus(), videla);
	}
}
