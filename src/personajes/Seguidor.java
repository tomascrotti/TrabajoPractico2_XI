package personajes;

import java.util.ArrayList;
import java.util.List;

import hechizos.Hechizo;
import hechizos.HechizoFactory;
import magosVsMortifagos.Dado;
import magosVsMortifagos.Varita;

public class Seguidor extends Mortifago {
	
	private static ArrayList<Hechizo> hechizos = generarHechizosIniciales();
    
	public Seguidor(String nombre){
        super(nombre, 75, 1, hechizos, Varita.PROFESIONAL, Dado.SEISCARAS);
    }
    
    private static ArrayList<Hechizo> generarHechizosIniciales() {
    	ArrayList<Hechizo> listaHechizos = new ArrayList<>();
        listaHechizos.add(HechizoFactory.obtenerHechizo("Sectumsempra"));
        listaHechizos.add(HechizoFactory.obtenerHechizo("Protego"));
        listaHechizos.add(HechizoFactory.obtenerHechizo("Expelliarmus"));
        return listaHechizos;
    }

	@Override
	public Hechizo decidirHechizo(Personaje objetivo) {
		if(objetivo.pocaVida()) {
			
		}
		return null;
	}
}
