package lineales;
//importa una libreria comparable

import modelos.I_ListaConUltimoEC;

import java.awt.*;


public class LEGConUltimoEC<E extends Number> extends LEGConUltimo<E> implements I_ListaConUltimoEC<E> {
    public LEGConUltimoEC() {
        super();
    }

    public void borrarMinimo() {
        if (primero == null) {
            System.out.println("Lista vacía");
        }
        else {
            NodoLEG<E> aux = primero, ant = null, min = primero, antMin = null;
            while (aux != null) {
                if ((int)aux.getDato() < (int)min.getDato()) {
                    min = aux;
                    antMin = ant;
                }
                ant = aux;
                aux = aux.siguiente;
            }
            if (min == primero) {
                primero = primero.siguiente;
            }
            else {
                antMin.siguiente = min.siguiente;
            }
            if (min == ultimo) {
                ultimo = antMin;
            }
        }
    }

    public void moverCabeza() throws FalloEnOperacion {
        NodoLEG<E> aux;
        if ((int)primero.getDato() < (int)ultimo.getDato()) {
            aux = primero.siguiente;
            ultimo.siguiente = primero;
            ultimo = primero;
            primero = aux;
        } else {
            throw new FalloEnOperacion();
        }
    }

    public void insertarCentinelas() {
        if ((int)ultimo.getDato() % 2 == 0) {
            for (NodoLEG<E> aux = primero; aux == ultimo; aux = aux.siguiente) {
                if ((int)aux.getDato() % 2 == 0) {
                    //CREAR NODO CON DATOS = -12
                    NodoLEG<E> centinela = new NodoLEG<E>((E) new Integer(-12));
                    centinela.siguiente = aux.siguiente;
                    aux.siguiente = centinela;
                }
            }

        }
    }

}
