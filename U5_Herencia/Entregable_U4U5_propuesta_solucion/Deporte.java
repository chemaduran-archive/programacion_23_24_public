package corregir.U4U5_ENTREGABLE.correcion_clase;

import java.util.Arrays;

public abstract class Deporte {
  protected Participante[] lista_participantes;
  private String nombre;
  private String pabellon;
  private int indice_participante = 0;

  public Deporte(String nombre, String pabellon) {
    this.nombre = nombre;
    this.pabellon = pabellon;
    lista_participantes = new Participante[0];
  }

  public void AniadirParticipante(Participante participante) {
    if (indice_participante == lista_participantes.length) {
      lista_participantes = Arrays.copyOf(lista_participantes, lista_participantes.length + 1);
    }

    lista_participantes[indice_participante] = participante;
    indice_participante++;
  }

  public void EliminarParticipante(Participante participante) {
    Participante[] copia = new Participante[lista_participantes.length - 1];
    int copia_indice = 0;
    for (int i = 0; i < lista_participantes.length; i++) {
      if (!lista_participantes[i].equals(participante)) {
        copia[copia_indice] = lista_participantes[i];
        copia_indice++;
      }
    }
    lista_participantes = copia;
  }

  public void mostrarParticipantes() {
    Arrays.sort(lista_participantes, new OrdenarParticipantesEdad());
    for (Participante i : lista_participantes) {
      System.out.println(i);
    }
  }
}
