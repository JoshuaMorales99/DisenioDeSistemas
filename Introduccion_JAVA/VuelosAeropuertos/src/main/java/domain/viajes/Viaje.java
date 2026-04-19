package domain.viajes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Viaje {
    // 📌 ATRIBUTOS
    private List<Vuelo> vuelos;
    private List<Escala> escalas;
    private LocalDateTime fechaSalida;
    private Aerolinea aerolinea;


    // 📌 CONSTRUCTOR
    public Viaje() {
        this.vuelos = new ArrayList<>();
        this.escalas = new ArrayList<>();
    }


    // 📌 GETTERS & SETTERS
    public void setFechaSalida(LocalDateTime fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public void setAerolinea(Aerolinea aerolinea) {
        this.aerolinea = aerolinea;
    }


    // 📌 METODOS
    public void agregarVuelos(Vuelo... vuelo) {
        Collections.addAll(this.vuelos, vuelo);
    }

    public void agregarEscalas(Escala... escala) {
        Collections.addAll(this.escalas, escala);
    }

    public Integer cantPasajerosTotales() {
        // TODO
        return 0;
    }

    public Double duracionTotalEnMins() {
        // TODO
        return 0.0;
    }
}
