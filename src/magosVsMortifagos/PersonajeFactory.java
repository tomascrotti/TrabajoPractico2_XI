package magosVsMortifagos;

import java.util.Random;

import personajes.Auror;
import personajes.Comandante;
import personajes.Estudiante;
import personajes.Personaje;
import personajes.Profesor;
import personajes.Seguidor;

public class PersonajeFactory {
		
    public static Personaje crearMago() {   	
    	int rand = new Random().nextInt(10)+1;
    	return switch (rand) {
	    	case 1,2,3,4 -> new Estudiante("Estudiante");
	    	case 5,6,7,8 -> new Profesor("Profesor");
	    	case 9,10 -> new Auror("Auror");
	    	
	    	default -> throw new IllegalArgumentException("Tipo de Mago desconocido");
	    };
    }

    public static Personaje crearMortifago() {
    	int rand = new Random().nextInt(10)+1;
    	return switch (rand) {
	    	case 1,2,3,4,5,6 -> new Seguidor("Seguidor");
	    	case 7,8,9,10 -> new Comandante("Comandante");
	    		    	
	    	default -> throw new IllegalArgumentException("Tipo de Mortifago desconocido");
	    };
    }

}
