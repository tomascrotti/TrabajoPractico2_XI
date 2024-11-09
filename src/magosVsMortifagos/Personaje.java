package magosVsMortifagos;

import java.util.List;

public abstract class Personaje {
    protected String nombre;
    protected int nivelMagia;
    protected double puntosVidaMax;
    protected double puntosVida;
    protected List<Hechizo> hechizos;
    protected Varita varita;
    
    public Personaje(String nombre, int nivelMagia, double puntosVida, Varita varita) {
		this.nombre = nombre;
		this.nivelMagia = nivelMagia;
		this.puntosVida = puntosVida;
		this.puntosVidaMax = puntosVida;
		this.varita = varita;
    }
    

    public void lanzarHechizo(Hechizo hechizo, Personaje objetivo) {
		hechizo.ejecutar(objetivo);
	}
    
}
