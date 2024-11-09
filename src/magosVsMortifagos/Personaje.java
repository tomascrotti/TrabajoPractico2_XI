package magosVsMortifagos;

import java.util.List;

public class Personaje {
    protected String nombre;
    protected int nivelMagia;
    protected double puntosVidaMax;
    protected double puntosVida;
    protected List<Hechizo> hechizos;
    protected Varita varita;
    
    public Personaje(String nombre, int nivelMagia, double puntosVida, Varita varita) {
		this.nombre = nombre;
		this.nivelMagia = nivelMagia;
		this.puntosVida = puntosVidaMax = puntosVida;
		this.varita = varita;
    }
    

    public void lanzarHechizo(Hechizo hechizo, Personaje objetivo) {
    	
    }
    
    public void recibirDaño(int danio) {
      puntosVida -= danio;
      if (puntosVida <= 0) {
          puntosVida = 0;
          System.out.println(nombre + " ha sido derrotado.");
      } else {
          System.out.println(nombre + " ahora tiene " + puntosVida + " puntos de salud.");
      }
  }
}
