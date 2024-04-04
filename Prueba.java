import java.util.Scanner;

public class Prueba 
  {

    private static ArbolBinario arbol = new ArbolBinario();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
      {
        menu();
      }

    private static void menu() 
      {
        int opcion;
        do 
          {
            System.out.println("MENÚ DE OPCIONES:");
            System.out.println("1. Insertar un nuevo nodo");
            System.out.println("2. Buscar un nodo");
            System.out.println("3. Recorrer el árbol en preorden");
            System.out.println("4. Recorrer el árbol en inorden");
            System.out.println("5. Recorrer el árbol en postorden");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) 
              {
                case 1:
                  insertarNodo();
                  break;
                case 2:
                  buscarNodo();
                  break;
                case 3:
                  System.out.println("Recorrido en preorden:");
                  arbol.recorrerPreorden();
                  break;
                case 4:
                  System.out.println("Recorrido en inorden:");
                  arbol.recorrerInorden();
                  break;
                case 5:
                  System.out.println("Recorrido en postorden:");
                  arbol.recorrerPostorden();
                  break;
                case 6:
                  System.out.println("¡Hasta luego!");
                  break;
                default:
                  System.out.println("Opción no válida. Intente de nuevo.");
              }
          } while (opcion != 6);
      }

    private static void insertarNodo() 
      {
        System.out.print("Ingrese el dato del nuevo nodo: ");
        int dato = scanner.nextInt();
        arbol.insertar(dato);
        System.out.println("Nodo insertado correctamente.");
      }

    private static void buscarNodo() 
      {
        System.out.print("Ingrese el dato del nodo a buscar: ");
        int dato = scanner.nextInt();
        Nodo nodoEncontrado = arbol.buscar(dato);
        if (nodoEncontrado != null) 
          {
            System.out.println("Nodo encontrado: " + nodoEncontrado.dato);
          } 
        else 
          {
            System.out.println("Nodo no encontrado.");
          }
      }
  }
