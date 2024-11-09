package magosVsMortifagos;

import java.util.Random;

public enum Dado {
	DOSCARAS(2), CUATROCARAS(4), SEISCARAS(6);
	
	final int caras;
	final Random random = new Random();
	
	Dado(int caras){
		this.caras = caras;
	}
	
	public int lanzar() {
		return random.nextInt(caras) + 1;
	}
	
}
