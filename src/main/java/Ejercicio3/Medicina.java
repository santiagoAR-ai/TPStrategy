package Ejercicio3;

public class Medicina implements CalcularMonto {
    @Override
    public double calcular(double precioBase) {
        if (precioBase > 50) {
            precioBase = precioBase * (1 + 0.1);
        }
        return precioBase;
    }

    @Override
    public boolean habilitarEnvioGratis(double total) {
        if (total > 100) {
            return true;
        }
        return false;
    }
}
