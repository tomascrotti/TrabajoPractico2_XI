package magosVsMortifagos;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("       ███    ███  █████   ██████   ██████  ███████     ██    ██ ███████\r\n"
				         + "       ████  ████ ██   ██ ██       ██    ██ ██          ██    ██ ██     \r\n"
				         + "       ██ ████ ██ ███████ ██   ███ ██    ██ ███████     ██    ██ ███████\r\n"
          				 + "       ██  ██  ██ ██   ██ ██    ██ ██    ██      ██      ██  ██       ██\r\n"
				         + "       ██      ██ ██   ██  ██████   ██████  ███████       ████   ███████\r\n"
				         + "                                                                 \r\n"
				         + "███    ███  ██████  ██████  ████████ ██ ███████  █████   ██████   ██████  ███████\r\n"
				         + "████  ████ ██    ██ ██   ██    ██    ██ ██      ██   ██ ██       ██    ██ ██     \r\n"
				         + "██ ████ ██ ██    ██ ██████     ██    ██ █████   ███████ ██   ███ ██    ██ ███████\r\n"
				         + "██  ██  ██ ██    ██ ██   ██    ██    ██ ██      ██   ██ ██    ██ ██    ██      ██\r\n"
				         + "██      ██  ██████  ██   ██    ██    ██ ██      ██   ██  ██████   ██████  ███████\r\n"
				         + "                                                                                     ");
		BatallaMagosVsMortifagos batalla = new BatallaMagosVsMortifagos();
		Batallon batallonMagos = new Batallon();
		Batallon batallonMortifagos = new Batallon();
		
		

		for (int i = 0; i < 3; i++) {
			batallonMagos.agregarPersonaje(PersonajeFactory.crearMago());
			batallonMortifagos.agregarPersonaje(PersonajeFactory.crearMortifago());
		}
		batalla.iniciarBatalla(batallonMagos,batallonMortifagos);
	}
}
