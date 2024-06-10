package URecuperacion.ejercicios_practicar.esports;

import java.util.Comparator;

public class OrdenarNombre implements Comparator<Equipo> {
  @Override
  public int compare(Equipo o1, Equipo o2) {
    return o1.getNombre().compareTo(o2.getNombre());
  }
}
