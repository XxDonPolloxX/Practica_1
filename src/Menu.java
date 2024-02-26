import java.util.Scanner;
import lineales.*;

public class Menu {
    public static void Menu() {
            Scanner sc = new Scanner(System.in);
            int respuesta;
            do {
                System.out.println("\t MENÚ LEGConUltimo");
                System.out.println("===================================================================");
                System.out.println("1. Crear lista de elementos enteros\n2. Añadir elementos a la lista\n3. Listado directo de elementos(iterativo)\n4. Listado directo de elementos(recursivo)\n5. Listado invertido de elementos(iterativo)\n6. Listado invertido de elementos(recursivo)\n0. Salir \n Elige que opcion quieres ejecutar: ");
                respuesta = sc.nextInt();
                switch (respuesta) {
                    case 1:
                        System.out.println("\t--LEGConUltimo vacía creada--\n");
                        LEGConUltimo<Integer> lista = crearLista();
                        System.out.println("\t-Presiona <intro> para continuar...-");
                        sc.nextLine();
                        break;
                    case 2:
                        System.out.println("\t--AÑADIR ELEMENTOS A LA LISTA--\n");
                        anadirElementos(lista);
                        System.out.println("\t-Presiona <intro> para continuar...-");
                        sc.nextLine();
                        break;
                    case 3:
                        System.out.println("\t--LISTADO DIRECTO DE ELEMENTOS(ITERATIVO)--\n");
                        listadoDirectoIter(lista);
                        System.out.println("\t\t-Presiona <intro> para continuar...-");
                        sc.nextLine();
                        break;
                    case 4:
                        System.out.println("\t--LISTADO DIRECTO DE ELEMENTOS(RECURSIVO)--\n");
                        listadoInvertidoIter(lista);
                        System.out.println("\t\t-Presiona <intro> para continuar...-");
                        sc.nextLine();
                        break;
                    case 5:
                        System.out.println("\t--LISTADO INVERTIDO DE ELEMENTOS(ITERATIVO)--\n");
                        listadoDirectoRec(lista);
                        System.out.println("\t\t-Presiona <intro> para continuar...-");
                        sc.nextLine();
                        break;
                    case 6:
                        System.out.println("\t--LISTADO INVERTIDO DE ELEMENTOS(RECURSIVO)--\n");
                        listadoInvertidoRec(lista);
                        System.out.println("\t\t-Presiona <intro> para continuar...-");
                        sc.nextLine();
                        break;
                    case 0:
                        System.out.println("\t--SALIENDO DEL PROGRAMA--\n");
                        break;
                    default:
                        break;
                }
            }while (respuesta != 0);
        }
        public static LEGConUltimo crearLista(){
            LEGConUltimo<E> lista = new LEGConUltimo<>();
            return lista;
        }
        public static void anadirElementos(LEGConUltimo <Integer> lista){
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce los elementos que quieres añadir(-1 para acabar):");
            int elemento = sc.nextInt();
            if(elemento != -1){
                NodoLEG<Integer> nodo = new NodoLEG<>(elemento);
                lista.insertarFinal(nodo);
            } else {
                System.out.println("\t-La lista creada es la siguiente-");
                listadoDirectoIter(lista);
            }
        }
        public static void listadoDirectoIter(LEGConUltimo <Integer> lista){
            System.out.println("\t\t\tElementos de la lista:");
            lista.toStringIterativo();
        }
        public static void listadoInvertidoIter(LEGConUltimo <Integer> lista){
            System.out.println("\t\t\tElementos de la lista:");
            lista.toStringInversoIterativo();
        }
        public static void listadoDirectoRec(LEGConUltimo <Integer> lista){
            System.out.println("\t\t\tElementos de la lista:");
            lista.toStringRecursivo(lista.getPrimero());
        }
        public static void listadoInvertidoRec(LEGConUltimo <Integer> lista){
            System.out.println("\t\t\tElementos de la lista:");
            lista.toStringInversoRecursivo(lista.getPrimero());
        }

}
