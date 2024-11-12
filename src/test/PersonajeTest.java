package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import magosVsMortifagos.Varita;
import personajes.Auror;
import personajes.Mago;
import personajes.Mortifago;
import personajes.Seguidor;

class PersonajeTest {
	Mago mago;
	Mortifago mortifago;

	@BeforeEach
	void setUp() throws Exception {
		mago = new Auror("Auror");
		mortifago = new Seguidor("Seguidor");
	}


	@Test
	public void testGetNombre() {
	    assertEquals("Auror", mago.getNombre(),"el nombre de mago deberia ser Auror"); 
	}

	@Test
	void testGetVida() {
		double vidaMago = mago.getVida();
		assertEquals(125,vidaMago,"La vida del mago deberia ser de 125");
	}

	@Test
	void testEstaVivo() {
		assertTrue(mago.estaVivo(),"Al intanciar un mago este deberia estar vivo");
		mago.reducirPuntosDeVida(125);//125 es la vida del AUROR
		assertFalse(mago.estaVivo(),"Si la vida de el mago es 0 entonces NO esta vivo");
	}
	@Test
	void testQuitarVarita() {
		assertTrue(mago.tieneVarita(),"El mago deberia tener una varita");
		mago.setTieneVarita(false);
		assertFalse(mago.tieneVarita(),"El mago no deberia tener una varita");
		
	}

	@Test
	void testGetVarita() {
		assertEquals(Varita.LEGENDARIA,mago.getVarita(),"La varita del mago deberia ser LEGENDARIA");
	}

	@Test
	void testSetVarita() {
		mago.setVarita(Varita.PRINCIPIANTE);
		assertEquals(Varita.PRINCIPIANTE,mago.getVarita(),"La varita del mago ahora deberia ser de PRINCIPIANTE");
	}

	@Test
	void testTieneVarita() {
		assertTrue(mago.tieneVarita(),"El mago deberia tener varita");
		
	}

	@Test
	void testSetTieneVarita() {
		assertTrue(mago.tieneVarita(),"El mago deberia tener varita");
		mago.setTieneVarita(false);
		assertFalse(mago.tieneVarita(),"El mago NO deberia tener varita");

	}

	@Test
	void testReducirPuntosDeVida() {
	    assertEquals(125, mago.getVida(),"La vida del mago deberia ser 125");
	    mago.reducirPuntosDeVida(25);
	    assertEquals(100, mago.getVida(),"La vida del mago deberia ser de 100");
	    mago.reducirPuntosDeVida(200); // Más de la vida actual
	    assertEquals(0, mago.getVida(),"La vida del mago deberia ser de 0"); // Verifica que no quede negativo
	}

	@Test
	void testRecuperarVarita() {
		mago.setTieneVarita(false);
		assertFalse(mago.tieneVarita(),"El mago no deberia tener varita");
		mago.recuperarVarita();
		assertTrue(mago.tieneVarita(),"El mago deberia tener varita");
	}

	@Test
	void testPocaVida() {
	    assertFalse(mago.pocaVida(),"El mago tendria que NO tener poca vida");
	    mago.reducirPuntosDeVida(100);
	    assertTrue(mago.pocaVida(),"El mago deberia tener poca vida");
	}
	
	@Test
	void testSetProtegido() {
		mago.setProtegido(true);
		assertTrue(mago.tieneProtego(),"El mago deberia tener Protego");
	}

	@Test
	void testTieneProtego() {
		assertFalse(mago.tieneProtego(),"El mago no deberia tener protego");
		mago.setProtegido(true);
		assertTrue(mago.tieneProtego(),"El mago deberia tener protego");
	}

}
