package domain.viajes;

import java.time.LocalDate;
import java.util.List;

public class Viaje {
    // 📌 ATRIBUTOS
    private List<Vuelo> vuelos;
    private List<Escala> escalas;
    private LocalDate fechaSalida;
    private Aerolinea aerolinea;

    // 📌 METODOS
    public Integer cantPasajerosTotales() {
        // TODO
        return 0;
    }

    public Double duracionTotalEnMins() {
        // TODO
        return 0.0;
    }
}
