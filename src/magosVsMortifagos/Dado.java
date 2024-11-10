package magosVsMortifagos;

import java.util.Random;

public enum Dado {
	DOSCARAS("Lucky penny",2), CUATROCARAS("Trebol de la fortuna",4), SEISCARAS("D6",6);
	
	final String nombre;
	final int caras;
	final Random random = new Random();
	
	Dado(String nombre, int caras){
		this.nombre = nombre;
		this.caras = caras;
	}
	
	public int lanzar() {
		return random.nextInt(caras) + 1;
	}
	
	 @Override
	 public String toString() {
		 return "Dado: " + this.nombre;
	 }
	
}
