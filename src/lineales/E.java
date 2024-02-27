package lineales;

public class E implements Comparable<E> {
    private int numero;
    public E(int i){
        this.numero = i;
    }

    public String toString(){
        return java.lang.Integer.toString(numero);
    }
    public int compareTo(E elemento){
        return this.numero - elemento.getNumero();
    }
    public int getNumero(){return numero;}
}
