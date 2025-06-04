package Ejercicio3;

public class Alimento implements CalcularMonto {
    @Override
    public double calcular(double precioBase) {
        precioBase = precioBase * (1 + 0.05);
        if (precioBase > 100) {
            precioBase = precioBase * (1 - 0.15);
        }
        return precioBase * (1 + 0.05);
    }

    @Override
    public boolean habilitarEnvioGratis(double total) {
        if (total > 200) {
            return true;
        }
        return false;
    }
}
