package modelos;

public interface I_ListaConUltimo<E> {
    public void insertar(E x);
    public void insertarFinal(E elemento);
    public String toString();
    public boolean eliminar(E elemento);
    public E recuperar(E elemento);
}
