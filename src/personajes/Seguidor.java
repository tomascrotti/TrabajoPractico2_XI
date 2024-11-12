package personajes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import hechizos.Hechizo;
import hechizos.HechizoFactory;
import magosVsMortifagos.Dado;
import magosVsMortifagos.Varita;

public class Seguidor extends Mortifago {
	
	public Seguidor(String nombre){
        super(nombre, 75, 2, Varita.PROFESIONAL, Dado.SEISCARAS);
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
