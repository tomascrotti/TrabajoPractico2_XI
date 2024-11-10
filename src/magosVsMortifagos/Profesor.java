package magosVsMortifagos;

import java.util.ArrayList;
import java.util.List;

public class Profesor extends Mago {

	private static ArrayList<Hechizo> hechizos = generarHechizosIniciales();

    public Profesor(String nombre) {
        super(nombre, 100, 3, hechizos, Varita.PROFESIONAL, Dado.CUATROCARAS);
    }

    private static ArrayList<Hechizo> generarHechizosIniciales() {
    	ArrayList<Hechizo> listaHechizos = new ArrayList<>();
        listaHechizos.add(HechizoFactory.obtenerHechizo("protego"));
        listaHechizos.add(HechizoFactory.obtenerHechizo("expelliarmus"));
        listaHechizos.add(HechizoFactory.obtenerHechizo("avada kedavra"));
        
        return listaHechizos;
    }
}
