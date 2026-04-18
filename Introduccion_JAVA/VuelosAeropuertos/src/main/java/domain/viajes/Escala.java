package domain.viajes;

import domain.lugares.Aeropuerto;

public class Escala {
    // 📌 ATRIBUTOS
    private Aeropuerto aeropuerto;
    private Double duracion;                // En minutos

    // 📌 GETTERS & SETTERS
    public Double getDuracion() {
        return duracion;
    }
}
