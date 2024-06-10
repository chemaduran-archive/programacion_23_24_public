package URecuperacion.ejercicios_practicar.esports;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Equipo {
  private static int contador = 0;
  private String nombre;
  private int id;
  private List<Jugadores> lista_jugadores;
  private List<Estadisticas> lista_estadistica;

  public Equipo(String nombre) {
    this.nombre = nombre;
    this.id = contador++;
    this.lista_jugadores = new ArrayList<>();
    this.lista_estadistica = new ArrayList<>();
  }

  public void add_jugador(Jugadores jugador) {
    lista_jugadores.add(jugador);
  }

  public void add_estadistica(Estadisticas estadistica) {
    lista_estadistica.add(estadistica);
  }

  public List<Estadisticas> getLista_estadistica() {
    return lista_estadistica;
  }

  public void setLista_estadistica(List<Estadisticas> lista_estadistica) {
    this.lista_estadistica = lista_estadistica;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public List<Jugadores> getLista_jugadores() {
    return lista_jugadores;
  }

  public void setLista_jugadores(List<Jugadores> lista_jugadores) {
    this.lista_jugadores = lista_jugadores;
  }

  @Override
  public String toString() {
    return "Equipo{"
        + "id="
        + id
        + ", nombre='"
        + nombre
        + '\''
        + ", lista_estadistica="
        + lista_estadistica
        + '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Equipo equipo = (Equipo) o;
    return Objects.equals(nombre, equipo.nombre);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(nombre);
  }
}
