package U1_intro_bucles_condicionales.ejercicios.entregable2122tarde;

import java.util.Scanner;

// Escribe un programa que solicite al usuario los siguientes números:
//
// Un número entero positivo
// Un número entre 0 y 2 (ambos inclusive)
// Una vez introducidos los dos números nos debe construir un número saltando las cifras según
// indique el segundo número.
//
// Ejemplo 1:
//
// Introduzca un número: 3456759
// Introduzca el salto: 1
// Resultado: 3579
//
// Ejemplo 2:
//
// Introduzca un número: 3456759
// Introduzca el salto: 2
// Resultado: 369
public class ej2 {
  public static void main(String[] args) {
    //
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduzca un número: ");
    long num_final = sc.nextLong();
    int salto = 0;

    do {
      System.out.println("Introduzca el salto: ");
      salto = sc.nextInt();
    } while (salto < 0 || salto > 2);

    long cociente = num_final;
    long invertido = 0;

    // Primeramente invertimos el número
    while (cociente != 0) {
      invertido = invertido * 10 + cociente % 10;
      cociente = cociente / 10;
    }

    num_final = 0;
    int contador = 0;

    // Luego, vamos a ir sacando las cifras por el final,
    // ...y dando saltos según corresponda.
    while (invertido != 0) {
      if (contador == 0) {
        num_final = num_final * 10 + invertido % 10;
        contador = salto;
      } else {
        contador--;
      }
      invertido = invertido / 10;
    }

    System.out.println("Resultado = " + num_final);
  }
}
