package resolucion.U1_ENTREGABLE_2324;

public class ej2 {
  public static void main(String[] args) {
    // Para desarrollar, introduzco el número directamente.
    int n = 3456759;
    int cifra = 5;
    int ocurrencias = 0;
    int posicion = 1;
    int invertido = 0;
    System.out.print("Posiciones: ");

    // Invierto el número para empezar a contar desde la izquierda
    while (n > 0) {
      int resto = n % 10;
      invertido = invertido * 10 + resto;
      n /= 10;
    }

    // Ahora machaco el número original con el número invertido
    n = invertido;

    System.out.print("Posiciones: ");
    while (n > 0) {
      // Voy contando las ocurrencias de las cifras que coinciden con
      // la que tengo...
      if (n % 10 == cifra) {
        ocurrencias++;
        // ... y las imprimo
        System.out.print(posicion + " ");
      }
      n /= 10; // Avanzo a la siguiente cifra
      posicion++;
    }

    System.out.println();
    System.out.println("Hay " + ocurrencias + " ocurrencias de la cifra");
  }
}
