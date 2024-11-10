package magosVsMortifagos;

import java.util.Random;

public class BatallaMagosVsMortifagos {
	
	public void estadoDeBatallon(Batallon b) {
		System.out.println("BATALLON DE " + b.getNombre());
		if(!b.tienePersonajesSaludables()) {
			System.out.println("No tiene miembros vivos");
		} else {
			b.listarPersonajes();			
		}
	}
	
	public void iniciarBatalla(Batallon batallonMagos, Batallon batallonMortifagos) {
		if(batallonMagos.getPersonajes().size() == 0 && batallonMortifagos.getPersonajes().size() == 0) {
			System.out.println("Ningun batallón posee miembros para luchar");
			return;
		}
		int ronda = 1;
		
		estadoDeBatallon(batallonMagos);
		estadoDeBatallon(batallonMortifagos);
		
		Random rand = new Random();
		System.out.println("\n ____________________________________________\n" 
						   + "|COMIENZA LA BATALLA ENTRE MAGOS Y MORTIFAGOS|\n"
						   + "¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");

		while (batallonMagos.tienePersonajesSaludables() && batallonMortifagos.tienePersonajesSaludables()) {
			System.out.println("█ Ronda " + ronda++ + " █");
			if (rand.nextBoolean()) {
				System.out.println("\n-- Turno de los Magos\n");
				batallonMagos.atacar(batallonMortifagos);
				if (batallonMortifagos.tienePersonajesSaludables()) {
					System.out.println("\n-- Turno de los mortifagos\n");
					batallonMortifagos.atacar(batallonMagos);
				}
			} else {
				System.out.println("\n-- Turno de los mortifagos\n");
				batallonMortifagos.atacar(batallonMagos);
				if (batallonMagos.tienePersonajesSaludables()) {
					System.out.println("\n-- Turno de los magos\n");
					batallonMagos.atacar(batallonMortifagos);
				}
			}

			estadoDeBatallon(batallonMagos);
			estadoDeBatallon(batallonMortifagos);
			
		}

		if (batallonMagos.tienePersonajesSaludables()) {
			System.out.println("\n¡Los magos han ganado la batalla!\n");
		} else {
			System.out.println("\n¡Los mortífagos han ganado la batalla!\n");
		}
	}
}
