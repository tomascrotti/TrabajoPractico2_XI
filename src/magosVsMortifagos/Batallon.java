package magosVsMortifagos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Batallon {

    private List<Personaje> personajes;
    private Map<Personaje, List<Hechizo>> registroHechizos;
    private Set<Hechizo> hechizosUtilizados;

    public Batallon() {
        this.personajes = new ArrayList<>();
        this.registroHechizos = new HashMap<>();
        this.hechizosUtilizados = new HashSet<>();
    }
    
    public void listarPersonajes() {
    	for(Personaje p : personajes) {
    		System.out.println("\n" + p);
    	}
    }

    public void atacar(Batallon otroBatallon) {
    	for(Personaje atacante : personajes) {
    		Personaje objetivo = otroBatallon.obtenerPersonajeSaludable();
    		if(objetivo != null) {
    			atacante.lanzarHechizo(atacante.hechizos.get(0),objetivo);
    			if(!objetivo.estaVivo()) {
    				
    			}
    			//HABRÍA QUE CAMBIAR QUE NO SOLO ATAQUE SINO QUE DECIDA
    			// Y ALGUNA MANERA DE AGREGARLE HECHIZOS AL ArrayList
    		}
    	}
    }
    
    private Personaje obtenerPersonajeSaludable() {
    	for(Personaje p : personajes) {
    		if(p.estaVivo()) {
    			return p;
    		}
    	}
    	return null;
    } 

    public boolean tienePersonajesSaludables() {
        return personajes.isEmpty();
    }

    public void agregarPersonaje(Personaje p) {
        personajes.add(p);
    }

}
