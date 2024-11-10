package magosVsMortifagos;

public class Main {

	public static void main(String[] args) {
		Batallon batallonMagos = new Batallon();
		
		batallonMagos.agregarPersonaje(PersonajeFactory.crearMago());
		batallonMagos.agregarPersonaje(PersonajeFactory.crearMago());
		batallonMagos.agregarPersonaje(PersonajeFactory.crearMortifago());
		batallonMagos.listarPersonajes();
	}
}
