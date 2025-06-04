package Ejercicio1;

public class CorreoArgentino implements CalcularEnvio {
    private ServicioDistancia servicioExterno;

    @Override
    public double calcularPrecio(Envio envio) {
        double montoFinal = calcularXDestino(envio);
        montoFinal = montoFinal + calcularAdicionalXKM(envio.destinoFinal());
        return montoFinal;
    }

    private double calcularXDestino(Envio envio) {
        double monto = 0;
        if (envio.destinoFinal() == Destinos.CapitalFederal) {
            monto = 500;
        }
        if (envio.destinoFinal() == Destinos.OtroDestino) {
            monto = 800;
        }
        return monto;
    }

    private double calcularAdicionalXKM(Destinos destino) {
        return 5 * servicioExterno.obtenerDistancia(destino);
    }

}
