package domain.viajes;

import domain.lugares.Aeropuerto;

public class Escala {
    // 📌 ATRIBUTOS
    private Aeropuerto aeropuerto;
    private Double duracion;                // En minutos


    // 📌 GETTERS & SETTERS
    public void setAeropuerto(Aeropuerto aeropuerto) {
        this.aeropuerto = aeropuerto;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    public Double getDuracion() {
        // TODO
        return 0.0;
    }
}
