package corregir.U3_EXAMEN.CORRECCION;

// Crea una función llamada palabraAhorcado que reciba como parámetros dos cadenas (la cadena a
// adivinar y el resultado
// parcial) y un carácter a buscar en la cadena a adivinar. Debe devolver el resultado de encontrar
// ese character en la
// cadena a adivinar.
//
// **Ejemplo:**
//
//    palabraAhorcado("programacion","------------",'o') debe devolver "--o-------o-"
//    palabraAhorcado("programacion","--o-------on",'a') debe devolver "--o--a-a--o-"
//    palabraAhorcado("hola","----",'x') debe devolver "----"

import java.sql.SQLOutput;
import java.util.Scanner;

public class ej1 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduzca la palabra a adivinar");
    String original = teclado.next();

    String parcial = "";

    for (int i = 0; i < original.length(); i++) {
      parcial = parcial + "-";
    }
    while (!original.equals(parcial)) {
      System.out.println("Introduce una letra");
      char letra = teclado.next().charAt(0);

      parcial = palabraAhorcado(original, parcial, letra);

      System.out.println(parcial);
    }
  }

  public static String palabraAhorcado(String original, String parcial, char c) {

    String resultado = "";
    for (int i = 0; i < original.length(); i++) {
      if (original.charAt(i) == c) {
        resultado = resultado + c;

      } else {
        resultado = resultado + parcial.charAt(i);
      }
    }
    return resultado;
  }
}
