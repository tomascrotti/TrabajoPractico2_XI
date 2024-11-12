package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import magosVsMortifagos.EstrategiaProlog;

public class EstrategiaPrologTest {

    private EstrategiaProlog estrategia;

    @BeforeEach
    public void setUp() {
        estrategia = new EstrategiaProlog();
    }

    @Test
    public void testGanarVaritaExitoso() {
        boolean resultado = estrategia.ejecutarConsulta("Estudiante", "Comandante");
        assertTrue(resultado, "Estudiante deberia poder quedarse con la varita del Comandante");
    }

    @Test
    public void testGanarVaritaFallido() {
        boolean resultado = estrategia.ejecutarConsulta("Comandante", "Estudiante");
        assertFalse(resultado, "Comandante no deberia quedarse con la varita del Estudiante");
    }
}
