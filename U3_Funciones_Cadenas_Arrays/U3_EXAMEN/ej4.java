package corregir.U3_EXAMEN.CORRECCION;

import java.util.Arrays;

// Desarrollar una función que se denomine insertarFilaEnMatriz. Dicha función tendrá el siguiente
// prototipo:
//
// public static Strings[] insertarEnVector(Strings[][] matriz, Strings [] fila, int pos)
//
// Recibirá como parámetro un vector bidimensional de Strings, un array unidimensional de Strings y
// una posición.
// Devolverá como resultado un vector bidimensional en el que esté insertado como una nueva fila en
// la matriz el array en la posición que se indica.
//
// NOTA: Las filas de la matriz deben tener el mismo número de elementos. No es necesario
// comprobarlo, como tampoco es necesario comprobar que la posición pasada es válida, se entenderá
// que el usuario pasa una posición válida.
//
// **Ejemplo1:**
//
//    matriz = {
//          {"a","b","c"},
//          {"d","e","f"},
//          {"g","h","i"}
//        }
//    fila = {"j","k","l"}
//    pos = 1
//
// El resultado de insertarFilaEnMatriz será:
//
//    {
//    {"a","b","c"},
//    {"j","k","l"},
//    {"d","e","f"},
//    {"g","h","i"}
//    }
public class ej4 {
  public static void main(String[] args) {
    //
    String[][] matriz = {
      {"a", "b", "c"},
      {"d", "e", "f"},
      {"g", "h", "i"}
    };
    String[] fila = {"j", "k", "l"};
    int pos = 1;

    mostrarMatriz(matriz);

    System.out.println();

    String[][] resultado = insertarFilaEnMatriz(matriz, fila, pos);

    // mostrar matriz
    mostrarMatriz(resultado);
  }

  public static String[][] insertarFilaEnMatriz(String[][] matriz, String[] fila, int pos) {

    String[][] resultado = new String[matriz.length + 1][matriz[0].length];
    int j = 0;
    for (int i = 0; i < resultado.length; i++) {
      if (i == pos) {
        resultado[i] = fila;
      } else {
        resultado[i] = matriz[j];
        j++;
      }
    }
    return resultado;
  }

  public static void mostrarMatriz(String[][] matriz) {
    for (String[] strings : matriz) {
      System.out.println(Arrays.toString(strings));
    }
  }
}
