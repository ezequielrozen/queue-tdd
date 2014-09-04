public class TopNode implements Node {

    private Node nextNode;

    public TopNode() {
        this.nextNode=new NullNode();
    }

    @Override
    public Object getData() {
        return this.nextNode.getData();
    }

    @Override
    public Node next() {
        return this.nextNode;
    }

    @Override
    public int count() {
        return this.nextNode.count();
    }

    @Override
    public void passData(Node previousNode, Object data) {
        this.nextNode.passData(this,data);
    }

    @Override
    public void setNext(Node newNode) {
        this.nextNode=newNode;
    }
}
