package magosVsMortifagos;

import java.util.ArrayList;
public abstract class Personaje {
    protected String nombre;
    protected double puntosVidaMax;
    protected double puntosVida;
    protected int nivelDeMagia;
    protected double defensa;
    protected ArrayList<Hechizo> hechizos;
    protected Varita varita;
    protected boolean tieneVarita = true;
    protected boolean protegido = false;
    protected Dado dado;
    
    public Personaje(String nombre, double puntosVida, int nivelDeMagia, ArrayList<Hechizo> hechizos, Varita varita, Dado dado) {
		this.nombre = nombre;
		this.puntosVida = puntosVidaMax = puntosVida;
		this.nivelDeMagia = nivelDeMagia;
		this.defensa = 1;
		this.hechizos = hechizos;
		this.varita = varita;
		this.dado = dado;
    }
    
	protected String getNombre() {
		return this.nombre;
	}
    
    public double getVida() {
		return puntosVida;
	}
    
    public boolean estaVivo() {
    	if(this.puntosVida > 0)
    		return true;
    	return false;
    }
        
    public abstract void lanzarHechizo(Hechizo hechizo, Personaje objetivo);

    public boolean lanzarDado() {
    	int lanzamiento = this.dado.lanzar();
    	if(lanzamiento == 1) {
    		return true;
    	} else {
    		return false;
    	}
    		
    }
    
    public double getDefensa() {
    	return this.defensa;
    }
    
    public Varita getVarita() {
        return varita;
    }

    public void setVarita(Varita varita) {
        this.varita = varita;
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

	@Override
	public String toString() {
		return "\n" + nombre + ":\n - PS: " + puntosVida + " | " + puntosVidaMax
				+ "\n - Defensa: " + defensa
				+ "\n - Hechizos Disponibles:\n" + hechizos
				+ "\n - " + varita
				+ "\n - Tiene Varita Disponible: " + (tieneVarita ? "Si" : "No")
				+ "\n - " + dado;
	}

	public void setProtegido(boolean b) {
		this.protegido = b;
	}

	public boolean tieneProtego() {
		return this.protegido;
	}
    
}
