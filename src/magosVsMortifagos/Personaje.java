package magosVsMortifagos;

import java.util.List;

public abstract class Personaje {
    protected String nombre;
    protected double puntosVidaMax;
    protected double puntosVida;
    protected double defensa;
    protected List<Hechizo> hechizos;
    protected Varita varita;
    protected boolean tieneVarita = true;
    protected Dado dado;
    
    public Personaje(String nombre, double puntosVida, Varita varita, Dado dado) {
		this.nombre = nombre;
		this.puntosVida = puntosVidaMax = puntosVida;
		this.defensa = 1;
		this.varita = varita;
		this.dado = dado;
    }
    
    public abstract void lanzarHechizo(Hechizo hechizo, Personaje objetivo);

    public boolean lanzarDado() {
    	int lanzamiento = this.dado.lanzar();
    	System.out.println("Ha salido " + lanzamiento);
    	if(lanzamiento == 1) {
    		return true;
    	} else {
    		return false;
    	}
    		
    }
    
    public double getDefensa() {
    	return this.defensa;
    }
    
    public void aumentarDefensa(double armadura) {
    	this.defensa += armadura;
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

	protected String getNombre() {
		return this.nombre;
	}
    
}
