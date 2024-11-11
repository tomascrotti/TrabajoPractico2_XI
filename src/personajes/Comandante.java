package personajes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import hechizos.Hechizo;
import hechizos.HechizoFactory;
import magosVsMortifagos.Dado;
import magosVsMortifagos.Varita;

public class Comandante extends Mortifago {
	public Comandante(String nombre) {
		super(nombre, 125, 3, Varita.EXPERTO, Dado.CUATROCARAS);
	}
	
	@Override
    protected ArrayList<Hechizo> generarHechizosIniciales() {
    	ArrayList<Hechizo> listaHechizos = new ArrayList<>();
    	listaHechizos.add(HechizoFactory.obtenerHechizo("Protego"));
        listaHechizos.add(HechizoFactory.obtenerHechizo("Sectumsempra"));
        listaHechizos.add(HechizoFactory.obtenerHechizo("Expelliarmus"));
        listaHechizos.add(HechizoFactory.obtenerHechizo("Avada kedavra"));
        return listaHechizos;
    }

	@Override
	public Hechizo decidirHechizo(Personaje objetivo) {
		Hechizo hechizoSeleccionado;
		Random rand = new Random();
		double probabilidad = rand.nextDouble();
		if (probabilidad < 0.1)
			hechizoSeleccionado = this.hechizos.get(3);
		if (!this.tieneProtego() && this.pocaVida()) {
			hechizoSeleccionado = this.hechizos.get(0);
		} else if (objetivo.tieneVarita()) {
			hechizoSeleccionado = this.hechizos.get(2);
		} else {
			hechizoSeleccionado = this.hechizos.get(1);			
		}
		return hechizoSeleccionado;			
	}
}
