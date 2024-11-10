package magosVsMortifagos;

public enum Varita {
	PRINCIPIANTE("Acebo",1), PROFESIONAL("Vid",1.5),
	EXPERTO("Roble oscuro",2), LEGENDARIA("Sauco",2);
	
	final String nombre;
	final double multAtaq;
		
	Varita(String nombre, double multAtaq) {
		this.nombre = nombre;
		this.multAtaq = multAtaq;
	}
	
	@Override
	public String toString() {
		return "Varita: " + this.nombre
				+ "\n     - Multiplicador de ataque: x" + this.multAtaq; 
	}
}
