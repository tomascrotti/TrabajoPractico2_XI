package personajes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import magosVsMortifagos.Varita;

class PersonajeTest {
	Mago mago;

	@BeforeEach
	void setUp() throws Exception {
		mago = new Auror("Auror");
	}


	@Test
	public void testGetNombre() {
	    assertEquals("Auror", mago.getNombre());
	}

	@Test
	void testGetVida() {
		double vidaMago = mago.getVida();
		assertEquals(125,vidaMago);
	}

	@Test
	void testEstaVivo() {
		assertTrue(mago.estaVivo());
		mago.puntosVida = 0;
		assertFalse(mago.estaVivo());
	}
	@Test
	void testQuitarVarita() {
		assertTrue(mago.tieneVarita());
		mago.setTieneVarita(false);
		assertFalse(mago.tieneVarita());
		
	}

	@Test
	void testGetVarita() {
		assertEquals(Varita.LEGENDARIA,mago.getVarita());
	}

	@Test
	void testSetVarita() {
		mago.setVarita(Varita.PRINCIPIANTE);
		assertEquals(Varita.PRINCIPIANTE,mago.getVarita());
	}

	/*@Test
	void testCambiarVarita() {
		///prolog
	}*/

	@Test
	void testTieneVarita() {
		assertTrue(mago.tieneVarita());
		
	}

	@Test
	void testSetTieneVarita() {
		assertTrue(mago.tieneVarita());
		mago.setTieneVarita(false);
		assertFalse(mago.tieneVarita());

	}

	@Test
	void testReducirPuntosDeVida() {
		assertEquals(125,mago.getVida());
		mago.reducirPuntosDeVida(25);
		assertEquals(100,mago.getVida());
	}

	@Test
	void testRecuperarVarita() {
		mago.setTieneVarita(false);
		mago.recuperarVarita();
		assertTrue(mago.tieneVarita());
	}

	@Test
	void testPocaVida() {
		assertFalse(mago.pocaVida());
		mago.reducirPuntosDeVida(100);
		mago.pocaVida();
		assertTrue(mago.pocaVida());
	}
	@Test
	void testSetProtegido() {
		mago.setProtegido(true);
		assertTrue(mago.protegido);
	}

	@Test
	void testTieneProtego() {
		assertFalse(mago.tieneProtego());
		mago.setProtegido(true);
		assertTrue(mago.tieneProtego());
	}

}
