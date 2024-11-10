package magosVsMortifagos;

import java.util.ArrayList;
import java.util.List;

public class Comandante extends Mortifago {
	private static ArrayList<Hechizo> hechizos = generarHechizosIniciales();

	public Comandante(String nombre) {
		super(nombre, 125, 3, hechizos, Varita.EXPERTO, Dado.CUATROCARAS);
	}
	
    private static ArrayList<Hechizo> generarHechizosIniciales() {
    	ArrayList<Hechizo> listaHechizos = new ArrayList<>();
        listaHechizos.add(HechizoFactory.obtenerHechizo("expelliarmus"));
        listaHechizos.add(HechizoFactory.obtenerHechizo("protego"));
        listaHechizos.add(HechizoFactory.obtenerHechizo("avada kedavra"));
        
        return listaHechizos;
    }

}
