package magosVsMortifagos;

public class Main {

	public static void main(String[] args) {
		HechizoFactory hechizoFactory = new HechizoFactory();
		Mago harry = new Auror("Harry El Sucio Potter", 100);
		Mago videla = new Estudiante("Luquitas Videla", 100);
		
		harry.lanzarHechizo(hechizoFactory.obtenerHechizo("Avada kedavra"), videla);
		videla.lanzarHechizo(hechizoFactory.obtenerHechizo("Protego"), videla);
		harry.lanzarHechizo(hechizoFactory.obtenerHechizo("Avada kedavra"), videla);
	}
}
