package hechizos;
import personajes.Personaje;

public class Accion {
    private Hechizo hechizo;
    private Personaje objetivo;

    public Accion(Hechizo hechizo, Personaje objetivo) {
        this.hechizo = hechizo;
        this.objetivo = objetivo;
    }

    public Hechizo getHechizo() {
        return hechizo;
    }

    public Personaje getObjetivo() {
        return objetivo;
    }
}
