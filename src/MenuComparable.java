import lineales.E;
import lineales.FalloEnOperacion;
import lineales.LEGConUltimo;
import lineales.LEGConUltimoEC;

import java.util.Scanner;

public class MenuComparable extends Menu{
    protected static LEGConUltimoEC<E> leg;
    public MenuComparable(){leg = null;}
    public static void ejecutar() throws FalloEnOperacion {
        Scanner sc = new Scanner(System.in);

        int respuesta;
        do {
            System.out.println("\t MENÚ LEGConUltimo con elementos comparables");
            System.out.println("===================================================================");
            System.out.println("1. Crear lista de elementos enteros\n2. Añadir elementos a la lista\n3. Borrar elemento mínimo\n4. Mover cabeza de lista a la cola de la lista\n5. Insertar nodos centinela\n0. Salir \n Elige que opcion quieres ejecutar: ");
            respuesta = sc.nextInt();
            switch (respuesta) {
                case 1:
                    System.out.println("\t--LEGConUltimo comparable vacía creada--\n");
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
                    System.out.println("\t--MOVER CABEZA DE LISTA A LA COLA DE LA LISTA--\n");
                    System.out.println("Lista original:");
                    listadoDirectoIter(leg);
                    System.out.println("Lista modificada:");
                    leg.moverCabeza();
                    listadoDirectoIter(leg);
                    System.out.println("\t\t-Presiona <intro> para continuar...-");
                    sc.nextLine();
                    break;
                case 5:
                    System.out.println("\t--INSERTAR CENTINELAS--\n");
                    System.out.println("Lista original:");
                    listadoDirectoIter(leg);
                    leg.insertarCentinelas();
                    System.out.println("Lista modificada:");
                    listadoDirectoIter(leg);
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
    public static LEGConUltimoEC<E> crearLista(){
        leg = new LEGConUltimoEC<E>();
        return leg;
    }
}
