import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class NormalNodeTest {

    @Test
    public void deberiaCrearUnNormalNodeConUnDatoEntero() {
        assertEquals((new NormalNode(5)).getData(), 5);
    }

    @Test
    public void deberiaCrearUnNormalNodeConNullNodeComoSiguiente() {
        NormalNode aNormalNode = new NormalNode("lala");
        assertTrue(aNormalNode.next() instanceof NullNode);
    }

    @Test
    public void deberiaCrearUnNormalNodeConDato() {
        NormalNode aNormalNode = new NormalNode("lala");
        assertEquals(aNormalNode.getData(),"lala");
    }

    @Test
    public void deberiaSetearseElNormalNodeSiguiente() {
        NormalNode aNormalNode = new NormalNode("lala");
        NormalNode otroNormalNode = new NormalNode("hola");
        aNormalNode.setNext(otroNormalNode);
        assertEquals(aNormalNode.next(), otroNormalNode);
    }

    @Test
    public void deberiaObtenerseElDatoDelNormalNodeSiguiete() {
        NormalNode aNormalNode = new NormalNode("lala");
        NormalNode otroNormalNode = new NormalNode("hola");
        aNormalNode.setNext(otroNormalNode);
        assertEquals(aNormalNode.next().getData(), "hola");
    }

}
