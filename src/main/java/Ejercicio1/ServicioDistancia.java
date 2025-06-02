package Ejercicio1;

public class ServicioDistancia {
    // en este metodo lo q haria seria obtener la distancia en KM, pero como
    // el ejercicio dice q es ilustrativo simplemente le delege un valor por defecto
    public double obtenerDistancia(Destinos destino){
        double distancia=0;
        if(destino!=Destinos.CapitalFederal){
            distancia=500;
        }
        return distancia;
    }
}
