package magosVsMortifagos;

public class Expelliarmus implements Hechizo {
	
	private String nombre = "Expelliarmus";
	
    public void ejecutar(Personaje lanzador, Personaje objetivo) {
        if(objetivo.tieneVarita())
        	objetivo.setTieneVarita(!lanzador.lanzarDado());
        if(objetivo.tieneVarita()) {
        	System.out.println(lanzador.getNombre() + " ha fallado Expelliarmus!");
        } else {
        	System.out.println(objetivo.getNombre() + " ha sido desarmado por Expelliarmus!");
        }
    }
    
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}
}
