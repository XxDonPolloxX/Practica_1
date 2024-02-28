import lineales.FalloEnOperacion;
import lineales.LEGConUltimo;
import lineales.NodoLEG;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MenuComparable menu = new MenuComparable();
        try {
            menu.ejecutar();
        } catch (FalloEnOperacion e) {
            throw new RuntimeException(e);
        }

    }
}