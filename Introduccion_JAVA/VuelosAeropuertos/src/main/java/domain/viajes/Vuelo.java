package domain.viajes;

import domain.lugares.Aeropuerto;
import domain.lugares.Ciudad;
import domain.personas.Pasajero;
import domain.personas.Tripulacion;

import java.time.LocalDateTime;
import java.util.List;

public class Vuelo {
    // 📌 ATRIBUTOS
    private Aeropuerto origen;
    private Aeropuerto destino;
    private LocalDateTime fecha;
    private double duracion;
    private Integer cantAsientosOfrecidos;
    private Avion avion;
    private List<Pasajero> pasajeros;
    private Tripulacion tripulacion;

    // 📌 METODOS
    public Double duracionEnMins(){
        // TODO
        return 0.0;
    }

    public Double capacidadOcupadaPorPasajeros(){
        // TODO
        return 0.0;
    }

    public Integer cantPasajeros(){
        // TODO
        return 0;
    }
}
