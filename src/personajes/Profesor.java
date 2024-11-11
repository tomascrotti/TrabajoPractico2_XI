package personajes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import hechizos.Hechizo;
import hechizos.HechizoFactory;
import magosVsMortifagos.Dado;
import magosVsMortifagos.Varita;

public class Profesor extends Mago {

    public Profesor(String nombre) {
        super(nombre, 100, 3, Varita.EXPERTO, Dado.CUATROCARAS);
    }
    
	@Override
    protected ArrayList<Hechizo> generarHechizosIniciales() {
    	ArrayList<Hechizo> listaHechizos = new ArrayList<>();
    	listaHechizos.add(HechizoFactory.obtenerHechizo("Protego"));
    	listaHechizos.add(HechizoFactory.obtenerHechizo("Sectumsempra"));        
    	listaHechizos.add(HechizoFactory.obtenerHechizo("Expelliarmus"));
        return listaHechizos;
    }

	@Override
	public Hechizo decidirHechizo(Personaje objetivo) {
		Hechizo hechizoSeleccionado = null;
		Random rand = new Random();
		double probabilidad = rand.nextDouble();
		if (objetivo.pocaVida()) {
			hechizoSeleccionado = this.hechizos.get(1);
		} else if (objetivo.tieneVarita() && probabilidad < 0.6) {
			hechizoSeleccionado = this.hechizos.get(2);
		} else if(!this.tieneProtego()){
			hechizoSeleccionado = this.hechizos.get(rand.nextInt(3));			
		} else {
			hechizoSeleccionado = this.hechizos.get(1);
		}
		return hechizoSeleccionado;			
	}
}
