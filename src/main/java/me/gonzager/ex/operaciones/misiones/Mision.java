package me.gonzager.ex.operaciones.misiones;

import me.gonzager.ex.operaciones.drones.Dron;

public interface Mision {
    Integer eficienciaOperativaExtra();
    Boolean esAvanzadoSegunMision(Dron dron);
}
