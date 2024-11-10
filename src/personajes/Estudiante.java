package personajes;

import java.util.ArrayList;
import java.util.List;

import hechizos.Hechizo;
import hechizos.HechizoFactory;
import magosVsMortifagos.Dado;
import magosVsMortifagos.Varita;

public class Estudiante extends Mago {
	private static ArrayList<Hechizo> hechizos = generarHechizosIniciales();

	public Estudiante(String nombre) {
		super(nombre, 50, 1, hechizos, Varita.PRINCIPIANTE, Dado.SEISCARAS);
	}
    
    private static ArrayList<Hechizo> generarHechizosIniciales() {
    	ArrayList<Hechizo> listaHechizos = new ArrayList<>();
    	listaHechizos.add(HechizoFactory.obtenerHechizo("Avada kedavra"));
    	listaHechizos.add(HechizoFactory.obtenerHechizo("Sectumsempra"));
    	listaHechizos.add(HechizoFactory.obtenerHechizo("Protego"));
        return listaHechizos;
    }
}
