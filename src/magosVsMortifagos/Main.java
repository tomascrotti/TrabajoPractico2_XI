package magosVsMortifagos;

public class Main {

	public static void main(String[] args) {
		
//		System.out.println("       ███    ███  █████   ██████   ██████  ███████     ██    ██ ███████\r\n"
//				         + "       ████  ████ ██   ██ ██       ██    ██ ██          ██    ██ ██     \r\n"
//				         + "       ██ ████ ██ ███████ ██   ███ ██    ██ ███████     ██    ██ ███████\r\n"
//          			 + "       ██  ██  ██ ██   ██ ██    ██ ██    ██      ██      ██  ██       ██\r\n"
//				         + "       ██      ██ ██   ██  ██████   ██████  ███████       ████   ███████\r\n"
//				         + "                                                                 \r\n"
//				         + "███    ███  ██████  ██████  ████████ ██ ███████  █████   ██████   ██████  ███████\r\n"
//				         + "████  ████ ██    ██ ██   ██    ██    ██ ██      ██   ██ ██       ██    ██ ██     \r\n"
//				         + "██ ████ ██ ██    ██ ██████     ██    ██ █████   ███████ ██   ███ ██    ██ ███████\r\n"
//				         + "██  ██  ██ ██    ██ ██   ██    ██    ██ ██      ██   ██ ██    ██ ██    ██      ██\r\n"
//				         + "██      ██  ██████  ██   ██    ██    ██ ██      ██   ██  ██████   ██████  ███████\r\n"
//				         + "                                                                                     ");
		BatallaMagosVsMortifagos batalla = new BatallaMagosVsMortifagos();
		Batallon batallonMagos = new BatallonMagos(1);
		Batallon batallonMortifagos = new BatallonMortifagos(1);
		
		batalla.iniciarBatalla(batallonMagos, batallonMortifagos);
	}
}
