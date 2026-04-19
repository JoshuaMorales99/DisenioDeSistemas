package domain.personas;

import domain.viajes.Vuelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tripulacion {
    // 📌 ATRIBUTOS
    private String nombre;
    private List<Empleado>  empleados;
    private List<Vuelo> vuelos;


    // 📌 CONSTRUCTOR
    public Tripulacion() {
        this.empleados = new ArrayList<>();
        this.vuelos = new ArrayList<>();
    }


    // 📌 GETTERS & SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    // 📌 METODOS
    public void agregarEmpleados(Empleado ... empleado) {
        Collections.addAll(this.empleados, empleado);
    }

    public void agregarVuelos(Vuelo... vuelo) {
        Collections.addAll(this.vuelos, vuelo);
    }

    public Integer cantVuelosEntre(LocalDate fechaInicial, LocalDate fechaFinal) {
        // TODO
        return 0;
    }
}
