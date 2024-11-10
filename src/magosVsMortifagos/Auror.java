package magosVsMortifagos;

import java.util.ArrayList;
import java.util.List;

public class Auror extends Mago {
	
	private static List<Hechizo> hechizos = generarHechizosIniciales();
	
	public Auror (String nombre) {
        super(nombre, 125, 4, hechizos, Varita.EXPERTO, Dado.DOSCARAS);
	}
	
    private static List<Hechizo> generarHechizosIniciales() {
        List<Hechizo> listaHechizos = new ArrayList<>();
        listaHechizos.add(HechizoFactory.obtenerHechizo("avada kedavra"));
        listaHechizos.add(HechizoFactory.obtenerHechizo("expelliarmus"));
        listaHechizos.add(HechizoFactory.obtenerHechizo("protego"));
        
        return listaHechizos;
    }
}
