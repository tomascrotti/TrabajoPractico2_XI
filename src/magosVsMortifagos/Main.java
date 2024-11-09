package magosVsMortifagos;

public class Main {

	public static void main(String[] args) {
		Mago harry = new Auror("Harry El Sucio Potter", 3, 100);
		Mortifago videla = new Mortifago("Luquitas Videla", 2, 100, Varita.PROFESIONAL);
		
		System.out.println(videla.puntosVida + "\n");
		harry.lanzarHechizo(new AvadaKedavra(), videla);
		System.out.println(videla.puntosVida);
	}
}
