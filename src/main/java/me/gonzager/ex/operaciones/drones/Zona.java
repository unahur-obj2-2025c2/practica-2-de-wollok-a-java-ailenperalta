package me.gonzager.ex.operaciones.drones;

public class Zona {
    private final Integer tamaño;
    private Integer operacionesRecibidas = 0;

    public Zona(Integer tamaño) {
        this.tamaño = tamaño;
    }

    public Integer getTamaño() {
        return tamaño;
    }

    public Integer getOperacionesRecibidas() {
        return operacionesRecibidas;
    }

    public void recibirOperacion() {
        operacionesRecibidas += 1;
    }
}
