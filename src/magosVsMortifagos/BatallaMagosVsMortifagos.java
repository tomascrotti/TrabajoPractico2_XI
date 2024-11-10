package magosVsMortifagos;

import java.util.Random;

public class BatallaMagosVsMortifagos {
	
	public void iniciarBatalla(Batallon batallonMagos, Batallon batallonMortifagos) {
		int turno = 1;
		System.out.println("\n--------------------\nEquipo de Magos:");
		batallonMagos.listarPersonajes();
		System.out.println("\n--------------------\nEquipo de Mortifagos:");
		batallonMortifagos.listarPersonajes();

		Random rand = new Random();
		System.out.println("\n ____________________________________________\n" 
						   + "|COMIENZA LA BATALLA ENTRE MAGOS Y MORTIFAGOS|\n"
						   + "¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯\n");

		while (batallonMagos.tienePersonajesSaludables() && batallonMortifagos.tienePersonajesSaludables()) {
			System.out.println("Turno " + turno + "\n");
			if (rand.nextBoolean()) {
				System.out.println("Magos atacan primero\n");
				batallonMagos.atacar(batallonMortifagos);
				if (batallonMortifagos.tienePersonajesSaludables()) {
					System.out.println("\nTurno de los mortifagos\n");
					batallonMortifagos.atacar(batallonMagos);
				}
			} else {
				System.out.println("Mortifagos atacan primero\n");
				batallonMortifagos.atacar(batallonMagos);
				if (batallonMagos.tienePersonajesSaludables()) {
					System.out.println("Turno de los magos\n");
					batallonMagos.atacar(batallonMortifagos);
				}
			}

			System.out.println("----------------------------");
			System.out.println("\n--------------------\nEquipo de Magos:\n");
			batallonMagos.listarPersonajes();
			System.out.println("\n--------------------\nEquipo de Mortifagos:\n");
			batallonMortifagos.listarPersonajes();

		}

		if (batallonMagos.tienePersonajesSaludables()) {
			System.out.println("¡Los magos han ganado la batalla!");
		} else {
			System.out.println("¡Los mortífagos han ganado la batalla!");
		}
	}
}
