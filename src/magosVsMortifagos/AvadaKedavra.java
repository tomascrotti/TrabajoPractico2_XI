package magosVsMortifagos;

public class AvadaKedavra implements Hechizo {
	
	private String nombre = "Avada Kedavra";
	private double danioBase = 25;

	@Override
    public void ejecutar(Personaje lanzador, Personaje objetivo) {
        double danioTotal = danioBase * lanzador.getVarita().multAtaq * objetivo.getDefensa();
        System.out.println(objetivo.getNombre() + " ha recibido " + danioTotal + " Puntos de daño");
        objetivo.reducirPuntosDeVida(danioTotal);
    }

	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}
}
