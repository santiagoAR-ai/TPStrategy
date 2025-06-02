package Ejercicio1;

public class CorreoArgentino implements CalcularEnvio{
    private ServicioDistancia servicioExterno;

    @Override
    public double calcularPrecio(Producto producto) {
        double montoFinal=calcularXDestino(producto);
        montoFinal= montoFinal + calcularAdicionalXKM(producto.destinoFinal());
        return montoFinal;
    }

    private double calcularXDestino(Producto producto) {
        double monto=0;
        if(producto.destinoFinal()==Destinos.CapitalFederal){
            monto =500;
        }
        if(producto.destinoFinal()==Destinos.OtroDestino){
            monto =800;
        }
        return monto;
    }
    private double calcularAdicionalXKM(Destinos destino){
        return 5*servicioExterno.obtenerDistancia(destino);
    }

}
