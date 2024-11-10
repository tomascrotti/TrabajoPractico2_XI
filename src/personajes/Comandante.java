package personajes;

import java.util.ArrayList;
import java.util.List;

import hechizos.Hechizo;
import hechizos.HechizoFactory;
import magosVsMortifagos.Dado;
import magosVsMortifagos.Varita;

public class Comandante extends Mortifago {
	private static ArrayList<Hechizo> hechizos = generarHechizosIniciales();

	public Comandante(String nombre) {
		super(nombre, 125, 3, hechizos, Varita.EXPERTO, Dado.CUATROCARAS);
	}
	
    private static ArrayList<Hechizo> generarHechizosIniciales() {
    	ArrayList<Hechizo> listaHechizos = new ArrayList<>();
    	listaHechizos.add(HechizoFactory.obtenerHechizo("Avada kedavra"));
        listaHechizos.add(HechizoFactory.obtenerHechizo("Expelliarmus"));
        listaHechizos.add(HechizoFactory.obtenerHechizo("Protego"));
        listaHechizos.add(HechizoFactory.obtenerHechizo("Sectumsempra"));
        return listaHechizos;
    }

}
