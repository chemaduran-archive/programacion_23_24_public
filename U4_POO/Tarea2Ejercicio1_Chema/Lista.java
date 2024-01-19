package U4_poo.ejercicios.T2.A1;

// Las listas son estructuras dinámicas de datos, donde se pueden insertar o eliminar elementos de
// un determinado tipo
// sin limitación de espacio. Implementar la clase Lista correspondiente a una lista de números de
// la clase Integer.
// Los números se guardarán en una tabla. Cuando falte espacio para un nuevo elemento, la tabla se
// redimensionará,
// incrementando la capacidad de la lista. Entre los métodos de la clase se incluirán:
//
//    Dos constructores, uno por defecto que cree la tabla con capacidad para 10 números, y otro al
//    que se le pasa como argumento el tamaño inicial de la tabla.
//    Obtener el número de elementos insertados en la lista.
//    Insertar un número al final de la lista.
//    Insertar un número al principio de la lista.
//    Insertar un número en un lugar de la lista cuyo índice se pasa como parámetro.
//    Añadir al final de la lista los elementos de otra lista que se pasa como parámetro.
//    Eliminar un elemento cuyo índice en la lista se pasa como parámetro.
//    Obtener el elemento cuyo índice se pasa como parámetro.
//    Buscar un número en la lista, devolviendo el índice del primer lugar donde se encuentre. Si no
// está, devolver -1.
//    Representar la lista con una cadena de caracteres.

import java.util.Arrays;

public class Lista {
  private Integer[] t;
  private int num_elementos;

  public Lista() {
    t = new Integer[10];
    num_elementos = 0;
  }

  public Lista(int capacidad) {
    t = new Integer[capacidad];
    num_elementos = 0;
  }

  public int get_num_elementos() {
    return num_elementos;
  }

  public boolean lista_llena() {
    return num_elementos == t.length;
  }

  public boolean insertar_en_posicion(int n, Integer x) {
    boolean insertado = true;

    if (n < 0 || n > num_elementos) {
      insertado = false;
    } else {
      if (lista_llena()) {
        t = Arrays.copyOf(t, t.length + 1);
      }
      for (int i = num_elementos; i > n; i--) {
        t[i] = t[i - 1];
      }
      t[n] = x;
      num_elementos++;
    }
    return insertado;
  }

  public void insertar_principio(Integer x) {
    insertar_en_posicion(0, x);
  }

  public void insertar_final(Integer i) {
    insertar_en_posicion(num_elementos, i);
  }

  // Elimina el elemento de la posición n
  public Integer eliminar_elemento(int n) {
    Integer eliminado = null;

    if (n >= 0 && n < num_elementos) {
      eliminado = t[n];
      for (int i = n; i < num_elementos - 1; i++) {
        t[i] = t[i + 1];
      }
      num_elementos--;
    }
    return eliminado;
  }

  // Obtiene el elemento de la posición n
  public Integer obtener_elemento(int n) {
    Integer resultado = null;
    if (n >= 0 && n < num_elementos) {
      resultado = t[n];
    }
    return resultado;
  }

  public int buscar_elemento(Integer x) {
    int resultado = -1;
    for (int i = 0; i < t.length; i++) {
      if (t[i] != null && t[i].equals(x)) {
        return i;
      }
    }
    return resultado;
  }

  // Inserta los elementos de l2 en l
  public void insertar_lista_final(Lista l2) {
    t = Arrays.copyOf(t, t.length + l2.get_num_elementos());

    for (int i = 0; i < l2.get_num_elementos(); i++) {
      insertar_final(l2.obtener_elemento(i));
    }
  }

  public void ordenar() {
    Arrays.sort(t, 0, num_elementos);
  }

  public String mostrar_lista() {
    String resultado = "";
    for (int i = 0; i < num_elementos; i++) {
      if (t[i] != null) {
        resultado += t[i] + " ";
      }
    }
    return resultado;
  }
}