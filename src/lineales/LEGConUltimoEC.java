package lineales;
//importa una libreria comparable
import modelos.I_ListaConUltimoEC;

import java.awt.*;


public class LEGConUltimoEC<E extends Comparable<E>> extends LEGConUltimo<E> implements I_ListaConUltimoEC<E> {
    public LEGConUltimoEC(){
        super();
    }
    public void borrarMinimo() {
    if(primero == null){
            System.out.println("Lista vacía");
        }
        else{
            NodoLEG<E> aux = primero;
            NodoLEG<E> ant = null;
            NodoLEG<E> min = primero;
            NodoLEG<E> antMin = null;
            while(aux != null){
                if(aux.getDato().compareTo(min.getDato())<0){
                    min = aux;
                    antMin = ant;
                }
                ant = aux;
                aux = aux.siguiente;
            }
            if(min == primero){
                primero = primero.siguiente;
            }
            else{
                antMin.siguiente = min.siguiente;
            }
            if(min == ultimo){
                ultimo = antMin;
            }
        }
    }

    public void moverCabeza() throws FalloEnOperacion{
        NodoLEG<E> aux;
        if(primero.getDato().compareTo(ultimo.getDato())<0){
            aux = primero.siguiente;
            ultimo.siguiente = primero;
            ultimo = primero;
            primero = aux;
        }
        else{
            throw new FalloEnOperacion();
        }
    }
    public void insertarCentinelas(){
        if(ultimo.getDato()){

        }
    }

}
