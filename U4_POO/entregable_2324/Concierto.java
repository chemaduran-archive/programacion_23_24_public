package U4_poo.entregable_2324;

import java.util.Arrays;

public class Concierto {
  private static String nombre_oganizador = "Pelkito producciones";
  private String nombre_concierto;
  private String fecha_concierto;
  private Escenario lista_escenario[];

  public static String getNombre_oganizador() {
    return nombre_oganizador;
  }

  public static void setNombre_oganizador(String nombre_oganizador) {
    Concierto.nombre_oganizador = nombre_oganizador;
  }

  public String getNombre_concierto() {
    return nombre_concierto;
  }

  public void setNombre_concierto(String nombre_concierto) {
    this.nombre_concierto = nombre_concierto;
  }

  public String getFecha_concierto() {
    return fecha_concierto;
  }

  public void setFecha_concierto(String fecha_concierto) {
    this.fecha_concierto = fecha_concierto;
  }

  public Escenario[] getLista_escenario() {
    return lista_escenario;
  }

  public void setLista_escenario(Escenario[] lista_escenario) {
    this.lista_escenario = lista_escenario;
  }

  @Override
  public String toString() {
    return "Concierto{"
        + "nombre_concierto='"
        + nombre_concierto
        + '\''
        + ", fecha_concierto='"
        + fecha_concierto
        + '\''
        + ", lista_escenario="
        + Arrays.toString(lista_escenario)
        + '}';
  }
}
