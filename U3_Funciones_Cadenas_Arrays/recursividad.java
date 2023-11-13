package U3_strings_arrays_funciones.teoria;

public class recursividad {
  public static void main(String[] args) {
    // Intentamos resolver un problema en función de sí mismo, pero más pequeño
    System.out.println(fibonacci(7));
  }

  public static int fibonacci(int n) {
    if (n == 1 || n == 2) {
      return 1;
    } else {
      return fibonacci(n - 1) + fibonacci(n - 2);
    }
  }
}