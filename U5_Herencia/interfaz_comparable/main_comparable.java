package U5_herencia_interfaces.teoria.interfaces.comparable;

import java.util.Arrays;

public class main_comparable {
  public static void main(String[] args) {
    Persona[] array = new Persona[3];
    Persona p1 = new Persona("Pepe", 12, 188);
    Persona p2 = new Persona("Juan", 78, 167);
    Persona p3 = new Persona("Maria", 23, 170);

    array[0] = p1;
    array[1] = p2;
    array[2] = p3;

    imprimir(array);
    Arrays.sort(array);
    imprimir(array);
  }

  public static void imprimir(Persona[] array) {
    for (Persona persona : array) {
      System.out.println(persona);
    }
    System.out.println("-----------------");
  }
}
