package magosVsMortifagos;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import hechizos.AvadaKedavra;
import hechizos.Hechizo;
import hechizos.HechizoFactory;
import personajes.Personaje;

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

	@Test
	void testBatallonInicializacion() {
		assertEquals(3, cantMagos, "El batallón de magos debería tener 3 personajes");
		assertEquals(3, cantMortifagos,
				"El batallón de mortífagos debería tener 3 personajes");
	}

	@Test
	void testAtaqueReduccionVida() {
		Personaje mago = batallonMagos.getPersonajes().get(0);
		Personaje mortifago = batallonMortifagos.getPersonajes().get(0);
		double vidaInicialMortifago = mortifago.getVida();

		mago.lanzarHechizo(new AvadaKedavra(), mortifago);

		assertTrue(mortifago.getVida() < vidaInicialMortifago,
				"La vida del mortífago debería reducirse después del ataque");
	}

	@Test
	void testHechizoAplicacion() {
		Personaje mago = batallonMagos.getPersonajes().get(0);
		Personaje mortifago = batallonMortifagos.getPersonajes().get(0);

		Hechizo expelliarmus = HechizoFactory.obtenerHechizo("Expelliarmus");
		mago.lanzarHechizo(expelliarmus, mortifago);

		assertFalse(mortifago.tieneVarita(), "El mortífago debería estar desarmado después de 'Expelliarmus'");
	}

	@Test
	void testBatallaCompleta() {
		BatallaMagosVsMortifagos batalla = new BatallaMagosVsMortifagos();
		batalla.iniciarBatalla(batallonMagos, batallonMortifagos);

		assertTrue(batallonMagos.tienePersonajesSaludables() != batallonMortifagos.tienePersonajesSaludables(),
				"La batalla debería terminar con un equipo vencedor y otro derrotado");
	}

}
