public class LinkedList {

    private Nodo raiz;

    public LinkedList() {
        this.raiz = new NodoNull();
    }

    public int size() {
        return (1 + this.raiz.next().count());
    }

    public boolean isEmpty() {
        return (this.size()==0);
    }

    public Object getFirst() {
        return this.raiz.getData();
    }

    public void deleteFirst() {
        this.raiz=this.raiz.next();
    }

    public void addToEnd(Object data) {
        //TODO: No se si esta bien castear.
        this.raiz.passNode((NodoNormal) this.raiz,data);
    }

}
