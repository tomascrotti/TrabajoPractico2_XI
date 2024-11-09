package magosVsMortifagos;

public class AvadaKedavra implements Hechizo {
	private String nombre = "Avada Kedavra";
	private double danioBase = 25;

	@Override
    public void ejecutar(Personaje objetivo) {
        // Lógica para infligir daño letal
        System.out.println(objetivo.getNombre() + " ha recibido " + danioBase + " Puntos de daño");
        objetivo.reducirPuntosDeVida(danioBase); // Reduce la vida a cero
    }

	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}
}
