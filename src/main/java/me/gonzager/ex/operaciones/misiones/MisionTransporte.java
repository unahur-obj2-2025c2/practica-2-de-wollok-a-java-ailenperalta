package me.gonzager.ex.operaciones.misiones;

import me.gonzager.ex.operaciones.drones.Dron;

public class MisionTransporte implements Mision {
    private static MisionTransporte instance = new MisionTransporte();

    public static MisionTransporte getInstance() {
        return instance;
    }

    @Override
    public Integer eficienciaOperativaExtra() {
        return 100;
    }

    @Override
    public Boolean esAvanzadoSegunMision(Dron dron) {
        return dron.getAutonomia() > 50;
    }
}
