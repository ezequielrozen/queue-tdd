public abstract interface Node {

    public Object getData();
    public Node next();
    public int count();
    public void passData(Node previousNode, Object data);
    public void setNext(NormalNode newNode);
}
