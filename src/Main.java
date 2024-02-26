import lineales.LEGConUltimo;
import lineales.NodoLEG;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LEGConUltimo<E> leg = new LEGConUltimo<E>();
        E uno = new E(6);
        leg.insertar(new NodoLEG<E>(new E(2)));
        leg.insertar(new NodoLEG<E>(new E(3)));
        leg.insertarFinal(new NodoLEG<E>(new E(9)));
        leg.insertar(new NodoLEG<E>(uno));
        System.out.println(leg.getPrimero().getDato().toString());
        System.out.println(leg.toStringRecursivo(leg.getPrimero()));
        System.out.println(leg.toStringInversoRecursivo(leg.getPrimero()));
        leg.eliminar(uno);
        System.out.println(leg.toStringRecursivo(leg.getPrimero()));
        System.out.println(leg.recuperar(0).getNumero());
    }
}