package U7_collections.corregir.perros;

import java.util.Comparator;

public class OrdenarPerrosPeso implements Comparator<Perros> {
  @Override
  public int compare(Perros p1, Perros p2) {
    if (p1.getPeso() < p2.getPeso()) {
      return 1;
    } else if (p1.getPeso() > p2.getPeso()) {
      return -1;
    } else {
      return 0;
    }
  }
}
