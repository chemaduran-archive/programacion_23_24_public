package U7_collections.teoria;

import java.util.*;

public class _03_set {
  public static void main(String[] args) {
    //
    Cliente c1 = new Cliente("29745987Y", "c1", 8);
    Cliente c2 = new Cliente("75758989Y", "c2", 45);
    Cliente c3 = new Cliente("56897742F", "c3", 7);
    Cliente c4 = new Cliente("83630305X", "c4", 32);
    Cliente c5 = new Cliente("12327845W", "c5", 47);

    // Tenemos las mismas funciones que las listas por el hecho de pertenecer a la interfaz
    // Collection
    /*
    int size();
    boolean isEmpty();
    boolean contains(Object element);
    boolean add(E element);
    boolean remove(Object element);
    Iterator<E> iterator();
    boolean containsAll(Collection<?> c);
    boolean addAll(Collection<? extends E> c);
    boolean removeAll(Collection<?> c);
    boolean retainAll(Collection<?> c);
    void clear();
    Object[] toArray();
    <T> T[] toArray(T[]);
    */

    // También podemos recorrer un Set con un for-each.
    // No es posible el acceso posicional por medio de índices
    // Al añadir mediante add un elemento que ya está añadido, no da error, simplemente devuelve
    // false

    // Diferentes implementaciones:
    // HashSet: no garantiza ningún orden en la inserción
    // TreeSet: garantiza el orden natural de los elementos o el que se le pase mediante comparator
    // LinkedHashSet: garantiza el orden basado en la inserción, ya que siempre inserta al final

    TreeSet<Cliente> conjunto = new TreeSet<>();
    conjunto.add(c1);
    conjunto.add(c2);
    conjunto.add(c3);
    System.out.println(conjunto);

    TreeSet<Cliente> conjunto_descendente = new TreeSet<>(new OrdenaDescendente());
    conjunto_descendente.add(c1);
    conjunto_descendente.add(c2);
    conjunto_descendente.add(c3);
    System.out.println(conjunto_descendente);

    // Conversiones entre colecciones
    // Si queremos ordenar un conjunto, hay dos formas:
    // 1. Construir un TreeSet con el criterio de ordenación que deseamos y luego añadimos con
    // addAll() el conjunto a ordenar
    //
    Set<Integer> s1 = new LinkedHashSet<>();
    s1.add(4);
    s1.add(1);
    s1.add(5);
    s1.add(10);
    System.out.println(s1);
    Set<Integer> s2 = new TreeSet<>();
    s2.addAll(s1);
    System.out.println(s2);
    // 2. Si el criterio de ordenación va a ser el natural, construimos un TreeSet pasando como
    // argumento al constructor el conjunto que queremos ordenar
    Set<Integer> s3 = new TreeSet<>(s1);
    System.out.println(s3);

    // Podemos filtrar elementos repetidos de una lista convirtiéndolo a Set (además lo ordena, si
    // es un TreeSet, claro)
    Collection<Integer> lista = new ArrayList<>();
    lista.add(5);
    lista.add(3);
    lista.add(5); // elemento repetido
    lista.add(2);
    lista.add(5); // elemento repetido
    System.out.println(lista);
    Set<Integer> s = new TreeSet<>(lista);
    System.out.println(s);

    // Es costumbre que se declare como Collection, para poder transformarlo tranquilamente
  }
}
