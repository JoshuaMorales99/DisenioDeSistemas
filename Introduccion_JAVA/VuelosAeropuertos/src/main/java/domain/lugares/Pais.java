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
    public Pais() {
        this.ciudades = new ArrayList<>();
    }

    // 📌 GETTERS & SETTERS
    public String getNombre() {
        // TODO
        return "";
    }
}
