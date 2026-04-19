package domain.personas;

import domain.lugares.Ciudad;
import domain.lugares.Pais;
import domain.viajes.Vuelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pasajero extends Persona {
    // 📌 ATRIBUTOS
    private List<Vuelo> vuelos;
    private Integer nroPasaporte;
    private Pais nacionalidad;


    // 📌 CONSTRUCTOR
    public Pasajero(String nombre, String apellido, TipoDocumento tipoDocumento, Integer nroDeDocumento, Integer nroPasaporte, Pais nacionalidad) {
        super.setNombre(nombre);
        super.setApellido(apellido);
        super.setTipoDocumento(tipoDocumento);
        super.setNroDeDocumento(nroDeDocumento);
        this.nroPasaporte = nroPasaporte;
        this.nacionalidad = nacionalidad;
        this.vuelos = new ArrayList<>();
    }


    // 📌 METODOS
    public void agregarVuelos(Vuelo... vuelos){
        Collections.addAll(this.vuelos, vuelos);
    }

    public Integer cantVuelosTotales() {
        // TODO
        return 0;
    }

    public Integer cantVecesQueVisitaste(Ciudad unaCiudad) {
        // TODO
        return 0;
    }
}
