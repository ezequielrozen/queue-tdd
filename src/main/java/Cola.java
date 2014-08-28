public class Cola implements Queue {

    private Nodo raiz,ultimo;

    public Cola() { }

    public boolean isEmpty() {
        return this.raiz==null;
    }

    public int size() {
        int cantidad=0;
        Nodo auxiliar=this.raiz;
        while (auxiliar!=null) {
            cantidad++;
            auxiliar=auxiliar.getSiguiente();
        }
        return cantidad;
    }

    public void add(Object item) {
        Nodo nuevo = new Nodo(item);
        if (this.isEmpty()) {
            this.raiz = nuevo;
            this.ultimo = nuevo;
        } else {
            this.ultimo.setSiguiente(nuevo);
            this.ultimo = nuevo;
        }
    }

    public Object remove() throws AssertionError {
        if (!this.isEmpty()) {
            Object resultado = raiz.getDato();
            if (this.raiz == this.ultimo){
                this.raiz = null;
                this.ultimo = null;
            } else {
                this.raiz = this.raiz.getSiguiente();
            }
            return resultado;
        } else
            throw new AssertionError("La cola esta vacia.");
    }

    public Object top() throws AssertionError {
        if (!this.isEmpty()) {
            return raiz.getDato();
        } else
            throw new AssertionError("La cola esta vacia.");
    }
}
