package modelos;

public interface I_ListaConUltimo<E> {
    public void insercion(E elemento);
    public void insercionFinal(E elemento);
    public String mostrarDatos();
    public boolean borrar(E elemento);
    public E recuperar(E elemento);
}
