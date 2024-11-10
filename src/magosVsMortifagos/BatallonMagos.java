package magosVsMortifagos;

import personajes.Mago;
import personajes.Personaje;

public class BatallonMagos extends Batallon {
	
	@Override
	public void agregarPersonaje(Personaje p) {
        if (p instanceof Mago) {
            personajes.add(p);
        } else {
            throw new IllegalArgumentException("Solo se pueden agregar Mortífagos a un batallón de Mortífagos.");
        }		
	}
	
	@Override
	public void generarBatallon(int cantidad) {
		for (int i = 0; i < cantidad; i++) {
			this.agregarPersonaje(PersonajeFactory.crearMago());
		}
	}
	
}
