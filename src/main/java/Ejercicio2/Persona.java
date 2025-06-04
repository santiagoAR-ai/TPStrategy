package Ejercicio2;

import java.time.LocalDate;

public class Persona {
    private String nombre;
    private LocalDate fechaDeNacimiento;
    private MostrarFecha forma;

    public Persona(String nombre, LocalDate fechaDeNacimiento, MostrarFecha forma) {
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.forma = forma;
    }

    public String fechaNacimiento() {
        return forma.fechaNacimiento(this.fechaDeNacimiento);
    }
}
