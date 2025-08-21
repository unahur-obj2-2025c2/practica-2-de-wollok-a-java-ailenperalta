package me.gonzager.ex.operaciones;

import java.util.HashSet;
import java.util.Set;

import me.gonzager.ex.operaciones.drones.Ciudad;
import me.gonzager.ex.operaciones.drones.Dron;
import me.gonzager.ex.operaciones.drones.Zona;

public class Escuadron {
    private Set<Dron> drones = new HashSet<>();
    
    public void agregarDron(Dron unDron) throws Exception {
        if (drones.size() >= Ciudad.getInstance().getLimiteDronesPorEscuadron()) {
            throw new IllegalStateException("Se alcanzó el límite de drones establecido por la ciudad");
        }
        drones.add(unDron);
    }

    private Boolean alMenosUnDronAvanzado() {
        return drones.stream().anyMatch(d -> d.esAvanzado());
    }

    public Boolean puedeOperarEn(Zona unaZona) {
        return this.alMenosUnDronAvanzado() && this.eficienciaOperativa() > 2 * unaZona.getTamaño();
    }

    private Integer eficienciaOperativa() {
        return drones.stream().mapToInt(d -> d.eficienciaOperativa()).sum();
    }

    public void operar(Zona unaZona) {
        if (this.puedeOperarEn(unaZona)) {
            unaZona.recibirOperacion();
            drones.stream().forEach(d -> d.disminuirAutonomia());
        }
    }
}
