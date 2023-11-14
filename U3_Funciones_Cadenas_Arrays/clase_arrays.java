package U3_strings_arrays_funciones.teoria;

import java.util.Arrays;

public class clase_arrays {
  public static void main(String[] args) {
    // La clase Arrays provee una serie de métodos para trabajar con arrays.

    // Declaramos y definimos un array con 6 elementos de tipo double
    double[] a = {10, 23.5, 15, 7, 8.9};
    double[] b = {10, 23.5, 15, 7, 8.9};

    // Imprimimos el array
    System.out.println("Array a: " + Arrays.toString(a));

    // Inicializamos el array a
    Arrays.fill(a, 123);
    System.out.println("Array con 123: " + Arrays.toString(a));
    Arrays.fill(a, 2, 4, 7);
    System.out.println("Array con 7 pero en rango: " + Arrays.toString(a));

    // Para comparar dos arrays es necesario usar el método equals
    a[0] = 10;
    a[1] = 23.5;
    a[2] = 15;
    a[3] = 7;
    a[4] = 8.9;
    System.out.println(a == b); // no vale
    System.out.println(Arrays.equals(a, b)); // vale

    // Para ordenar un array es necesario usar el método sort
    Arrays.sort(a);
    System.out.println("Array ORDENADDO a: " + Arrays.toString(a));

    // Para copiar un array en otro es necesario usar el método copyOf
    double[] c = Arrays.copyOf(a, a.length);
    System.out.println("Array copiado en c: " + Arrays.toString(c));

    // Por lo tanto, podemos aumentar el tamaño de un array mediante el método copyOf
    int[] resultado = new int[0];
    resultado = Arrays.copyOf(resultado, resultado.length + 1);

    // Para copiar un array en otro es necesario usar el método copyOfRange para rangos
    double[] d = Arrays.copyOfRange(a, 1, 3);
    System.out.println("Array copiado en d (un rango): " + Arrays.toString(d));

    // Para buscar un elemento en un array es necesario usar el método binarySearch
    int pos = Arrays.binarySearch(a, 15);
    System.out.println(pos);
    if (pos < 0) {
      System.out.println("El elemento no está en el array");
    } else {
      System.out.println("El elemento está en la posición " + pos);
    }

    // Para definir un array bidimensional es necesario usar la palabra reservada new
    int[][] matriz = new int[3][3];

    // Y de esta manera accedemos a un elemento de la matriz
    matriz[0][0] = 1;

    // Para rellenar un array bidimensional con un valor es necesario usar el método fill
    Arrays.fill(matriz[0], 1);
    Arrays.fill(matriz[1], 2);
    Arrays.fill(matriz[2], 3);

    // Podemos instanciar un array bidimensional con una matriz
    int[][] matriz2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    // Para imprimir un array bidimensional es necesario usar el método deepToString
    System.out.println(Arrays.deepToString(matriz));

    // Otra manera de imprimir un array bidimensional es usando un bucle for
    for (int i = 0; i < matriz2.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        System.out.print(matriz[i][j] + " ");
      }
      System.out.println();
    }
  }
}