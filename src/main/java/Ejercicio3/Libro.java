package Ejercicio3;

public class Libro implements CalcularMonto {
    @Override
    public double calcular(double precioBase) {
        return precioBase * (1 + 0.1) * (1 - 0.1);
    }

    @Override
    public boolean habilitarEnvioGratis(double total) {
        if (total > 100) {
            return true;
        }
        return false;
    }
}
