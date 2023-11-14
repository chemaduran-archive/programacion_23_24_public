package U3_strings_arrays_funciones.teoria;

import java.util.Arrays;

public class copy_of {
  public static void main(String[] args) {
    //
    int[] resultado = new int[0];
    System.out.println(Arrays.toString(resultado));
    resultado = Arrays.copyOf(resultado, resultado.length + 1);
    resultado[0] = 2;
    System.out.println(Arrays.toString(resultado));
    resultado = Arrays.copyOf(resultado, resultado.length + 10);
    resultado[1] = 7;
    System.out.println(Arrays.toString(resultado));
  }
}