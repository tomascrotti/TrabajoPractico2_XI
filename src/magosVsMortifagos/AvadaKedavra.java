package magosVsMortifagos;

public class AvadaKedavra implements Hechizo {
	
	private String nombre = "Avada Kedavra";
	private double danioBase = 25;

	@Override
    public void ejecutar(Personaje lanzador, Personaje objetivo) {
        double danioTotal = danioBase * lanzador.getVarita().multAtaq * objetivo.getDefensa();
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
		return "Avada Kedavra - Ataca con un gran daño\n";
	}
	
}
