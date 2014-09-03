public class NormalNode implements Nodo {

    private Nodo nextNode = new NullNode();
    private Object data;

    public NormalNode(Object data) {
        this.data=data;
    }

    @Override
    public void setNext(Nodo newNode) {
        this.nextNode=newNode;
    }

    @Override
    public Object getData() {
        return this.data;
    }

    @Override
    public Nodo next() {
        return this.nextNode;
    }

    @Override
    public int count() {
        return (1 + this.nextNode.count());
    }

    @Override
    public void passData(Nodo previousNode, Object data) {
        this.passData(this,data);
    }
}
