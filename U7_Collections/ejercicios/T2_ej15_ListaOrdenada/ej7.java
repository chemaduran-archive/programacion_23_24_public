package U7_collections.en_clase.ej1;

public class ej7 {
  public static void main(String[] args) {
    ListaOrdenada<Integer> listaOrdenada = new ListaOrdenada<>(new EnterosCrecientes());

    listaOrdenada.insertarOrdenado(8);
    listaOrdenada.insertarOrdenado(1);
    listaOrdenada.insertarOrdenado(3);

    System.out.println(listaOrdenada);
  }
}
