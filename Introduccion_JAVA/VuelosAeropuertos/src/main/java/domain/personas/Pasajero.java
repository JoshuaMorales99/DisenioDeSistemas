package domain.personas;

import domain.lugares.Pais;
import domain.viajes.Vuelo;

import java.util.List;

public class Pasajero extends Persona {
    // 📌 ATRIBUTOS
    private List<Vuelo> vuelos;
    private Integer nroPasaporte;
    private Pais pais;

    // 📌 METODOS
    public Integer cantVuelosTotales() {
        // TODO
        return 0;
    }

    public Integer cantVecesQueVisitaste(Ciudad unaCiudad) {
        // TODO
        return 0;
    }
}
