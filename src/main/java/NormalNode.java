public class NormalNode implements Node {

    private Node nextNode = new NullNode();
    private Object data;

    public NormalNode(Object data) {
        this.data=data;
    }

    @Override
    public void setNext(Node newNode) {
        this.nextNode=newNode;
    }

    @Override
    public Object getData() {
        return this.data;
    }

    @Override
    public Node next() {
        return this.nextNode;
    }

    @Override
    public int count() {
        return (1 + this.nextNode.count());
    }

    @Override
    public void passData(Node previousNode, Object data) {
        this.nextNode.passData(this,data);
    }
}
