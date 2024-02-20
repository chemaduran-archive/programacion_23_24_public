package corregir.U4U5_ENTREGABLE.correcion_clase;

import java.util.Comparator;

public class OrdenarParticipantesEdad implements Comparator<Participante> {

  @Override
  public int compare(Participante o1, Participante o2) {
    if (o1.edad < o2.edad) {
      return -1;
    } else if (o1.edad > o2.edad) {
      return 1;
    } else {
      return 0;
    }
  }
}
