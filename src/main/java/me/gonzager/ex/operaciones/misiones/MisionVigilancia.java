package me.gonzager.ex.operaciones.misiones;

import java.util.ArrayList;
import java.util.List;

import me.gonzager.ex.operaciones.drones.Dron;

public class MisionVigilancia implements Mision {
    private List<Sensor> sensores = new ArrayList<>();

    public MisionVigilancia(List<Sensor> sensores) {
        this.sensores = sensores;
    }

    @Override
    public Integer eficienciaOperativaExtra() {
        return sensores.stream().mapToInt(s -> s.eficiencia()).sum();
    }

    @Override
    public Boolean esAvanzadoSegunMision(Dron dron) {
        return sensores.stream().allMatch(s -> s.esDuradero());
    }
}
