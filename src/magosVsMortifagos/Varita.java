package magosVsMortifagos;

public class Varita {
	private String nombre;
	private double multAtaq;
	private double multDefe;
	
	public Varita(String nombre, double multAtaq, double multDefe) {
		this.nombre = nombre;
		this.multAtaq = multAtaq;
		this.multDefe = multDefe;
	}

	public String getNombre() {
		return nombre;
	}

	public double getMultAtaq() {
		return multAtaq;
	}

	public double getMultDefe() {
		return multDefe;
	}
}
