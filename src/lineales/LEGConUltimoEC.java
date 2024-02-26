package lineales;
//importa una libreria comparable
import modelos.I_ListaConUltimoEC;

import java.awt.*;


public class LEGConUltimoEC<E extends Comparable<E>> extends LEGConUltimo<E> implements I_ListaConUltimoEC<E> {
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
