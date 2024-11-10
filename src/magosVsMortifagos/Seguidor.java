package magosVsMortifagos;

import java.util.ArrayList;
import java.util.List;

public class Seguidor extends Mortifago {
	
	private static ArrayList<Hechizo> hechizos = generarHechizosIniciales();
    
	public Seguidor(String nombre){
        super(nombre, 75, 1, hechizos, Varita.EXPERTO, Dado.SEISCARAS);
    }
    
    private static ArrayList<Hechizo> generarHechizosIniciales() {
    	ArrayList<Hechizo> listaHechizos = new ArrayList<>();
        listaHechizos.add(HechizoFactory.obtenerHechizo("avada kedavra"));
        listaHechizos.add(HechizoFactory.obtenerHechizo("expelliarmus"));
        listaHechizos.add(HechizoFactory.obtenerHechizo("protego"));
        
        return listaHechizos;
    }
    
}
