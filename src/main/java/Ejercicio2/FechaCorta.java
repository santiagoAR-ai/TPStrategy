package Ejercicio2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FechaCorta implements MostrarFecha {
    @Override
    public String fechaNacimiento(LocalDate fecha) {
        return fecha.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}
