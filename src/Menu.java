import java.util.Scanner;
import lineales.*;

public class Menu {
    protected static LEGConUltimo<E> leg;
    public Menu(){leg = null;}
    public static void ejecutar() throws FalloEnOperacion {
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
                        leg = crearLista();
                        System.out.println("\t-Presiona <intro> para continuar...-");
                        sc.nextLine();
                        break;
                    case 2:
                        System.out.println("\t--AÑADIR ELEMENTOS A LA LISTA--\n");
                        anadirElementos();
                        System.out.println("\t-Presiona <intro> para continuar...-");
                        sc.nextLine();
                        break;
                    case 3:
                        System.out.println("\t--LISTADO DIRECTO DE ELEMENTOS(ITERATIVO)--\n");
                        listadoDirectoIter(leg);
                        System.out.println("\t\t-Presiona <intro> para continuar...-");
                        sc.nextLine();
                        break;
                    case 4:
                        System.out.println("\t--LISTADO DIRECTO DE ELEMENTOS(RECURSIVO)--\n");
                        listadoDirectoRec(leg);
                        System.out.println("\t\t-Presiona <intro> para continuar...-");
                        sc.nextLine();
                        break;
                    case 5:
                        System.out.println("\t--LISTADO INVERTIDO DE ELEMENTOS(ITERATIVO)--\n");
                        listadoInvertidoIter(leg);
                        System.out.println("\t\t-Presiona <intro> para continuar...-");
                        sc.nextLine();
                        break;
                    case 6:
                        System.out.println("\t--LISTADO INVERTIDO DE ELEMENTOS(RECURSIVO)--\n");
                        listadoInvertidoRec(leg);
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
            leg = new LEGConUltimo<E>();
            return leg;
        }
        public static void anadirElementos(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce los elementos que quieres añadir(-1 para acabar):");
            int elemento = sc.nextInt();
            while (elemento != -1){
                if(elemento<-1){
                    System.out.println("No se admiten valores negativos");
                }
                else{
                    NodoLEG<E> nodo = new NodoLEG<E>(new E(elemento));
                    leg.insertarFinal(nodo);
                }
                elemento = sc.nextInt();
            }
                System.out.println("\t-La lista creada es la siguiente-");
                listadoDirectoIter(leg);

        }
        public static void listadoDirectoIter(LEGConUltimo <E> lista){
            if(leg.getPrimero() == null){
                System.out.println("Lista vacía \n");
            }
            else{
                System.out.println("\t\t\tElementos de la lista:");
                System.out.println(lista.toStringIterativo());
            }


        }
        public static void listadoInvertidoIter(LEGConUltimo <E> lista){
            if(leg.getPrimero() == null){
                System.out.println("Lista vacía \n");
            }
            else{
                System.out.println("\t\t\tElementos de la lista:");
                System.out.println(lista.toStringInversoIterativo());
            }


        }
        public static void listadoDirectoRec(LEGConUltimo <E> lista){
            if(leg.getPrimero() == null){
                System.out.println("Lista vacía \n");
            }
            else{
                System.out.println("\t\t\tElementos de la lista:");
                System.out.println(lista.toStringRecursivo());
            }


        }
        public static void listadoInvertidoRec(LEGConUltimo <E> lista){
            if(leg.getPrimero() == null){
                System.out.println("Lista vacía \n");
            }
            else{
                System.out.println("\t\t\tElementos de la lista:");
                System.out.println(lista.toStringInversoRecursivo());
            }

        }

}
