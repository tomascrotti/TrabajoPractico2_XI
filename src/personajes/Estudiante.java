package personajes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import hechizos.Hechizo;
import hechizos.HechizoFactory;
import hechizos.Sectumsempra;
import magosVsMortifagos.Dado;
import magosVsMortifagos.Varita;

public class Estudiante extends Mago {

	public Estudiante(String nombre) {
		super(nombre, 50, 1, Varita.PRINCIPIANTE, Dado.SEISCARAS);
	}
	
	@Override
    protected ArrayList<Hechizo> generarHechizosIniciales() {
		ArrayList<Hechizo> listaHechizos = new ArrayList<>();
		listaHechizos.add(HechizoFactory.obtenerHechizo("Protego"));
		listaHechizos.add(HechizoFactory.obtenerHechizo("Sectumsempra"));
		return listaHechizos;
	}
    
	@Override
	public Hechizo decidirHechizo(Personaje objetivo) {
		Hechizo hechizoSeleccionado = null;
		Random rand = new Random();
		if (!this.tieneProtego()) {
			hechizoSeleccionado = hechizos.get(0);
		} else if (objetivo.pocaVida()) {
			hechizoSeleccionado = hechizos.get(1);
		} else {
			hechizoSeleccionado = hechizos.get(rand.nextInt(2));
		}
		return hechizoSeleccionado;
	}

}
