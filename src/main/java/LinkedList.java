public class LinkedList {

    private Nodo root;

    public LinkedList() {
        this.root = new NullNode();
    }

    public int size() {
        return (this.root.count());
    }

    public boolean isEmpty() {
        return (this.size()==0);
    }

    public Object getFirst() {
        return this.root.getData();
    }

    public void deleteFirst() {
        this.root=this.root.next();
    }

    public void addToEnd(Object data) {
        this.root.passData(this.root,data);
    }

}
