package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        var p1 = new Producto(300.50, new Libro());
        var p2 = new Producto(300.50, new Medicina());
        var p3 = new Producto(300.50, new Alimento());
        var p4 = new Producto(300.50, new Otro());
        var calculadora = new CalculadorDePrecios();
        System.out.println("Precio final del libro: " + calculadora.precioFinal(p1));
        System.out.println("Precio final de la medicina: " + calculadora.precioFinal(p2));
        System.out.println("Precio final del alimento: " + calculadora.precioFinal(p3));
        System.out.println("Precio final de otro: " + calculadora.precioFinal(p4));
    }
}
