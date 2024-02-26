package lineales;

public class LEGGenerica <E>{
    protected NodoLEG<E> primero;

    public LEGGenerica(){
        primero = null;
    }

    public void insertar(E x){
        NodoLEG<E> nuevo = new NodoLEG<>(x);
        nuevo.siguiente = primero;
        primero = nuevo;
    }

    public void insertarFinal(E x){
        NodoLEG<E> nuevo = new NodoLEG<>(x);
        NodoLEG<E> aux = primero;
        if(aux == null){
            primero = nuevo;
        }
        else{
            while (aux.siguiente != null){
                aux = aux.siguiente;
                aux.siguiente = nuevo;
            }
        }
    }
    public String toString(){
        String res = "";
        for (NodoLEG<E> aux = primero;null != aux; aux = aux.siguiente){
            res += aux.dato.toString() + "\n";
        }
        return res;
    }
    public void eliminar(E x){
        NodoLEG<E> aux = primero, ant = null;
        boolean res = false;
        if (aux == null){
            System.out.println("Lista vacia");
        }else {
            while (!aux.dato.equals(x)){
                ant = aux; aux = aux.siguiente;
            }
            if (aux != null){
                res = true;
                if (ant == null){
                    primero = aux.siguiente;
                }else {
                    ant.siguiente = aux.siguiente;
                }
            }
        }
    }
}