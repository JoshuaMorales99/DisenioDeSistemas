package domain.viajes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Aerolinea {
    // 📌 ATRIBUTOS
    private List<Avion> aviones;
    private String nombre;
    private List<Viaje> viajes;


    // 📌 COSNTRUCTOR
    public Aerolinea() {
        this.aviones = new ArrayList<>();
        this.viajes = new ArrayList<>();
    }


    // 📌 GETTERS & SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    // 📌 METODOS
    public void agregarAviones(Avion... aviones) {
        Collections.addAll(this.aviones, aviones);
    }

    public void agregarViajes(Viaje... viajes) {
        Collections.addAll(this.viajes, viajes);
    }

    public Integer cantPasajerosTotales(Integer mes) {
        // TODO
        return 0;
    }
}
