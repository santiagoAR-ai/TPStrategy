package Ejercicio1;

public class ServicioCorreo {
    private CalcularEnvio servicio;

    public ServicioCorreo(CalcularEnvio servicio) {
        this.servicio = servicio;
    }

    public double calcularPrecioFinal(Envio envio) {
        return servicio.calcularPrecio(envio);
    }

}
