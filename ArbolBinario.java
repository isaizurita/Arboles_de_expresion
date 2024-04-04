public class ArbolBinario 
  {
      private Nodo raiz;

      public ArbolBinario() 
        {
            this.raiz = null;
        }

      // Insertar un nuevo nodo en el árbol
      public void insertar(int dato) 
        {
            Nodo nuevoNodo = new Nodo(dato);
            if (raiz == null) 
              {
                  raiz = nuevoNodo;
              } 
            else 
              {
                  insertarRecursivo(nuevoNodo, raiz);
              }
        }

      // Función buscar un dato en el árbol
      public Nodo buscar(int dato) 
        {
          return buscarRecursivo(dato, raiz);
        }
      // Función recursiva para buscar un dato
      private Nodo buscarRecursivo(int dato, Nodo nodoActual) 
        {
            if (nodoActual == null || dato == nodoActual.dato) 
              {
                  return nodoActual;
              } 
            else if (dato < nodoActual.dato) 
              {
                  return buscarRecursivo(dato, nodoActual.izquierdo);
              } 
            else 
              {
                  return buscarRecursivo(dato, nodoActual.derecho);
              }
        }

      // Método recursivo para insertar un elemento en el árbol
      private void insertarRecursivo(Nodo nuevoNodo, Nodo nodoActual) 
        {
            if (nuevoNodo.dato < nodoActual.dato) 
              {
                  if (nodoActual.izquierdo == null) {
                      nodoActual.izquierdo = nuevoNodo;
                  } else {
                      insertarRecursivo(nuevoNodo, nodoActual.izquierdo);
                  }
              } 
            else 
              {
                  if (nodoActual.derecho == null) 
                    {
                        nodoActual.derecho = nuevoNodo;
                    } 
                  else 
                    {
                        insertarRecursivo(nuevoNodo, nodoActual.derecho);
                    }
              }
        }

      // Recorrer el árbol en preorden
      public void recorrerPreorden() 
        {
            recorrerPreordenRecursivo(raiz);
            System.out.println();
        }

      private void recorrerPreordenRecursivo(Nodo nodoActual) 
        {
            if (nodoActual != null) 
              {
                  System.out.print(nodoActual.dato + " ");
                  recorrerPreordenRecursivo(nodoActual.izquierdo);
                  recorrerPreordenRecursivo(nodoActual.derecho);
              }
        }

      // Recorrer el árbol en inorden
      public void recorrerInorden() 
        {
            recorrerInordenRecursivo(raiz);
            System.out.println();
        }

      private void recorrerInordenRecursivo(Nodo nodoActual) 
        {
            if (nodoActual != null) 
              {
                  recorrerInordenRecursivo(nodoActual.izquierdo);
                  System.out.print(nodoActual.dato + " ");
                  recorrerInordenRecursivo(nodoActual.derecho);
              }
        }

      // Recorrer el árbol en postorden
      public void recorrerPostorden() 
        {
            recorrerPostordenRecursivo(raiz);
            System.out.println();
        }

      private void recorrerPostordenRecursivo(Nodo nodoActual) 
        {
            if (nodoActual != null) 
              {
                  recorrerPostordenRecursivo(nodoActual.izquierdo);
                  recorrerPostordenRecursivo(nodoActual.derecho);
                  System.out.print(nodoActual.dato + " ");
              }
        }
  }
