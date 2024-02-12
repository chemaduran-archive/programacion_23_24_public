package U5_herencia_interfaces.teoria.interfaces.comparable_y_comparator;

import java.util.Comparator;

public class comparaPersonasEstatura implements Comparator<Persona> {
  @Override
  public int compare(Persona persona1, Persona persona2) {

    if (persona1.getEstatura() < persona2.getEstatura()) {
      return -1;
    } else if (persona1.getEstatura() > persona2.getEstatura()) {
      return 1;
    }
    return 0;
  }
}
