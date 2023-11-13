package U3_strings_arrays_funciones.teoria;

public class clases_wrapper {
  public static void main(String[] args) {
    // Constructor a partir de un int
    Integer n1 = 20;

    // Devuelve el valor equivalente
    Integer n2 = 30;
    int x = n2.intValue();
    double y = n2.doubleValue();

    // Método estático que devuelve un int a partir de un String.
    String s2 = "123456";
    int z = Integer.parseInt(s2);

    // Métodos estáticos que devuelven un String con la representación binaria, octal o hexadecimal
    // del número.
    int numero = 12;
    String binario = Integer.toBinaryString(numero);

    // Método Estático. Devuelve un Integer a partir de un String.
    Integer m = Integer.valueOf("123");
  }
}
