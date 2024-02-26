package lineales;

public class NodoLEG <E>{
    E dato;
    NodoLEG<E> siguiente;

    NodoLEG(E dato){
        this(dato, null);
    }

    public NodoLEG(E dato, NodoLEG<E> siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }
}
