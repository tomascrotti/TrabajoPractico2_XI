package magosVsMortifagos;

public class Expelliarmus implements Hechizo {
	private String nombre = "Expelliarmus";
	private int nivelNecesario = 3;
	
    public void ejecutar(Personaje objetivo) {
        // Lógica para desarmar al enemigo
        System.out.println(objetivo.getNombre() + " ha sido desarmado por Expelliarmus!");
        objetivo.setTieneVarita(false); // El objetivo pierde su varita y no puede lanzar hechizos
    }
    
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}
}
