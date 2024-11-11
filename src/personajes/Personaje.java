package personajes;

import java.util.ArrayList;
import hechizos.Hechizo;
import magosVsMortifagos.Dado;
import magosVsMortifagos.EstrategiaProlog;
import magosVsMortifagos.Varita;




public abstract class Personaje {
    protected String nombre;
    protected double puntosVidaMax;
    protected double puntosVida;
    protected int nivelDeMagia;
    protected ArrayList<Hechizo> hechizos;
    protected Varita varita;
    protected boolean tieneVarita = true;
    protected boolean protegido = false;
    protected EstrategiaProlog estrategia;
    protected Dado dado;
    
    public Personaje(String nombre, double puntosVida, int nivelDeMagia, Varita varita, Dado dado) {
		this.nombre = nombre;
		this.puntosVida = puntosVidaMax = puntosVida;
		this.nivelDeMagia = nivelDeMagia;
		this.hechizos = generarHechizosIniciales();
		this.varita = varita;
		this.estrategia = new EstrategiaProlog();
		this.dado = dado;
    }
    
	protected abstract ArrayList<Hechizo> generarHechizosIniciales();

	public String getNombre() {
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
    
    public ArrayList<Hechizo> getHechizos() {
        return this.hechizos;
    }
        
    public abstract void lanzarHechizo(Hechizo hechizo, Personaje objetivo);

    public int lanzarDado() {
    	return this.dado.lanzar();
    }
    
    public void quitarVarita(Personaje objetivo) {
    	if(this.lanzarDado() == 1)
    		objetivo.setTieneVarita(false);
    }

    public Varita getVarita() {
        return varita;
    }

    public void setVarita(Varita varita) {
        this.varita = varita;
    }
    
    public void cambiarVarita(Personaje objetivo) {
    	if(estrategia.ejecutarConsulta(this.getNombre(), objetivo.getNombre())) {
    		this.setVarita(objetivo.getVarita());
    	}
    }
        
    public boolean tieneVarita() {
    	return tieneVarita;
    }
    
    public void setTieneVarita(boolean tieneVarita) {
    	this.tieneVarita = tieneVarita;
    	if(!this.tieneVarita()) {
    		System.out.println(this.getNombre() + " ha perdido su varita");
    	} else {
    		System.out.println(this.getNombre() + " ha recuperado su varita");
    	}    	
    }
 
    public void reducirPuntosDeVida(double cantidad) {
    	this.puntosVida -= cantidad;
    }
    public void recuperarVarita() {
        this.tieneVarita = true;
        System.out.println(nombre + " ha recuperado su varita y puede lanzar hechizos nuevamente.");
    }
    
    public abstract Hechizo decidirHechizo(Personaje objetivo);
    
    public boolean pocaVida() {
    	return this.getVida() < this.puntosVidaMax * 0.4;
    }
    
	@Override
	public String toString() {
		return nombre + ":\n - PS: " + puntosVida + " | " + puntosVidaMax
				+ "\n - Hechizos Disponibles:\n" + hechizos
				+ "\n - " + varita
				+ "\n - Tiene Varita Disponible: " + (tieneVarita() ? "Si" : "No")
				+ "\n - Tiene Protego: " + (tieneProtego() ? "Si" : "No")
				+ "\n - " + dado + "\n";
	}

	public void setProtegido(boolean b) {
		this.protegido = b;
    	if(!this.tieneProtego()) {
    		System.out.println(this.getNombre() + " ha perdido Protego");
    	} else {
    		System.out.println(this.getNombre() + " es protegido por Protego");
    	}    
	}

	public boolean tieneProtego() {
		return this.protegido;
	}

}
