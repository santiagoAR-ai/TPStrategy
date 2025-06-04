package Ejercicio3;

public class CalculadorDePrecios {

    public double precioFinal(Producto producto) {
        double total = producto.servicios().calcular(producto.precio());
        if (producto.servicios().habilitarEnvioGratis(total)) {
            total -= 10;
        }
        return total;
    }
}
