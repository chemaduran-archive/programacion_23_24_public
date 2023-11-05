package U1_intro_bucles_condicionales.ejercicios.entregable2122tarde;

import java.util.Scanner;

// Realiza un programa que solicite al usuario un número entero positivo con una cantidad de 6
// cifras exactamente. Si el número no tiene esa cantidad de cifras, se vuelve a pedir el número
// hasta que sea de 6 cifras.
//
// Una vez tengamos el número se deberá comprobar si el número compuesto por las tres primeras
// cifras es primo. Lo mismo para el número compuesto por las tres últimas cifras. Se deberá mostrar
// un mensaje por pantalla tanto si es primo como si no lo es. Si al partir el número, se comienza
// en 0, se considera que el número es el entero que se obtendría. Abajo se muestra un ejemplo del
// mismo.
//
// Ejemplo1:
//
// Introduce un número de 6 cifras: 1213
// Introduce un número de 6 cifras: 379004
// 379 es un número primo
// 4 NO es un número primo
// Ejemplo2:
//
// Introduce un número: 127127
// 127 - Es un número primo
// 127 - Es un número primo.
// Nota: No se pueden utilizar funciones de cadena.
public class ej4 {
  public static void main(String[] args) {
    //
    Scanner sc = new Scanner(System.in);
    long n = 0;
    long inicio = 0;
    long fin = 0;
    int contador = 0;

    do {
      System.out.println("Introduce un número de 6 cifras: ");
      n = sc.nextLong();

      long invertido = 0;
      contador = 0;
      long cociente = n;

      // Contamos el número de cifrass
      while (cociente != 0) {
        invertido = invertido * 10 + n % 10;
        cociente = cociente / 10;
        contador++;
      }

      // Comprobamos si tiene 6 cifras
    } while (contador != 6);

    // Dividimos en dos partes
    inicio = n / 1000;
    fin = n % 1000;

    System.out.println("Los números son " + inicio + " y " + fin);

    // Comprobamos que la primera mitad es primo
    boolean es_primo_inicio = true;
    for (int i = 2; i < inicio; i++) {
      if (inicio % i == 0) {
        es_primo_inicio = false;
        break;
      }
    }

    // Comprobamos que la segunda mitad es primo
    boolean es_primo_fin = true;
    for (int i = 2; i < fin; i++) {
      if (fin % i == 0) {
        es_primo_fin = false;
        break;
      }
    }

    if (es_primo_inicio) System.out.println("El número " + inicio + " es primo");
    else System.out.println("El número " + inicio + " NO es primo");

    if (es_primo_fin) System.out.println("El número " + fin + " es primo");
    else System.out.println("El número " + fin + " NO es primo");
  }
}
