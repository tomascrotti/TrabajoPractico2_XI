package magosVsMortifagos;

public enum Varita {
	PRINCIPIANTE("Acebo",1,1.2), PROFESIONAL("Vid",1.5,1.5), EXPERTO("Sauco",2,1.7), LEGENDARIA("Roble oscuro", 2, 2);
	
	final String nombre;
	final double multAtaq;
	final double multDefe;
	
	Varita(String nombre, double multAtaq, double multDefe){
		this.nombre = nombre;
		this.multDefe = multDefe;
		this.multAtaq = multAtaq;
	}
}
