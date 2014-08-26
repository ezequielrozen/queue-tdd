import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class NodoTest {

    @Test
    public void deberiaCrearUnNodoConUnDatoEntero() {
        assertEquals((new Nodo(5)).getDato(), 5);
    }

    @Test
    public void deberiaCrearUnNodoSinSiguiente() {
        Nodo aNodo = new Nodo("lala");
        assertEquals(aNodo.tieneSiguiente(), false);
    }

    @Test
    public void deberiaCrearUnNodoConDato() {
        Nodo aNodo = new Nodo("lala");
        assertEquals(aNodo.getDato(),"lala");
    }

    @Test
    public void deberiaSetearseElNodoSiguiente() {
        Nodo aNodo = new Nodo("lala");
        Nodo otroNodo = new Nodo("hola");
        aNodo.setSiguiente(otroNodo);
        assertTrue(aNodo.tieneSiguiente());
    }

    @Test
    public void deberiaObtenerseElDatoDelNodoSiguiete() {
        Nodo aNodo = new Nodo("lala");
        Nodo otroNodo = new Nodo("hola");
        aNodo.setSiguiente(otroNodo);
        assertEquals(aNodo.getSiguiente().getDato(), "hola");
    }

}
