/**
 * Created by ezequiel on 22/08/14.
 */
public class Nodo<T> {

    private Nodo siguiente;
    private T dato;

    public Nodo() {
        this.siguiente=null;
        this.dato=null;
    }

    public Nodo(T aDato) {
        this.siguiente=null;
        this.dato=aDato;
    }

    public boolean tieneSiguiente() {
        return (this.siguiente!=null);
    }

    public void setSiguiente(Nodo sig) {
        this.siguiente=sig;
    }

    public T getDato() {
        return this.dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return this.siguiente;
    }
}
