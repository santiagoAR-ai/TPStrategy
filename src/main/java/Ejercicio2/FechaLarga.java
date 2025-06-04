package Ejercicio2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FechaLarga implements MostrarFecha {
    @Override
    public String fechaNacimiento(LocalDate fecha) {
        return fecha.format(DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy", new Locale("es", "ES")));
    }
}
