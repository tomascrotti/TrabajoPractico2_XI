package magosVsMortifagos;

public class Main {

	public static void main(String[] args) {
		Mago harry = new Mago("Harry El Sucio Potter", 3, 100, Varita.PRINCIPIANTE);
		Mortifago videla = new Mortifago("Luquitas Videla", 2, 100, Varita.PROFESIONAL);
		
		harry.lanzarHechizo(new AvadaKedavra(), videla);
		System.out.println(videla.puntosVida);
	}
}
