package magosVsMortifagos;

public class Expelliarmus implements Hechizo {
	
	private String nombre = "Expelliarmus";
	
    public void ejecutar(Personaje lanzador, Personaje objetivo) {
        if(objetivo.tieneVarita())
        	objetivo.setTieneVarita(!lanzador.lanzarDado());
        if(objetivo.tieneVarita()) {
        	System.out.println("\n" + lanzador.getNombre() + " ha fallado Expelliarmus!");
        } else {
        	System.out.println("\n" + objetivo.getNombre() + " ha sido desarmado por Expelliarmus!");
        }
    }
    
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}
	
	public String toString() {
		return nombre + " - Desarma al Hechicero que recibe el ataque\n";
	}
	
}
