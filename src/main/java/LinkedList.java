public class LinkedList {

    private Nodo raiz;

    public LinkedList() {
        this.raiz = new NullNode();
    }

    public int size() {
        return (this.raiz.count());
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
        this.raiz.passData(this.raiz,data);
    }

}
