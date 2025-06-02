package Ejercicio1;

public class ColectivosSur implements CalcularEnvio{
    @Override
    public double calcularPrecio(Producto producto) {
        double montoFinal = calcularXDestino(producto);
        montoFinal = calcularAdicionalXPeso(producto, montoFinal);
        return montoFinal;
    }

    private static double calcularXDestino(Producto producto) {
        double montoFinal=0;
        if(producto.destinoFinal()==Destinos.CapitalFederal){
            montoFinal=1000;
        }
        if(producto.destinoFinal()==Destinos.GranBuenosAires){
            montoFinal=1500;
        }
        if(producto.destinoFinal()==Destinos.OtroDestino){
            montoFinal=2000;
        }
        return montoFinal;
    }

    private static double calcularAdicionalXPeso(Producto producto, double montoFinal) {
        if(producto.peso()>=5.00){
            montoFinal +=500;
        }
        if(producto.peso()>=30.00){
            montoFinal +=2000;
        }
        return montoFinal;
    }

}
