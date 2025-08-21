package me.gonzager.ex.operaciones.drones;

import me.gonzager.ex.operaciones.misiones.Mision;

public class DronSeguridad extends Dron  {

    public DronSeguridad(Double autonomia, Integer procesamiento) {
        super(autonomia, procesamiento);
    }

    public DronSeguridad(Double autonomia, Integer procesamiento, Mision mision) {
        super(autonomia, procesamiento, mision);
    }

    @Override
    protected Boolean esAvanzadoSegunTipo() {
        return this.getProcesamiento() > 50;
    }
}
