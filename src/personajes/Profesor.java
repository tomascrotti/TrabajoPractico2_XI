package personajes;

import java.util.ArrayList;
import java.util.List;

import hechizos.Hechizo;
import hechizos.HechizoFactory;
import magosVsMortifagos.Dado;
import magosVsMortifagos.Varita;

public class Profesor extends Mago {

	private static ArrayList<Hechizo> hechizos = generarHechizosIniciales();

    public Profesor(String nombre) {
        super(nombre, 100, 3, hechizos, Varita.EXPERTO, Dado.CUATROCARAS);
    }

    private static ArrayList<Hechizo> generarHechizosIniciales() {
    	ArrayList<Hechizo> listaHechizos = new ArrayList<>();
    	listaHechizos.add(HechizoFactory.obtenerHechizo("Expelliarmus"));
        listaHechizos.add(HechizoFactory.obtenerHechizo("Protego"));
        listaHechizos.add(HechizoFactory.obtenerHechizo("Avada kedavra"));        
        return listaHechizos;
    }
}
