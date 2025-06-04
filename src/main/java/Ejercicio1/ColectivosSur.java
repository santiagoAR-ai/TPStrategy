package Ejercicio1;

public class ColectivosSur implements CalcularEnvio {
    private static double calcularXDestino(Envio envio) {
        double montoFinal = 0;
        if (envio.destinoFinal() == Destinos.CapitalFederal) {
            montoFinal = 1000;
        }
        if (envio.destinoFinal() == Destinos.GranBuenosAires) {
            montoFinal = 1500;
        }
        if (envio.destinoFinal() == Destinos.OtroDestino) {
            montoFinal = 2000;
        }
        return montoFinal;
    }

    private static double calcularAdicionalXPeso(Envio envio, double montoFinal) {
        if (envio.peso() >= 5.00) {
            montoFinal += 500;
        }
        if (envio.peso() >= 30.00) {
            montoFinal += 2000;
        }
        return montoFinal;
    }

    @Override
    public double calcularPrecio(Envio envio) {
        double montoFinal = calcularXDestino(envio);
        montoFinal = calcularAdicionalXPeso(envio, montoFinal);
        return montoFinal;
    }

}
