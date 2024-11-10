package magosVsMortifagos;

import personajes.Mortifago;
import personajes.Personaje;
import personajes.PersonajeFactory;

public class BatallonMortifagos extends Batallon {
	
	public BatallonMortifagos(int cantidad) {
		super("MORTIFAGOS");
		generarBatallon(cantidad);
	}

	@Override
	public void agregarPersonaje(Personaje p) {
        if (p instanceof Mortifago) {
            personajes.add(p);
        } else {
            throw new IllegalArgumentException("Solo se pueden agregar Mortífagos a un batallón de Mortífagos.");
        }		
	}
	
	@Override
	public void generarBatallon(int cantidad) {
		for (int i = 0; i < cantidad; i++) {
			this.agregarPersonaje(PersonajeFactory.crearMortifago());
		}
	}
}
