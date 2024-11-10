package magosVsMortifagos;

import java.util.ArrayList;
import java.util.List;

public class Estudiante extends Mago {
	private static List<Hechizo> hechizos = generarHechizosIniciales();

	public Estudiante(String nombre) {
		super(nombre, 50, 1, hechizos, Varita.PRINCIPIANTE, Dado.SEISCARAS);
	}
    
    private static List<Hechizo> generarHechizosIniciales() {
        List<Hechizo> listaHechizos = new ArrayList<>();
        listaHechizos.add(HechizoFactory.obtenerHechizo("avada kedavra"));
        listaHechizos.add(HechizoFactory.obtenerHechizo("expelliarmus"));
        listaHechizos.add(HechizoFactory.obtenerHechizo("protego"));
        
        return listaHechizos;
    }
}
