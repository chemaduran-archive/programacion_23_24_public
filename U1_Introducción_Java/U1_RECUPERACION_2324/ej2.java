package U1_intro_bucles_condicionales.ejercicios.entregable1920;

import java.util.Scanner;

// Escribe un programa que diga si un número introducido por teclado es o no capicúa. Los números
// capicúa se leen igual hacia delante y hacia atrás. El programa debe aceptar números de cualquier
// longitud siempre que lo permita el tipo, en caso contrario el ejercicio no se dará por bueno. Se
// recomienda usar long en lugar de int ya que el primero admite números más largos.
public class ej2 {
  public static void main(String[] args) {
    //
    Scanner sc = new Scanner(System.in);
    System.out.println("Por favor, introduzca un número entero positivo:");
    long num = sc.nextLong();

    long resto = 0;
    while (num != 0) {
      resto = resto * 10 + (num % 10);
      num = (num / 10);
      System.out.println("resto=" + resto);
    }

    if (num == resto) {
      System.out.println("El número es capicúa");
    } else {
      System.out.println("El número NO es capicúa");
    }
  }
}
