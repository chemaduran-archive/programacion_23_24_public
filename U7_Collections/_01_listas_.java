package U7_collections.teoria;

import java.util.ArrayList;
import java.util.Iterator;

public class _01_listas_ {
  public static void main(String[] args) {
    //
    Cliente c1 = new Cliente("29745987Y", "Chiquito", 8);
    Cliente c2 = new Cliente("75758989Y", "Grandito", 45);
    Cliente c3 = new Cliente("56897742F", "Medianito", 7);
    Cliente c4 = new Cliente("83630305X", "Equisele", 32);
    Cliente c5 = new Cliente("12327845W", "Moi", 47);

    ArrayList<Cliente> lista = new ArrayList<>();

    // Métodos básicos de la interfaz Collection
    // *********

    // Añadir elementos
    lista.add(c1);
    lista.add(c2);
    lista.add(c3);

    // Eliminamos el elemento c2
    lista.remove(c2);

    // Eliminar todos los elementos (dejar la lista vacía)
    lista.clear();

    // Comprobar el tamaño de la lista
    lista.size(); // devuelve la cantidad de elementos de la lista

    // Comprobar si la lista está vacía
    lista.isEmpty(); // devolverá true si no hay ningún elemento

    // Comprobar si un elemento está contenido en la lista
    // (utiliza el método equals del objeto para saber si está el objeto)
    lista.contains(c1); // Devolverá true si el elemento c1 está en la lista
    lista.contains(c4); // Devolverá false

    // Pasa la lista a formato toString, llamando a los toString de los objetos contenidos (si los
    // tuviera, si no, se imprime la referencia)
    String lista_en_formato_cadena = lista.toString();
    System.out.println(lista_en_formato_cadena);
    System.out.println(
        lista); // Podemos hacer esto directamente si tenemos el toString() implementado en la clase

    // Iteradores
    // Para recoger una lista, declaramos un iterador de la lista y lo recorremos de la siguiente
    // manera.
    Iterator<Cliente> it = lista.iterator();
    while (it.hasNext()) {
      Cliente p = it.next();
      if (p.getEdad() > 20) {
        it.remove(); // elimina el último cliente devuelto por next
        // No usar lista.remove(p) porque se altera el iterator apuntaría a otro sitio
      }
    }

    // Recorrer una lista mediante for-each
    for (Cliente c : lista) {
      System.out.println(c);
    }

    // Métodos globales de la interfaz Collection
    // *********

    ArrayList<Cliente> otra = new ArrayList<>();
    otra.add(c3);
    otra.add(c4);
    otra.add(c5);

    // Comprobar si todos los elementos de "otra están en la "lista"
    lista.containsAll(otra);

    // Añadir todos los elementos de "otra" en "lista"
    lista.addAll(otra);

    // Eliminar los elementos de "otra" que están en "lista"
    lista.removeAll(otra);

    // Elimina todos los elementos de "lista" salvo los que están en "otra"
    lista.retainAll(otra);

    // Métodos de tabla (array) de la interfaz Collection
    // *********

    // Convertir a array de Objects
    Object[] array_de_object = lista.toArray();

    // Convertir a array del tipo que forma la lista (Cliente en este caso)
    // es necesario pasarle como argumento un array del tipo de elementos con tamaño 0
    Cliente[] array_de_clientes = lista.toArray(new Cliente[0]);

    // Métodos específicos de la interfaz List
    // *********

    // Obtener el elemento que está en el índice i
    int i = 2;
    Cliente c_en_posicion_i = lista.get(i);

    // Guardar el elemento "elem" en la posición "indice", machacando el elemento que había en esa
    // posición
    int indice = 2;
    Cliente elem = new Cliente("8456474", "Pericón", 67);
    lista.set(indice, elem);

    // Guardar el elemento "c2" en la posición "índice", desplazando a la derecha el elemento que
    // había en esa posición
    lista.add(indice, c2);

    // Guardar todos los elementos de "otra_lista" a partir de la posición "indice" y desplazando
    // todos los elementos a la derecha
    lista.addAll(indice, otra);

    // Otra versión sobrecargada de eliminar. Elimina el elemento que está en "indice" y lo devuelve
    Cliente cliente_eliminado = lista.remove(2);

    // FUNCIONES DE BÚSQUEDA
    // Devuelve el índice de la primera ocurrencia de "elem" en la lista. Si no está, devuelve -1
    Integer indice_de_c4 = lista.indexOf(c4);

    // Devuelve el índice de la primera ocurrencia de "elem" en la lista, pero empezando por el
    // final. Si no está, devuelve -1
    Integer indice_ultimo_de_c3 = lista.lastIndexOf(c3);

    // Devuelve verdadero o falso si dos listas contienen los mismos elementos y en el mismo orden.
    Boolean listas_iguales = lista.equals(otra);
  }
}
