package U5_herencia_interfaces.teoria.interfaces.comparable_y_comparator;

import java.util.Arrays;
import java.util.Comparator;

public class main_comparable {
  public static void main(String[] args) {
    Persona[] array = new Persona[4];
    Persona p1 = new Persona("Juan", 23, 172.0);
    Persona p2 = new Persona("Carmen", 45, 122.0);
    Persona p3 = new Persona("Manuela", 23, 138.0);
    Persona p4 = new Persona("Esteban", 16, 190.0);

    array[0] = p1;
    array[1] = p2;
    array[2] = p3;
    array[3] = p4;

    imprimir(array);
    // En esta llamada, estaría ordenando por el criterio por defecto
    // (el único) que tengo implementado en la clase Persona, mediante
    // la interfaz Comparable, y que me "genera" el método compareTo.
    Arrays.sort(array);
    imprimir(array);
    // Si quiero otro criterio de ordenación, puedo pasarle el que
    // hemos creado en el fichero comparaPersonasEstatura
    Arrays.sort(array, new comparaPersonasEstatura());
    imprimir(array);

    // Puedo, igualmente, en vez de pasar una clase entera desde
    // fichero, pasarla mediante una clase anónima, y así no saturar
    // de ficheros de código el proyecto entero.
    Arrays.sort(
        array,
        new Comparator<Persona>() {
          @Override
          public int compare(Persona persona1, Persona persona2) {
            if (persona1.getEstatura() < persona2.getEstatura()) {
              return -1;
            } else if (persona1.getEstatura() > persona2.getEstatura()) {
              return 1;
            }

            return 0;
          }
        });
  }

  public static void imprimir(Persona[] array) {
    for (Persona p : array) {
      System.out.println(p);
    }
    System.out.println("------------------");
  }
}
