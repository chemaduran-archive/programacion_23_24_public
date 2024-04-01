package U7_collections.en_clase.ej1;

import java.util.Comparator;
import java.util.LinkedList;

// Primeramente, hacemos que herede de LinkedList. Obviamente, tiene
// que tener el tipo genérico E, para que podamos crear listas de
// cualquier tipo (String, Integer, Cliente, Persona...)
public class ListaOrdenada<E> extends LinkedList<E> {

  // Nos creamos una variable que sea un comparador del tipo (E) que
  // estamos manejando
  protected Comparator<E> comparador;

  // Y nos creamos un constructor de ListaOrdenada para crear
  // ListaOrdenadas con un comparador concreto.
  public ListaOrdenada(Comparator<E> comparador) {
    this.comparador = comparador;
  }

  // Este método va insertando de manera ordenada cada vez. De tal
  // manera que tenemos que ir mirando en cada inserción, la posición
  // donde debemos insertarlo. Lógicamente, si la lista está inicialmente
  // vacía, no haría falta buscar el índice de inserción. Se inserta
  // y ya está.
  void insertarOrdenado(E elemento) {
    if (isEmpty()) {
      System.out.println("Lista vacía: Añadiendo " + elemento + " al principio");
      add(elemento);
    } else {
      System.out.println("Añadiendo " + elemento);
      int indice_insercion = 0;
      while (indice_insercion < size() && comparador.compare(elemento, get(indice_insercion)) > 0) {
        System.out.println("indice:" + indice_insercion);
        indice_insercion++;
      }
      add(indice_insercion, elemento);
    }
  }
}
