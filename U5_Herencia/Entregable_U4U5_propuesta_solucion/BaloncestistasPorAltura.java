package corregir.U4U5_ENTREGABLE.correcion_clase;

import java.util.Comparator;

public class BaloncestistasPorAltura implements Comparator<Baloncestista> {
  @Override
  public int compare(Baloncestista o1, Baloncestista o2) {
    if (o1.getAltura() > o2.getAltura()) {
      return 1;
    } else if (o1.getAltura() < o2.getAltura()) {
      return -1;
    } else {
      return 0;
    }
  }
}
