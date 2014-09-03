public class NullNode implements Nodo {

    public NullNode() { }

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
    public void passData(Nodo previousNode, Object data) {
        previousNode.setNext(new NormalNode(data));
    }

    @Override
    public void setNext(Nodo newNode) {
        //Nothing todo.
    }
}
