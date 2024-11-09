package magosVsMortifagos;

import java.util.List;

public abstract class Personaje {
    protected String nombre;
    protected int nivelMagia;
    protected double puntosVidaMax;
    protected double puntosVida;
    protected List<Hechizo> hechizos;
    protected Varita varita;
    protected boolean tieneVarita = true;
    
    public Personaje(String nombre, int nivelMagia, double puntosVida, Varita varita) {
		this.nombre = nombre;
		this.nivelMagia = nivelMagia;
		this.puntosVida = puntosVidaMax = puntosVida;
		this.varita = varita;
    }
    

    public void lanzarHechizo(Hechizo hechizo, Personaje objetivo) {
        if (!tieneVarita) {
            System.out.println(nombre + " no puede lanzar hechizos porque no tiene su varita.");
            return;
        }
        hechizo.ejecutar(objetivo);
    }
    
    public void reducirPuntosDeVida(double cantidad) {
    	this.puntosVida -= cantidad;
    }
    
    public boolean tieneVarita() {
    	return tieneVarita;
    }
    
    public void setTieneVarita(boolean tieneVarita) {
        this.tieneVarita = tieneVarita;
    }
    
    public void recuperarVarita() {
        this.tieneVarita = true;
        System.out.println(nombre + " ha recuperado su varita y puede lanzar hechizos nuevamente.");
    }

	protected String getNombre() {
		return this.nombre;
	}
    
}
