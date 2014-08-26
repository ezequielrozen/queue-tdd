public class Nodo {

    private Nodo siguiente;
    private Object dato;

    public Nodo(Object aDato) {
        this.dato=aDato;
    }

    public boolean tieneSiguiente() {
        return (this.siguiente!=null);
    }

    public void setSiguiente(Nodo sig) {
        this.siguiente=sig;
    }

    public Object getDato() {
        return this.dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return this.siguiente;
    }
}
