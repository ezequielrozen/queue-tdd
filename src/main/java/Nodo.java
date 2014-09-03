public abstract interface Nodo {

    public Object getData();
    public Nodo next();
    public int count();
    public void passData(Nodo previousNode, Object data);
    public void setNext(Nodo newNode);
}
