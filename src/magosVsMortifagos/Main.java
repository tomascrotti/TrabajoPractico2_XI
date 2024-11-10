package magosVsMortifagos;

import org.jpl7.*;

public class Main {

	public static void main(String[] args) {
		
//		System.out.println("       ███    ███  █████   ██████   ██████  ███████     ██    ██ ███████\r\n"
//				         + "       ████  ████ ██   ██ ██       ██    ██ ██          ██    ██ ██     \r\n"
//				         + "       ██ ████ ██ ███████ ██   ███ ██    ██ ███████     ██    ██ ███████\r\n"
//          				 + "       ██  ██  ██ ██   ██ ██    ██ ██    ██      ██      ██  ██       ██\r\n"
//				         + "       ██      ██ ██   ██  ██████   ██████  ███████       ████   ███████\r\n"
//				         + "                                                                 \r\n"
//				         + "███    ███  ██████  ██████  ████████ ██ ███████  █████   ██████   ██████  ███████\r\n"
//				         + "████  ████ ██    ██ ██   ██    ██    ██ ██      ██   ██ ██       ██    ██ ██     \r\n"
//				         + "██ ████ ██ ██    ██ ██████     ██    ██ █████   ███████ ██   ███ ██    ██ ███████\r\n"
//				         + "██  ██  ██ ██    ██ ██   ██    ██    ██ ██      ██   ██ ██    ██ ██    ██      ██\r\n"
//				         + "██      ██  ██████  ██   ██    ██    ██ ██      ██   ██  ██████   ██████  ███████\r\n"
//				         + "                                                                                     ");
//		BatallaMagosVsMortifagos batalla = new BatallaMagosVsMortifagos();
//		Batallon batallonMagos = new Batallon();
//		Batallon batallonMortifagos = new Batallon();
//		
//		
//
//		for (int i = 0; i < 3; i++) {
//			batallonMagos.agregarPersonaje(PersonajeFactory.crearMago());
//			batallonMortifagos.agregarPersonaje(PersonajeFactory.crearMortifago());
//		}
//		batalla.iniciarBatalla(batallonMagos,batallonMortifagos);
		
		// Cargar el archivo Prolog
        Query q1 = new Query("consult", new Term[] {new Atom("test.pl")});
        System.out.println("consult('test.pl') " + (q1.hasSolution() ? "succeeded" : "failed"));

        // Realizar la consulta
        Query q2 = new Query("child_of", new Term[] {new Atom("joe"), new Atom("ralf")});
        System.out.println("child_of(joe,ralf) is " + (q2.hasSolution() ? "provable" : "not provable"));
	}
}
