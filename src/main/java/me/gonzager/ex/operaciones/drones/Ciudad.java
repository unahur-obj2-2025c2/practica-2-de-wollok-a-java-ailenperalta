package me.gonzager.ex.operaciones.drones;

public class Ciudad {
    private static Ciudad instance = new Ciudad();

    private Ciudad() {};

    public static Ciudad getInstance() {
        return instance;
    }

    private Integer limiteDronesPorEscuadron = 10;

    public Integer getLimiteDronesPorEscuadron() {
        return limiteDronesPorEscuadron;
    }

    public void setLimiteDronesPorEscuadron(Integer limiteDronesPorEscuadron) {
        this.limiteDronesPorEscuadron = limiteDronesPorEscuadron;
    }
}
