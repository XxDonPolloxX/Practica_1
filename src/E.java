public class E {
    private int numero;
    public E(int i){
        this.numero = i;
    }
    public int getNumero(){return numero;}
    public String toString(){
        return java.lang.Integer.toString(numero);
    }
    public int compareTo(E elemento){
        return this.numero - elemento.getNumero();
    }
}
