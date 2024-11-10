package magosVsMortifagos;

public enum Varita {
	PRINCIPIANTE("Acebo",1,0.2), PROFESIONAL("Vid",1.5,0.3),
	EXPERTO("Roble oscuro",2,0.4), LEGENDARIA("Sauco", 2, 0.6);
	
	final String nombre;
	final double multAtaq;
	final double multDefe;
	
	Varita(String nombre, double multAtaq, double multDefe){
		this.nombre = nombre;
		this.multAtaq = multAtaq;
		this.multDefe = multDefe;
	}
	
	@Override
	public String toString() {
		return "Varita: " + this.nombre
				+ "\n     - Multiplicador de ataque: x" + this.multAtaq
				+ "\n     - Porcentaje de defensa: %" + this.multDefe * 100; 
	}
}
