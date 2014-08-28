import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class ColaTest {

    @Test
    public void deberiaCrearUnaColaVacia() {
        Cola cola= new Cola();
        assertTrue(cola.isEmpty());
    }

    @Test
    public void deberiaAgregarUnNodoALaCola() {
        Cola cola = new Cola();
        cola.add(6);
        assertFalse(cola.isEmpty());
    }

    @Test
    public void deberiaDevolverElValorDelPrimerElementoDeLaCola() {
        Cola cola = new Cola();
        cola.add(6);
        assertEquals(cola.top(),6);
    }

    @Test
    public void deberiaDevolverElValorDelPrimerElementoDeLaColaYDejarlaVacia() {
        Cola cola = new Cola();
        cola.add(6);
        assertEquals(cola.remove(),6);
        assertTrue(cola.isEmpty());
    }

    @Test
    public void deberiaDevolverElTamanioDeLaCola() {
        Cola cola = new Cola();
        cola.add(6);
        assertEquals(cola.size(),1);
    }

    @Test(expected= AssertionError.class)
    public void deberiaLanzarUnaExcepcionAlQuererObtenerPrimerElementoPorColaVacia() {
        Cola cola = new Cola();
        cola.top();
    }

    @Test(expected= AssertionError.class)
    public void deberiaLanzarUnaExcepcionAlQuererRemoverPrimerElementoPorColaVacia() {
        Cola cola = new Cola();
        cola.remove();
    }
}
