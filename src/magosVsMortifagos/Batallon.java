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

    public void atacar(Batallon batallonMortifagos) {

    }

    public boolean tienePersonajesSaludables() {
        return personajes.isEmpty();
    }

    public void agregarPersonaje(Personaje p) {
        personajes.add(p);
    }

}
