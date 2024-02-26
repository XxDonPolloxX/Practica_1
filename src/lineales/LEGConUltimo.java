package lineales;

import modelos.I_ListaConUltimo;

public class LEGConUltimo<E> extends LEGGenerica<E> implements I_ListaConUltimo<E> {

    public void insertar(E x) {
        super.insertar(x);
    }
    public void insertarFinal(E elemento) {


    }

    public String toString() {
        return null;
    }

    public boolean eliminar(E elemento) {
        return false;
    }

    public E recuperar(int i) {
        return null;
    }
}
