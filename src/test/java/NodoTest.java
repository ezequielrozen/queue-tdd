import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class NodoTest {

    @Test
    public void deberiaCrearUnNodoConUnDatoEntero() {
        assertEquals((new Nodo<Integer>(5)).getDato(), new Integer(5));
    }

    @Test
    public void deberiaCrearUnNodoVacioYSetarleElDato() {
        Nodo<Integer> aNodo = new Nodo<Integer>();
        aNodo.setDato(5);
        assertEquals(aNodo.getDato(), new Integer(5));
    }

    @Test
    public void deberiaCrearUnNodoSinSiguiente() {
        Nodo<String> aNodo = new Nodo<String>("lala");
        assertEquals(aNodo.tieneSiguiente(), false);
    }

    @Test
    public void deberiaCrearUnNodoConDato() {
        Nodo<String> aNodo = new Nodo<String>("lala");
        assertEquals(aNodo.getDato(),"lala");
    }

    @Test
    public void deberiaSetearseElNodoSiguiente() {
        Nodo<String> aNodo = new Nodo<String>("lala");
        Nodo<String> otroNodo = new Nodo<String>("hola");
        aNodo.setSiguiente(otroNodo);
        assertTrue(aNodo.tieneSiguiente());
    }

    @Test
    public void deberiaObtenerseElDatoDelNodoSiguiete() {
        Nodo<String> aNodo = new Nodo<String>("lala");
        Nodo<String> otroNodo = new Nodo<String>("hola");
        aNodo.setSiguiente(otroNodo);
        assertEquals(aNodo.getSiguiente().getDato(), "hola");
    }

}
