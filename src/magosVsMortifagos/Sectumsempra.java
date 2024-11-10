package magosVsMortifagos;

public class Sectumsempra implements Hechizo{
	private String nombre = "Sectumsempra";
	private int danioBase = 20;	
	
	@Override
    public void ejecutar(Personaje lanzador, Personaje objetivo) {
		if(objetivo.tieneProtego()) {
			System.out.println(objetivo.getNombre() + " tenia protego y ha desviado el ataque.\n");
			objetivo.setProtegido(false);
			return;
		}
		double danioTotal = danioBase * lanzador.getVarita().multAtaq;
        System.out.println("\n-----------------\n" 
        		+ objetivo.getNombre() + " ha recibido Sectumsempra\n.");
        System.out.println("\n-----------------\n" 
        		+ objetivo.getNombre() + " ha recibido " + danioTotal + " Puntos de daño");
        objetivo.reducirPuntosDeVida(danioTotal);
        if (objetivo.estaVivo()) {
			System.out.println(objetivo.getNombre() + " puntos de salud restantes: " + objetivo.getVida());
		} else {
			System.out.println(objetivo.getNombre() + " ha sido derrotado por " + lanzador.getNombre());
		}
    }

	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}
	
	public String toString() {
		return nombre + " - Causa graves cortes profundos\n";
	}
}
