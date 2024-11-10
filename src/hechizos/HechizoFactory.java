package hechizos;

public class HechizoFactory {
	
	public static Hechizo obtenerHechizo(String nombreHechizo) {
        return switch (nombreHechizo.toLowerCase()) {
        	case "expelliarmus" -> new Expelliarmus();
        	case "avada kedavra" -> new AvadaKedavra();
        	case "protego" -> new Protego();
        	case "sectumsempra" -> new Sectumsempra();
        	
        	// 	OTROS HECHIZOS
        	default -> throw new IllegalArgumentException("Tipo de hechizo desconocido: " + nombreHechizo);
        };
    }	
}
