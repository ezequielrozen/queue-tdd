public abstract interface Nodo {

    public Object getData();
    public Nodo next();
    public int count();
    public void passNode(NodoNormal previousNode, Object data);
}
