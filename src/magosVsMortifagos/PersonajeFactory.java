package magosVsMortifagos;

import java.util.Random;

public class PersonajeFactory {
		
    public static Personaje crearMago() {   	
    	Random rand = new Random();
    	return switch (rand.nextInt(3) + 1) {
	    	case 1 -> new Estudiante("Estudiante");
	    	case 2 -> new Profesor("Profesor");
	    	case 3 -> new Auror("Auror");
	    	
	    	// 	OTROS HECHIZOS
	    	default -> throw new IllegalArgumentException("Tipo de Mago desconocido");
	    };
    }

    public static Personaje crearMortifago() {
    	Random rand = new Random();
    	return switch (rand.nextInt(2) + 1) {
	    	case 1 -> new Seguidor("Seguidor");
	    	case 2 -> new Comandante("Comandante");
	    		    	
	    	// 	OTROS HECHIZOS
	    	default -> throw new IllegalArgumentException("Tipo de Mortifago desconocido");
	    };
    }

}
