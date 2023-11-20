package U1_intro_bucles_condicionales.ejercicios.entregable1920;

import java.util.Scanner;

public class ej3_bis {
  public static void main(String[] args) {
    System.out.print("Introduzca el numero entero positivo: ");
    Scanner teclado = new Scanner(System.in);
    long n = teclado.nextInt();

    long digito;
    double binario = 0;
    long exp = 0;

    while (n != 0) {
      digito = n % 2;
      // Math.pow devuelve la base elevada al exponente. Math.pow(base, exponente)
      binario = binario + digito * Math.pow(10, exp);
      exp++;
      n = n / 2;
      System.out.println("binario = " + binario + " digito = " + digito + " n = " + n);
    }
    System.out.println(n + " en binario es " + (long) binario);
  }
}