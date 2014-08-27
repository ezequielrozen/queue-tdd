public interface Queue {

    boolean isEmpty();
    public int size();
    void add(Object item);
    Object remove() throws AssertionError;
    Object top() throws AssertionError;
}
