package lineales;

import modelos.I_ListaConUltimo;

public class LEGConUltimo<E> extends LEGGenerica<E> implements I_ListaConUltimo<E> {
    protected NodoLEG<E> ultimo;
    public LEGConUltimo(){
        super();
        ultimo = null;
    }
    public NodoLEG<E> getUltimo(){return ultimo;}
    public NodoLEG<E> getPrimero(){return primero;}
    public void insertar(NodoLEG<E> x) {
        if(primero==null){
            primero = x;
            ultimo = x;

        }
        else{
            super.insertar(x);
        }

    }
    public void insertarFinal(NodoLEG<E> x) {
        if(primero==null){
            primero = x;
            ultimo = x;

        }
        else{
            ultimo.siguiente = x;
            ultimo = x;
        }
    }

    public String toString() {
        return null;
    }

    public boolean eliminar(E elemento) {
        return false;
    }

    public E recuperar(int i) {
         E dato = super.recuperar(i);
         return dato;
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
        res = aux.dato.toString();
        if(!aux.equals(ultimo)){
            res = res + " " + toStringRecursivo(aux.siguiente) + "\n";
        }
        return res;
    }

    public String toStringInversoRecursivo(NodoLEG<E> aux){
        String res="";
        if(!aux.equals(ultimo)){
            res = aux.dato.toString();
            res =  toStringRecursivo(aux.siguiente) + " " + res + "\n";
        }
        return res;
    }
}
