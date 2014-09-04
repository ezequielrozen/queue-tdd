public class NullNode implements Node {

    public NullNode() { }

    @Override
    public Object getData() {
        throw new AssertionError("La cola esta vacia");
    }

    @Override
    public Node next() {
        throw new AssertionError("La cola esta vacia");
    }

    @Override
    public int count() {
        return 0;
    }

    @Override
    public void passData(Node previousNode, Object data) {
        previousNode.setNext(new NormalNode(data));
    }

    @Override
    public void setNext(NormalNode newNode) {

    }
}
