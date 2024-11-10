package magosVsMortifagos;

import java.util.Random;

public class BatallaMagosVsMortifagos {
	  public void iniciarBatalla() {
	    Batallon batallonMagos = new Batallon();
	    Batallon batallonMortifagos = new Batallon();

	    for (int i = 0; i < 2; i++) {
	      batallonMagos.agregarPersonaje(PersonajeFactory.crearMago());
	      batallonMortifagos.agregarPersonaje(PersonajeFactory.crearMortifago());
	    }
	    System.out.println("\n--------------------\nEquipo de Magos:");
	    batallonMagos.listarPersonajes();
	    System.out.println("\n--------------------\nEquipo de Mortifagos:");
	    batallonMortifagos.listarPersonajes();

	    Random rand = new Random();
	    System.out.println("\n ____________________________________________\n"
	    				   + "|COMIENZA LA BATALLA ENTRE MAGOS Y MORTIFAGOS|\n"
	    				   + "¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯\n");	    
	    
	    while (batallonMagos.tienePersonajesSaludables() && batallonMortifagos.tienePersonajesSaludables()) {

	      // los ataques pueden tener salidas por pantalla para mostrar lo que sucede
	      if (rand.nextBoolean()) {
	        batallonMagos.atacar(batallonMortifagos);
	        if (batallonMortifagos.tienePersonajesSaludables()) {
	          batallonMortifagos.atacar(batallonMagos);
	        }
	      } else {
	        batallonMortifagos.atacar(batallonMagos);
	        if (batallonMagos.tienePersonajesSaludables()) {
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
