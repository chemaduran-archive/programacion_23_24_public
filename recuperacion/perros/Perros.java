package U7_collections.corregir.perros;

import java.io.Serializable;
import java.util.Objects;

public class Perros implements Serializable {

  private String nombre;
  private int edad;
  private int peso;
  private boolean vacunas;
  private Propietario propietario;
  private String raza;

  public Perros(
      String nombre, int edad, int peso, boolean vacunas, Propietario propietario, String raza) {
    this.nombre = nombre;
    this.edad = edad;
    this.peso = peso;
    this.vacunas = vacunas;
    this.propietario = propietario;
    this.raza = raza;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public int getPeso() {
    return peso;
  }

  public void setPeso(int peso) {
    this.peso = peso;
  }

  public boolean isVacunas() {
    return vacunas;
  }

  public void setVacunas(boolean vacunas) {
    this.vacunas = vacunas;
  }

  public Propietario getPropietario() {
    return propietario;
  }

  public void setPropietario(Propietario propietario) {
    this.propietario = propietario;
  }

  public String getRaza() {
    return raza;
  }

  public void setRaza(String raza) {
    this.raza = raza;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Perros perros = (Perros) o;
    return edad == perros.edad
        && peso == perros.peso
        && vacunas == perros.vacunas
        && nombre.equals(perros.nombre)
        && propietario.equals(perros.propietario)
        && raza.equals(perros.raza);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nombre, edad, peso, vacunas, propietario, raza);
  }

  @Override
  public String toString() {
    return "Perros{"
        + "nombre='"
        + nombre
        + '\''
        + ", edad="
        + edad
        + ", peso="
        + peso
        + ", vacunas="
        + vacunas
        + ", propietario="
        + propietario
        + ", raza='"
        + raza
        + '\''
        + '}';
  }
}
