package U4_poo.ejercicios.T1.A10;

import java.util.Scanner;

// Escribir un programa que lea por teclado una hora cualquiera y un número n que representa una
// cantidad de segundos. El programa mostrará la hora introducida y la hora resultante de sumar a
// esa hora, la cantidad de segundos indicada. Para ello hemos de diseñar previamente la clase Hora
// que dispone de los atributos hora, minuto y segundo. Los valores de los atributos se controlarán
// mediante métodos set/get.
public class main_a10 {
  public static void main(String[] args) {
    //
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduza la hora:");
    int hora = sc.nextInt();
    System.out.println("Introduza los minutos:");
    int minutos = sc.nextInt();
    System.out.println("Introduza los segundos:");
    int segundos = sc.nextInt();
    System.out.println("Introduza la cantidad de segundos:");
    int n = sc.nextInt();

    Hora h = new Hora(hora, minutos, segundos);
    System.out.println(h.toString());
    h.sumar_segundos(n);
    System.out.println(h.toString());
  }
}
