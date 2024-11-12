package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import hechizos.AvadaKedavra;
import hechizos.Hechizo;
import hechizos.HechizoFactory;
import magosVsMortifagos.BatallaMagosVsMortifagos;
import magosVsMortifagos.Batallon;
import magosVsMortifagos.BatallonMagos;
import magosVsMortifagos.BatallonMortifagos;
import personajes.Mago;
import personajes.Mortifago;
import personajes.Personaje;
import personajes.PersonajeFactory;

import java.util.List;

public class BatallonTest {

	Batallon batallonMagos;
	Batallon batallonMortifagos;
	int cantMagos;
	int cantMortifagos;
	@BeforeEach
	void setup() {
		batallonMagos = new BatallonMagos(3);
		batallonMortifagos = new BatallonMortifagos(3);
		cantMagos = batallonMagos.getPersonajes().size();
		cantMortifagos = batallonMortifagos.getPersonajes().size();
	}
	
	// Espera que al intentar agregar un mortifago en un batallon de magos tire excepcion
	@Test
	void testBatallonMagos() {
	    Batallon batallonMagos2 = new BatallonMagos(1);
	    Mortifago mort = (Mortifago) PersonajeFactory.crearMortifago();

	    assertThrows(IllegalArgumentException.class, () -> {
	        batallonMagos2.agregarPersonaje(mort);
	    },"El batallon solo deberia incluir magos");
	}
	
	// Espera que al intentar agregar un mago en un batallon de mortifagos tire excepcion
	@Test
	void testBatallonMortifagos() {
	    Batallon batallonMortifagos2 = new BatallonMortifagos(1);
	    Mago mag = (Mago) PersonajeFactory.crearMago();

	    assertThrows(IllegalArgumentException.class, () -> {
	    	batallonMortifagos2.agregarPersonaje(mag);
	    }, "El batallon solo deberia incluir mortifagos");
	}

	@Test
	void testBatallonInicializacion() {
		assertEquals(3, cantMagos, "El batallon de magos deberia tener 3 personajes");
		assertEquals(3, cantMortifagos,
				"El batallon de mortifagos debería tener 3 personajes");
	}

	@Test
	void testAtaqueReduccionVida() {
		Personaje mago = batallonMagos.getPersonajes().get(0);
		Personaje mortifago = batallonMortifagos.getPersonajes().get(0);
		double vidaInicialMortifago = mortifago.getVida();
		

		mago.lanzarHechizo(new AvadaKedavra(), mortifago);

		assertTrue(mortifago.getVida() < vidaInicialMortifago,
				"La vida del mortifago deberia reducirse despues del ataque");
	}

	@Test
	void testHechizoAplicacion() {
		Personaje mago = batallonMagos.getPersonajes().get(0);
		Personaje mortifago = batallonMortifagos.getPersonajes().get(0);

		Hechizo expelliarmus = HechizoFactory.obtenerHechizo("Expelliarmus");
		mago.lanzarHechizo(expelliarmus, mortifago);

		assertFalse(mortifago.tieneVarita(), "El mortífago deberia estar desarmado despues de 'Expelliarmus'");
	}

	@Test
	void testBatallaCompleta() {
		BatallaMagosVsMortifagos batalla = new BatallaMagosVsMortifagos();
		batalla.iniciarBatalla(batallonMagos, batallonMortifagos);

		assertTrue(batallonMagos.tienePersonajesSaludables() != batallonMortifagos.tienePersonajesSaludables(),
				"La batalla deberia terminar con un equipo vencedor y otro derrotado");
	}

}
