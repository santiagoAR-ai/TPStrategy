package TestsEjercicio2;

import Ejercicio2.FechaCorta;
import Ejercicio2.FechaLarga;
import Ejercicio2.Persona;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestE2 {
    @Test
    public void testFechaLarga() {
        var persona = new Persona("Santiago", LocalDate.of(1999, 12, 3), new FechaLarga());
        assertEquals("03 de diciembre de 1999", persona.fechaNacimiento());
    }

    @Test
    public void testFechaCorta() {
        var persona = new Persona("Santiago", LocalDate.of(1999, 12, 3), new FechaCorta());
        assertEquals("03/12/1999", persona.fechaNacimiento());
    }
}
