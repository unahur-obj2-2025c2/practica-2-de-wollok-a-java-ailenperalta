package me.gonzager.ex.operaciones.sensores;

public class Sensor {
    private final Integer capacidad;
    private final Integer durabilidad;
    private final Boolean tieneMejoras;

    public Sensor(Integer capacidad, Integer durabilidad, Boolean tieneMejoras) {
        this.capacidad = capacidad;
        this.durabilidad = durabilidad;
        this.tieneMejoras = tieneMejoras;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public Integer getDurabilidad() {
        return durabilidad;
    }

    public Boolean getTieneMejoras() {
        return tieneMejoras;
    }

    public Integer eficiencia() {
        return tieneMejoras ? capacidad * 2 : capacidad;
    }

}
