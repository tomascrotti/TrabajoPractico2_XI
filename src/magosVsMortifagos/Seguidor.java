package magosVsMortifagos;

import java.util.ArrayList;
import java.util.List;

public class Seguidor extends Mortifago {
	
	private static List<Hechizo> hechizos = generarHechizosIniciales();
    
	public Seguidor(String nombre){
        super(nombre, 75, 1, hechizos, Varita.EXPERTO, Dado.SEISCARAS);
    }
    
    private static List<Hechizo> generarHechizosIniciales() {
        List<Hechizo> listaHechizos = new ArrayList<>();
        listaHechizos.add(HechizoFactory.obtenerHechizo("expelliarmus"));
        listaHechizos.add(HechizoFactory.obtenerHechizo("protego"));
        listaHechizos.add(HechizoFactory.obtenerHechizo("avada kedavra"));
        
        return listaHechizos;
    }
    
}
