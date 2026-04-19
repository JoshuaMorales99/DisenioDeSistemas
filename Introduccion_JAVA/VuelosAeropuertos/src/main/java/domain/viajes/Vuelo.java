package domain.viajes;

import domain.lugares.Aeropuerto;
import domain.personas.Pasajero;
import domain.personas.Tripulacion;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Vuelo {
    // 📌 ATRIBUTOS
    private Aeropuerto origen;
    private Aeropuerto destino;
    private LocalDateTime fecha;
    private Double duracion;
    private Integer cantAsientosOfrecidos;
    private Avion avion;
    private List<Pasajero> pasajeros;
    private Tripulacion tripulacion;


    // 📌 CONSTRUCTOR
    public Vuelo(Aeropuerto origen, Aeropuerto destino) {
        this.origen = origen;
        this.destino = destino;
        this.pasajeros = new ArrayList<>();
    }


    // 📌 GETTERS & SETTERS
    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    public void setCantAsientosOfrecidos(Integer cantAsientosOfrecidos) {
        this.cantAsientosOfrecidos = cantAsientosOfrecidos;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public void setTripulacion(Tripulacion tripulacion) {
        this.tripulacion = tripulacion;
    }


    // 📌 METODOS
    public void agregarPasajeros(Pasajero ... pasajero) {
        Collections.addAll(this.pasajeros, pasajero);
    }

    public Double duracionEnMins(){
        // TODO
        return 0.0;
    }

    /*
    * Regla de tres:
    *       CantAsientos    _   100 %
    *       CantPasajeros   _   x   %
    */
    public Double capacidadOcupadaPorPasajeros(){
        return (this.cantPasajeros() * 100.0) / avion.getCantAsientos();
    }

    public Integer cantPasajeros(){
        return this.pasajeros.size();
    }
}
