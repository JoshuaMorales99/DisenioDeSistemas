package domain.lugares;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pais {
    // 📌 ATRIBUTOS
    private String nombre;
    private Continente continente;
    private List<Ciudad> ciudades;


    // 📌 CONSTRUCTOR
    public Pais(String nombre, Continente continente){
        this.nombre = nombre;
        this.continente = continente;
        this.ciudades = new ArrayList<>();
    }


    // 📌 GETTERS & SETTERS
    public String getNombre() {
        // TODO
        return "";
    }


    // 📌 METODOS
    public void agregarCiudades(Ciudad... ciudades){
        Collections.addAll(this.ciudades, ciudades);
    }
}
