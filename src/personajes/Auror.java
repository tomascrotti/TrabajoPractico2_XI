package personajes;

import java.util.ArrayList;
import java.util.Random;

import hechizos.Hechizo;
import hechizos.HechizoFactory;
import magosVsMortifagos.Dado;
import magosVsMortifagos.Varita;

public class Auror extends Mago {
		
	public Auror (String nombre) {
        super(nombre, 125, 4, Varita.LEGENDARIA, Dado.DOSCARAS);
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
		Hechizo hechizoSeleccionado = null;
		Random rand = new Random();
		double probabilidad = rand.nextDouble();
		if (objetivo.tieneProtego() && this.tieneProtego()) {
			hechizoSeleccionado = this.hechizos.get(1);
		} else if (!this.pocaVida() && probabilidad < 0.20) {
			hechizoSeleccionado = this.hechizos.get(3);
		} else if (objetivo.tieneVarita()){
			hechizoSeleccionado = this.hechizos.get(2);			
		} else if (this.pocaVida()) {
			hechizoSeleccionado = this.hechizos.get(0);
		} else {
			hechizoSeleccionado = this.hechizos.get(rand.nextInt(4));
		}
			
		return hechizoSeleccionado;			
	}
}
