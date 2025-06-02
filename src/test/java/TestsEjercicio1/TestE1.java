package TestsEjercicio1;

import Ejercicio1.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestE1 {
    @Test
    public void testColectivosSur(){
        var producto1= new Producto("televisor", Destinos.CapitalFederal,4.0f);
        var producto2= new Producto("Cocina", Destinos.GranBuenosAires,50.0f);
        var producto3= new Producto("Celular", Destinos.OtroDestino,6.0f);
        var servicio= new ServicioCorreo(new ColectivosSur());
        assertEquals(1000.0, servicio.calcularPrecioFinal(producto1), 0.01);
        assertEquals(4000.0, servicio.calcularPrecioFinal(producto2), 0.01);
        assertEquals(2500.0, servicio.calcularPrecioFinal(producto3), 0.01);
    }
    @Test
    public void testCorreoArgentino(){
        var producto1= new Producto("televisor", Destinos.CapitalFederal,4.0f);
        var producto2= new Producto("Cocina", Destinos.GranBuenosAires,50.0f);
        var producto3= new Producto("Celular", Destinos.OtroDestino,6.0f);
        var servicio= new ServicioCorreo(new CorreoArgentino());
        assertEquals(1000.0, servicio.calcularPrecioFinal(producto1), 0.01);
        assertEquals(4000.0, servicio.calcularPrecioFinal(producto2), 0.01);
        assertEquals(2500.0, servicio.calcularPrecioFinal(producto3), 0.01);

    }
}
