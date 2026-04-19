package domain.personas;

import domain.viajes.Aerolinea;

public class Empleado extends Persona {
    // 📌 ATRIBUTOS
    private Cargo cargo;
    private Aerolinea empleador;


    // 📌 CONSTRUCTOR
    public Empleado(String nombre, String apellido, TipoDocumento tipoDocumento, Integer nroDeDocumento) {
        super.setNombre(nombre);
        super.setApellido(apellido);
        super.setTipoDocumento(tipoDocumento);
        super.setNroDeDocumento(nroDeDocumento);
    }


    // 📌 GETTERS $ SETTERS
    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public void setEmpleador(Aerolinea empleador) {
        this.empleador = empleador;
    }
}
