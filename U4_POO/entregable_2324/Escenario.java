package U4_poo.entregable_2324;

import java.util.Arrays;

public class Escenario {
  private String nombre_escenario;

  private String ubicacion_escenario;

  private int capacidad_escenario;

  private Cantante lista_cantantes[];

  public String getNombre_escenario() {
    return nombre_escenario;
  }

  public void setNombre_escenario(String nombre_escenario) {
    this.nombre_escenario = nombre_escenario;
  }

  public String getUbicacion_escenario() {
    return ubicacion_escenario;
  }

  public void setUbicacion_escenario(String ubicacion_escenario) {
    this.ubicacion_escenario = ubicacion_escenario;
  }

  public int getCapacidad_escenario() {
    return capacidad_escenario;
  }

  public void setCapacidad_escenario(int capacidad_escenario) {
    this.capacidad_escenario = capacidad_escenario;
  }

  public Cantante[] getLista_cantantes() {
    return lista_cantantes;
  }

  public void setLista_cantantes(Cantante[] lista_cantantes) {
    this.lista_cantantes = lista_cantantes;
  }

  @Override
  public String toString() {
    return "Escenario{"
        + "nombre_escenario='"
        + nombre_escenario
        + '\''
        + ", ubicacion_escenario='"
        + ubicacion_escenario
        + '\''
        + ", capacidad_escenario="
        + capacidad_escenario
        + ", lista_cantantes="
        + Arrays.toString(lista_cantantes)
        + '}';
  }
}
