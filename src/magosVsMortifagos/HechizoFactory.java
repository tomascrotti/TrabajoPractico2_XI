package magosVsMortifagos;

public class HechizoFactory {
	
	public Hechizo obtenerHechizo(String nombreHechizo) {
        switch (nombreHechizo.toLowerCase()) {
        case "expelliarmus":
            return new Expelliarmus();
        case "avada kedavra":
            return new AvadaKedavra();
        case "protego":
            return new Protego();
        // Más casos para otros hechizos
        default:
            throw new IllegalArgumentException("Tipo de hechizo desconocido: " + nombreHechizo);
        }
    }	
}
