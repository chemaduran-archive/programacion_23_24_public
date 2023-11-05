package U1_intro_bucles_condicionales.ejercicios.entregable2122tarde;

import java.util.Scanner;

// Dibuja por pantalla la palabra MY (en mayúsculas) hechas de asteriscos separadas por 4 espacios.
// La anchura y altura de cada una de las letras deberá ser la misma. Se solicitará al usuario una
// altura que deberá siempre impar y mayor que 3. En caso de que el usuario no introduzca un valor
// correcto, se pedirá de nuevo la altura.
//
// Ejemplo 1:
//
// Introduzca una altura: 5
//
// *   *    *   *
// ** **     * *
// * * *      *
// *   *      *
// *   *      *
// Ejemplo 2:
//
// Introduzca una altura: 7
//
// *     *    *     *
// **   **     *   *
// * * * *      * *
// *  *  *       *
// *     *       *
// *     *       *
// *     *       *
public class ej1 {
  public static void main(String[] args) {
    //
    Scanner sc = new Scanner(System.in);
    int altura;
    final int espacios = 4; // establecemos el espaciado entre letras

    // Pediremos una altura, y comprobamos que efectivamente es MAYOR
    // que 3 e impar.
    do {
      System.out.print("Introduzca una altura (impar y mayor que 3): ");
      altura = sc.nextInt();
    } while (altura < 3 && altura % 2 == 0);

    for (int i = 1; i <= altura; i++) {
      for (int j = 1; j <= altura * 2 + espacios; j++) {
        if (j == 1
            || j == altura
            || (i == j && i <= altura / 2 + 1)
            || (i + j == altura + 1 && i <= j)
            || (j == i + espacios + altura && i <= altura / 2 + 1)
            || (j == altura * 2 + 1 - i + espacios && i + espacios + altura <= j)
            || (j == altura / 2 + 1 + espacios + altura && i > altura / 2 + 1)) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
