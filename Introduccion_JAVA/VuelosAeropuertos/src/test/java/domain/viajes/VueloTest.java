package domain.viajes;

import domain.lugares.Aeropuerto;
import domain.lugares.Ciudad;
import domain.lugares.Continente;
import domain.lugares.Pais;
import domain.personas.Pasajero;
import domain.personas.TipoDocumento;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class VueloTest {
    @Test
    @DisplayName("TEST: Obtener la capacidad ocupada por pasajeros en un vuelo")
    public void obtenerCapacidadOcupadaPorPasajeros(){
        Vuelo vuelo = new Vuelo(new Aeropuerto(new Ciudad("unaCiudad", new Pais("unPais", Continente.AMERICA))), new Aeropuerto(new Ciudad("otraCiudad", new Pais("otraPais", Continente.AMERICA))));
        vuelo.agregarPasajeros(
                new Pasajero("a", "a", TipoDocumento.DNI, 1, 1, new Pais("a", Continente.AMERICA)),
                new Pasajero("b", "b", TipoDocumento.DNI, 2, 2, new Pais("b", Continente.AFRICA)),
                new Pasajero("c", "c", TipoDocumento.DNI, 3, 3, new Pais("c", Continente.OCEANIA)),
                new Pasajero("d", "d", TipoDocumento.DNI, 4, 4, new Pais("d", Continente.ASIA))
        );
        vuelo.setAvion(new Avion(40));

        Assertions.assertEquals(10.00, vuelo.capacidadOcupadaPorPasajeros());
    }
}