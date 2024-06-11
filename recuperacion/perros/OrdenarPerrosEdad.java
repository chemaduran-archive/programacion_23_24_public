package U7_collections.corregir.perros;

import java.util.Comparator;

public class OrdenarPerrosEdad implements Comparator<Perros> {
  public int compare(Perros p1, Perros p2) {
    if (p1.getEdad() > p2.getEdad()) {
      return 1;
    } else if (p1.getEdad() < p2.getEdad()) {
      return -1;
    } else {
      return 0;
    }
  }
}
