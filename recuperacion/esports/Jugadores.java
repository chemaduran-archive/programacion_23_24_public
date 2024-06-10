package URecuperacion.ejercicios_practicar.esports;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public abstract class Jugadores implements Serializable {
  private static int contador = 0;
  private String nombre_jugador;
  private String alias;
  private int edad;
  private int id_jugadores;
  private String rol;

  public Jugadores(String nombre_jugador, String alias, int edad, String rol) {
    this.nombre_jugador = nombre_jugador;
    this.alias = alias;
    this.edad = edad;
    this.id_jugadores = contador++;
    this.rol = rol;
  }

  public String getNombre_jugador() {
    return nombre_jugador;
  }

  public void setNombre_jugador(String nombre_jugador) {
    this.nombre_jugador = nombre_jugador;
  }

  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public int getId_jugadores() {
    return id_jugadores;
  }

  public void setId_jugadores(int id_jugadores) {
    this.id_jugadores = id_jugadores;
  }

  public String getRol() {
    return rol;
  }

  public void setRol(String rol) {
    this.rol = rol;
  }

  @Override
  public String toString() {
    return "Jugadores{"
        + "nombre_jugador='"
        + nombre_jugador
        + '\''
        + ", alias='"
        + alias
        + '\''
        + ", edad="
        + edad
        + ", id_jugadores="
        + id_jugadores
        + ", rol='"
        + rol
        + '\''
        + '}';
  }
}
