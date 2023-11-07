package U3_strings_arrays_funciones.teoria;

import java.util.Locale;

public class teoria_strings {
  public static void main(String[] args) {
    String s1 = "abcdefc";
    String s2 = s1 + "ghij"; // s2 contiene "abcdefcghij"
    String s3 = s1 + s2 + "klm"; // s3 contiene "abcdefcabcdefcghijklm"

    // length() - Devuelve la longitud de la cadena
    System.out.println("La longitud de la cadena s1 es: " + s1.length());

    // indexOf(‘caracter’) - Devuelve la posición de la primera
    // aparición de carácter dentro del String. Devuelve -1 si no lo
    // encuentra.
    System.out.println("La posición del caracter c es: " + s1.indexOf("c"));

    // indexOf(‘caracter’)
    System.out.println("La posición del caracter z es: " + s1.indexOf("z"));

    //    String s1 = "abcdefc"
    // lastIndexOf(‘caracter’) - Devuelve la posición de la última
    // aparición de carácter dentro del String. Devuelve -1 si no lo
    // encuentra.
    System.out.println("La posición del caracter z es: " + s1.lastIndexOf("c"));

    // charAt(n) - Devuelve el carácter que está en la posición n
    System.out.println("La posición el caracter que está en 2 es: " + s1.charAt(2));

    // System.out.println(s1.charAt(97));

    // String s1 = "abcdefc";
    // substring(n1,n2) - Devuelve la subcadena desde la posición n1
    // hasta n2 - 1
    System.out.println("La subcadena de 2 a 3 es: " + s1.substring(2, 4));

    //  toUpperCase() -  Devuelve la cadena convertida a mayúsculas
    System.out.println("En mayúsculas: " + s1.toUpperCase());

    //  toLowerCase() - Devuelve la cadena convertida a minúsculas
    System.out.println("En minúsculas: " + s1.toLowerCase());

    // equals(otroString) - Compara dos cadenas y devuelve true si son iguales
    System.out.println("Es igual a sí misma: " + s1.equals("abcdefc"));

    // equalsIgnoreCase(otroString) - Igual que equals pero sin
    // considerar mayúsculas y minúsculas
    String dia = "MaRtEs";
    switch (dia.toLowerCase()) {
      case "lunes":
        System.out.println("Es lunes");
        break;
      case "martes":
        System.out.println("Es martes");
        break;
    }

    // compareTo(OtroString) - Devuelve 0 si las dos cadenas son
    // iguales. <0 si la primera es alfabéticamente menor que la
    // segunda o >0 si la primera es alfabéticamente mayor que la
    // segunda.
    // String s1 = "abcdefc";
    String cadena1 = "AA";
    String cadena2 = "A";
    System.out.println(cadena1.compareTo(cadena2));

    System.out.println();

    //    for (int i = 0; i < cadena1.length(); i++) {
    //      String caracter_cad1 = String.valueOf(cadena1.charAt(i));
    //      String caracter_cad2 = String.valueOf(cadena2.charAt(i));
    //      System.out.println(caracter_cad1.compareTo(caracter_cad2));
    //    }

    System.out.println();

    System.out.println("Es mayor a hola: " + s1.compareTo("hola"));
    System.out.println("Es menor a aabc: " + s1.compareTo("aabc"));
    System.out.println("Es igual a si misma: " + s1.compareTo("abcdefc"));

    // compareToIgnoreCase(OtroString) - Igual que compareTo pero sin
    // considerar mayúsculas y minúsculas.

    // valueOf(N) - Convierte el valor N a String. N puede ser de
    // cualquier tipo.
    System.out.println("Convertimos a String un numero: " + s1.valueOf(1.7));
  }
}
