package domain.lugares;

import domain.viajes.Vuelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Aeropuerto {
    // 📌 ATRIBUTOS
    private Ciudad ciudad;
    private List<Vuelo> vuelos;


    // 📌 CONSTRUCTOR
    public Aeropuerto(Ciudad ciudad) {
        this.ciudad = ciudad;
        this.vuelos = new ArrayList<>();

        // Agregar el aeropuerto a la ciudad
        ciudad.agregarAeropuertos(this);
    }


    // 📌 METODOS
    public void agregarVuelos(Vuelo ... vuelo) {
        Collections.addAll(this.vuelos, vuelo);
    }

    public Integer cantVuelosQuePartieronElDia(LocalDate dia) {
        // TODO
        return 0;
    }

    public Integer cantVuelosQueLlegaronElDia(LocalDate dia) {
        // TODO
        return 0;
    }
}
