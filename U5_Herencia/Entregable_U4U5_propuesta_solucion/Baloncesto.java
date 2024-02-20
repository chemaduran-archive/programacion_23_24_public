package corregir.U4U5_ENTREGABLE.correcion_clase;

import java.util.Arrays;

public class Baloncesto extends Deporte {
  private int num_equipo;
  private Baloncestista[] lista_baloncestistas;

  public Baloncesto(String nombre, String pabellon) {
    super(nombre, pabellon);
  }

  public void mostrarJugadoresBaloncesPorAltura() {
    Arrays.sort(lista_baloncestistas, new BaloncestistasPorAltura());
  }
}
