package me.gonzager.ex.operaciones.drones;

import me.gonzager.ex.operaciones.misiones.Mision;

public class DronComercial extends Dron {

    public DronComercial(Integer autonomia, Integer procesamiento) {
        super(autonomia, procesamiento);
    }

    public DronComercial(Integer autonomia, Integer procesamiento, Mision mision) {
        super(autonomia, procesamiento, mision);
    }

    @Override
    public Integer eficienciaOperativa() {
        return super.eficienciaOperativa() + 15;
    }

    @Override
    protected Boolean esAvanzadoSegunTipo() {
        return Boolean.FALSE;
    }
}
