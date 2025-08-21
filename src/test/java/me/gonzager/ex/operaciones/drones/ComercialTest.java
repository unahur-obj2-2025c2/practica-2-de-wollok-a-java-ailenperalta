package me.gonzager.ex.operaciones.drones;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

import me.gonzager.ex.operaciones.misiones.MisionTransporte;

public class ComercialTest {
    Dron dronC1 = new DronComercial(60, 100, MisionTransporte.getInstance());

    @Test
    void testEficienciaOperativa() {
        assertEquals(60*10+15+100, dronC1.eficienciaOperativa());
    }

    @Test
    void testEsAvanzadoSegunTipo() {
        assertFalse(dronC1.esAvanzadoSegunTipo());
    }
}
