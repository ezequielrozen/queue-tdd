public interface Queue {

    boolean isEmpty();
    public int size();
    void add(Object item);
    void remove() throws AssertionError;
    Object top() throws AssertionError;
}
