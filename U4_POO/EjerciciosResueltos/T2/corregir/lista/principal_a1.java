package U4_poo.ejercicios.T2.corregir.lista;

// Las listas son estructuras dinámicas de datos, donde se pueden
// insertar o eliminar elementos de un determinado tipo sin
// limitación de espacio. Implementar la clase Lista correspondiente
// a una lista de números de la clase Integer.
// Los números se guardarán en una tabla. Cuando falte espacio para un
// nuevo elemento, la tabla se redimensionará, incrementando la
// capacidad de la lista. Entre los métodos de la clase se incluirán:
//
//    - Dos constructores, uno por defecto que cree la tabla con
//      capacidad para 10 números, y otro al que se le pasa como
//      argumento el tamaño inicial de la tabla.
//    - Obtener el número de elementos insertados en la lista.
//    - Insertar un número al final de la lista.
//    - Insertar un número al principio de la lista.
//    - Insertar un número en un lugar de la lista cuyo índice se pasa
//      como parámetro.
//    - Añadir al final de la lista los elementos de otra lista que se
//      pasa como parámetro.
//    - Eliminar un elemento cuyo índice en la lista se pasa como
//      parámetro.
//    - Obtener el elemento cuyo índice se pasa como parámetro.
//    - Buscar un número en la lista, devolviendo el índice del primer
//      lugar donde se encuentre. Si no está, devolver -1.
//    - Representar la lista con una cadena de caracteres.

public class principal_a1 {
  public static void main(String[] args) {
    //
    Lista l = new Lista();
    l.insertarNumeroFinal(3);
    l.insertarNumeroFinal(7);
    l.insertarNumeroFinal(5);
    l.insertarNumeroFinal(4);
    l.insertarNumeroInicio(2);
    l.insertarNumeroPosicion(2, 9);
    Integer[] lista2 = {8, 1, 6, 5, 2, 4};
    l.insertarListaFinal(lista2);
    l.eliminarNumero(2);
    System.out.println(l.obtenerNumero(2));
    System.out.println(l.buscarNumero(7));
    l.mostrarLista();
  }
}
