package Ejercicio3;

public class Otro implements CalcularMonto {
    @Override
    public double calcular(double precioBase) {
        precioBase = precioBase * (1 + 0.1);
        if (precioBase > 50) {
            precioBase = precioBase * (1 - 0.05);
        }
        return precioBase;
    }

    @Override
    public boolean habilitarEnvioGratis(double total) {
        if (total > 200) {
            return true;
        }
        return false;
    }
}
