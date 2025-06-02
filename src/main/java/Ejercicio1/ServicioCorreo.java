package Ejercicio1;

public class ServicioCorreo {
    private CalcularEnvio servicio;

    public ServicioCorreo(CalcularEnvio servicio) {
        this.servicio = servicio;
    }

    public double calcularPrecioFinal(Producto producto){
        return servicio.calcularPrecio(producto);
    }

}
