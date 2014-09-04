public class LinkedList {

    private Node top;

    public LinkedList() {
        this.top = new TopNode();
    }

    public int size() {
        return (this.top.count());
    }

    public boolean isEmpty() {
        return (this.size()==0);
    }

    public Object getFirst() {
        return this.top.getData();
    }

    public void deleteFirst() {
        this.top.setNext(this.top.next().next());
    }

    public void addToEnd(Object data) {
        this.top.passData(this.top,data);
    }

}
