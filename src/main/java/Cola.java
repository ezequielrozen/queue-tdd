public class Cola implements Queue {

    private LinkedList list;

    public Cola() {
        this.list=new LinkedList();
    }

    @Override
    public boolean isEmpty() {
        return this.list.isEmpty();
    }

    @Override
    public int size() {
        return this.list.size();
    }

    @Override
    public void add(Object item) {
        this.list.addToEnd(item);
    }

    @Override
    public void remove() throws AssertionError {
        this.list.deleteFirst();
    }

    @Override
    public Object top() throws AssertionError {
        return this.list.getFirst();
    }
}
