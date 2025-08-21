package me.gonzager.ex.operaciones.drones;

import me.gonzager.ex.operaciones.misiones.Mision;

public abstract class Dron {
    private Integer autonomia;
    private final Integer procesamiento; 
    private Mision mision;

    public Dron(Integer autonomia, Integer procesamiento) {
        this.autonomia = autonomia;
        this.procesamiento = procesamiento;
    }

    public Dron(Integer autonomia, Integer procesamiento, Mision mision) {
        this.autonomia = autonomia;
        this.procesamiento = procesamiento;
        this.mision = mision;
    }

    public Integer eficienciaOperativa() {
        return autonomia * 10 + mision.eficienciaOperativaExtra();
    }

    public Boolean esAvanzado() {
        return this.esAvanzadoSegunTipo() || mision.esAvanzadoSegunMision(this);
    }

    public Integer getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(Integer autonomia) {
        this.autonomia = autonomia;
    }
    
    public void disminuirAutonomia() {
        autonomia -= 2;
    }

    public Integer getProcesamiento() {
        return procesamiento;
    }

    public Mision getMision() {
        return mision;
    }

    public void setMision(Mision mision) {
        this.mision = mision;
    }

    protected abstract Boolean esAvanzadoSegunTipo();
    
}
