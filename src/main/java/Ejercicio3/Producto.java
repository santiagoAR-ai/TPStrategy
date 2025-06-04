package Ejercicio3;

public class Producto {
    private double precio;
    private CalcularMonto servicio;

    public Producto(double precio, CalcularMonto servicio) {
        this.precio = precio;
        this.servicio = servicio;
    }

    public CalcularMonto servicios() {
        return this.servicio;
    }

    public double precio() {
        return this.precio;
    }
}

