package magosVsMortifagos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import hechizos.Hechizo;
import personajes.Personaje;

public abstract class Batallon {

    protected List<Personaje> personajes;
    private Map<Personaje, ArrayList<Hechizo>> registroHechizos;
    private Set<Hechizo> hechizosUtilizados;

    public Batallon() {
        this.personajes = new ArrayList<>();
        this.registroHechizos = new HashMap<>();
        this.hechizosUtilizados = new HashSet<>();
    }
    
    public abstract void generarBatallon(int cantidad);
    
    public abstract void agregarPersonaje(Personaje p);

    public void listarPersonajes() {
    	for(Personaje p : personajes) {
    		System.out.println(p);
    	}
    }

    public void atacar(Batallon otroBatallon) {
    	for(Personaje atacante : personajes) {
    		Personaje objetivo = otroBatallon.seleccionarObjetivo();
    		if(objetivo != null) {
    			atacante.lanzarHechizo(atacante.getHechizos().get(0),objetivo);
    			if(!objetivo.estaVivo()) {
    				otroBatallon.haSidoDerrotado(objetivo);
    			}
    			// HABRÍA QUE CAMBIAR QUE NO SOLO ATAQUE SINO QUE DECIDA
    			// CON PROLOG
    		}
    	}
    }
    
    private void haSidoDerrotado(Personaje objetivo) {
    	this.personajes.remove(objetivo);
    	System.out.println(objetivo.getNombre() + " ha sido eliminado del batallón.");
    }
    
    private Personaje seleccionarObjetivo() {
        List<Personaje> personajesSaludables = personajes.stream().filter(p -> p.getVida() > 0).toList();
        if(personajesSaludables.isEmpty())
        	return null;
        return personajesSaludables.get(new Random().nextInt(personajesSaludables.size()));
    }
    
    public boolean tienePersonajesSaludables() {
        return !personajes.isEmpty();
    }

    public List<Personaje> getPersonajes() {
        return personajes;
    }

}
