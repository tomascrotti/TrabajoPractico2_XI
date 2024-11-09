package magosVsMortifagos;

import java.util.List;

public abstract class Personaje {
    protected String nombre;
    protected int nivelMagia;
    protected double puntosVidaMAX;
    protected double puntosVida;
    protected List<Hechizo> hechizos;
    protected Varita varita;
    
    public void lanzarHechizo(Hechizo hechizo, Personaje objetivo) {
		hechizo.ejecutar(objetivo);
	}
    
}
