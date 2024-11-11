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
		Batallon batallonMagos = new BatallonMagos(2);
		Batallon batallonMortifagos = new BatallonMortifagos(2);
		
		batalla.iniciarBatalla(batallonMagos, batallonMortifagos);
	}
}
