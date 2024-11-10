package hechizos;

import personajes.Personaje;

public class AvadaKedavra implements Hechizo {
	
	private String nombre = "Avada Kedavra";
	
	@Override
    public void ejecutar(Personaje lanzador, Personaje objetivo) {
		if(objetivo.tieneProtego()) {
			System.out.println(objetivo.getNombre() + " tenia protego y ha desviado el ataque.\n");
		}
        System.out.println("\n-----------------\n" 
        		+ objetivo.getNombre() + " ha recibido Avada Kedavra\n.");
        objetivo.reducirPuntosDeVida(objetivo.getVida());
		System.out.println(objetivo.getNombre() + " ha sido derrotado por " + lanzador.getNombre());
    }

	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}
	
	public String toString() {
		return nombre + " - Ataca con un gran daño\n";
	}
	
}
