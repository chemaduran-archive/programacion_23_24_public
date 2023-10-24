package resolucion.U1_ENTREGABLE_2324;

import java.util.Scanner;

public class ej4 {
  public static void main(String[] args) {
    //    Scanner sc = new Scanner(System.in);

    //    int numero_cifras = 0;
    int n = 1213;
    int numero_cifras = 4;
    //    do {
    //      System.out.println("Introduzca un número con una cantidad de cifras par: ");
    //      n = sc.nextInt();
    //
    //      numero_cifras = 0;
    //      while (n > 0) {
    //        n /= 10;
    //        numero_cifras++;
    //      }
    //      System.out.println("Número de cifras: " + numero_cifras);
    //      // Ya sé el número de cifras
    //    } while (numero_cifras <= 0 || numero_cifras % 2 != 0);

    int mitad1 = n / (int) Math.pow(10, numero_cifras / 2);
    int mitad2 = n % (int) Math.pow(10, numero_cifras / 2);

    System.out.println("Primera mitad: " + mitad1);
    System.out.println("Segunda mitad: " + mitad2);

    // Nos queda comprobar si es primo o no cada una de las mitades
    boolean es_primo = true;
    for (int i = 2; i < mitad1; i++) {
      if (mitad1 % i == 0) {
        es_primo = false;
        break;
      }
    }

    if (es_primo) {
      System.out.println("El número " + mitad1 + " es primo");
    } else {
      System.out.println("El número " + mitad1 + " NO es primo");
    }

    // Compruebo la otra mitad
    es_primo = true;
    for (int i = 2; i < mitad2; i++) {
      if (mitad2 % i == 0) {
        es_primo = false;
        break;
      }
    }

    if (es_primo) {
      System.out.println("El número " + mitad2 + " es primo");
    } else {
      System.out.println("El número " + mitad2 + "NO es primo");
    }
  }
}
