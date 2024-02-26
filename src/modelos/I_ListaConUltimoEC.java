package modelos;

import lineales.FalloEnOperacion;

public interface I_ListaConUltimoEC<E> {
    public void borrarMinimo();
    public void moverCabeza() throws FalloEnOperacion;
    public void insertarCentinelas();
}
