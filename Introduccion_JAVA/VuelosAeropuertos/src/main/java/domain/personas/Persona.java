package domain.personas;

public abstract class Persona {
    // 📌 ATRIBUTOS
    private String nombre;
    private String apellido;
    private TipoDocumento tipoDocumento;
    private Integer nroDeDocumento;


    // 📌 GETTERS & SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public void setNroDeDocumento(Integer nroDeDocumento) {
        this.nroDeDocumento = nroDeDocumento;
    }
}
