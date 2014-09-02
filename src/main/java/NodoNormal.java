public class NodoNormal implements Nodo {

    private Nodo nextNode;
    private Object data;

    public NodoNormal(Object data) {
        this.nextNode=new NodoNull();
        this.data=data;
    }

    void setNext(Nodo newNode) {
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
    public void passNode(NodoNormal previousNode, Object data) {
        this.passNode(this,data);
    }
}
