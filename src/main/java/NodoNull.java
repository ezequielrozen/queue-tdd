public class NodoNull implements Nodo {

    //TODO: No se si va este atributo
    private NodoNormal nextNode;

    public NodoNull() {

    }

    @Override
    public Object getData() {
        throw new AssertionError("La cola esta vacia");
    }

    @Override
    public Nodo next() {
        throw new AssertionError("La cola esta vacia");
    }

    @Override
    public int count() {
        return 0;
    }

    @Override
    public void passNode(NodoNormal previousNode, Object data) {
        previousNode.setNext(new NodoNormal(data));
    }
}
