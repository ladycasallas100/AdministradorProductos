package co.endava.app;

import co.endava.datos.Producto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdministradorProductoTest {
    @Test
    void main() {
        double descuentoEsperado = 150.0;
        Producto p1 = new Producto(101,"Cafe",1500);
        assertEquals(descuentoEsperado,p1.getDescuento());
    }
}