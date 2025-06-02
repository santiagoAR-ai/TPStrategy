package Ejercicio1;

public class Producto {
    private String nombre;
    private Destinos destino;
    private float peso;

    public Producto(String nombre, Destinos destino, float peso) {
        this.nombre = nombre;
        this.destino = destino;
        this.peso = peso;
    }

    public Destinos destinoFinal(){
        return this.destino;
    }
    public float peso(){
        return this.peso;
    }
}
