package U1_intro_bucles_condicionales.ejercicios.entregable1920;

// Calcula la nota de un trimestre de la asignatura Programación. El programa pedirá las tres notas
// que ha sacado el alumno en los tres primeros controles.
// Si la media de los dos controles da un número mayor o igual a 5, el alumno está aprobado y se
// mostrará la media y la nota correspondiente. Atendiendo a esa media el alumno tendrá las
// siguientes notas:
//
//    Suficiente si la media en mayor o igual que 5 y menor que 6.
//    Bien si la media es mayor o igual que 6 y menor que 7.
//    Notable si la media es mayor o igual que 7 y menor que 9.
//    Sobresaliente en cualquier otro caso.
//
// En caso de que la media sea un número menor que 5, el alumno habrá tenido que hacer el examen de
// recuperación que se califica como apto o no apto, por tanto se debe preguntar al usuario ¿Cuál
// ha sido el resultado de la recuperación? (apto/no apto). Si el resultado de la recuperación es
// apto, la nota será un 5; en caso contrario, se mantiene la nota media anterior.

import java.util.Scanner;

public class ej1 {
  public static void main(String[] args) {
    //
    Scanner sc = new Scanner(System.in);
    System.out.println("Nota del primer control:");
    int nota1 = sc.nextInt();
    sc.nextLine();
    System.out.println("Nota del segundo control:");
    int nota2 = sc.nextInt();
    sc.nextLine();

    double media = (nota1 + nota2) / (double) 2;

    if (media < 5) {
      System.out.println("¿Cuál ha sido el resultado de la recuperación? (apto/no apto):");
      String recuperacion = sc.nextLine();
      if (recuperacion.equals("apto")) {
        media = 5;
      }
    }

    String nota = "";
    if (media < 5) {
      nota = "Suspenso";
    } else if (media >= 5 && media < 6) {
      nota = "Suficiente";
    } else if (media >= 6 && media < 7) {
      nota = "Bien";
    } else if (media >= 7 && media < 9) {
      nota = "Notable";
    } else if (media >= 9 && media <= 10) {
      nota = "Sobresaliente";
    }

    System.out.println("Tu nota de Programación es " + media + " - " + nota);
  }
}
