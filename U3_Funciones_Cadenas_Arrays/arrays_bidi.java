package U3_strings_arrays_funciones.teoria;

import java.util.Arrays;
import java.util.Scanner;

public class arrays_bidi {
  public static void main(String[] args) {
    // Si nos hacen falta más dimensiones, podemos declarar arrays bidimensionales o de más.
    int[][] bidi = new int[2][2];
    bidi[0][0] = 5;
    bidi[0][1] = 1;
    bidi[1][0] = -2;
    bidi[1][1] = 3;

    // Y así recorremos un array de dos dimensiones
    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 2; j++) {
        System.out.println("El dato " + i + "," + j + " vale " + bidi[i][j]);
      }
    }

    // También podemos inicializar un array bidimensional de forma directa, pasándole los valores.
    int[][] array_f_bidi = {{4, 4}, {4, 4}, {4, 4}};
    funcion_bidi(array_f_bidi);
    System.out.println("El array BIDI después de la función");
    for (int i = 0; i < array_f_bidi.length; i++) {
      for (int j = 0; j < array_f_bidi[i].length; j++) {
        System.out.print(array_f_bidi[i][j] + ", ");
      }
    }
    System.out.println();

    // Para el caso de un "for each"
    for (int[] array : array_f_bidi) {
      for (int elemento : array) {
        System.out.print(elemento + ", ");
      }
    }
    System.out.println();

    // Tenemos también otro método para imprimir un array bidimensional, equivalente
    // a la función Arrays.toString()
    int[][] a = {{3, 2}, {6, 5}, {2, 7}, {7, 8}, {1, 2}, {8, 0}};
    final int MAX_TAMANYO = 10;

    System.out.println(Arrays.deepToString(a));
  } // main

  // Función que recibe un array bidimensional y lo modifica sumando 1 a cada elemento
  public static void funcion_bidi(int[][] arr) {
    System.out.println("El array BIDI EN la función: ");
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        arr[i][j] = arr[i][j] + 1;
        System.out.print(arr[i][j] + ", ");
      }
    }
    System.out.println();
  }
}