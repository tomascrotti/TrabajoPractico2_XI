package personajes;

import java.util.ArrayList;
import java.util.List;

import hechizos.Hechizo;
import hechizos.HechizoFactory;
import magosVsMortifagos.Dado;
import magosVsMortifagos.Varita;

public class Auror extends Mago {
	
	private static ArrayList<Hechizo> hechizos = generarHechizosIniciales();
	
	public Auror (String nombre) {
        super(nombre, 125, 4, hechizos, Varita.EXPERTO, Dado.DOSCARAS);
	}
	
    private static ArrayList<Hechizo> generarHechizosIniciales() {
    	ArrayList<Hechizo> listaHechizos = new ArrayList<>();
        listaHechizos.add(HechizoFactory.obtenerHechizo("avada kedavra"));
        listaHechizos.add(HechizoFactory.obtenerHechizo("expelliarmus"));
        listaHechizos.add(HechizoFactory.obtenerHechizo("protego"));
        
        return listaHechizos;
    }
}
