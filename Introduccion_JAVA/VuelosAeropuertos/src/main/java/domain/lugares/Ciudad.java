package domain.lugares;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ciudad {
    // 📌 ATRIBUTOS
    private String nombre;
    private Pais pais;
    private List<Aeropuerto> aeropuertos;


    // 📌 CONSTRUCTOR
    public Ciudad(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
        this.aeropuertos =  new ArrayList<>();

        // Agregar la ciudad al pais
        pais.agregarCiudades(this);
    }


    // 📌 METODOS
    public void agregarAeropuertos(Aeropuerto ... aeropuerto){
        Collections.addAll(this.aeropuertos, aeropuerto);
    }

    public Integer cantAeropuertos(){
        // TODO
        return 0;
    }

    public Integer cantPasajerosQueLlegaronElDia(LocalDate fecha){
        // TODO
        return 0;
    }
}
