package lineales;

import modelos.I_ListaConUltimo;

public class LEGConUltimo<E> extends LEGGenerica<E> implements I_ListaConUltimo<E> {
    protected LEGConUltimo<E> ultimo;
    public LEGConUltimo(){
        super();
        ultimo = null;
    }
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
    public static String listadoDirectoIter(){
        String res = "";
        return res;
    }

    public  String listadoDirectoRec(){
        String res = "";
        for(NodoLEG<E> aux = primero; aux != null;){

        }
        return res;
    }
    public String toStringRecursivo(NodoLEG<E> aux){
        String res="";
        if(!aux.equals(ultimo)){
            res = aux.dato.toString();
            res = res + toStringRecursivo(aux.siguiente) + "\n";
        }
        return res;
    }

    public String toStringInversoRecursivo(NodoLEG<E> aux){
        String res="";
        if(!aux.equals(ultimo)){
            res = aux.dato.toString();
            res =  toStringRecursivo(aux.siguiente) + res + "\n";
        }
        return res;
    }
}
