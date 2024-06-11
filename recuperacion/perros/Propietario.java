package U7_collections.corregir.perros;

import java.io.Serializable;
import java.util.Objects;

public class Propietario implements Serializable {

  private String nombre;
  private String apellidos;
  private int numero_socio;
  private String pais;

  public Propietario(String nombre, String apellidos, int numero_socio, String pais) {
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.numero_socio = numero_socio;
    this.pais = pais;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellidos() {
    return apellidos;
  }

  public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
  }

  public int getNumero_socio() {
    return numero_socio;
  }

  public void setNumero_socio(int numero_socio) {
    this.numero_socio = numero_socio;
  }

  public String getPais() {
    return pais;
  }

  public void setPais(String pais) {
    this.pais = pais;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Propietario that = (Propietario) o;
    return numero_socio == that.numero_socio
        && Objects.equals(nombre, that.nombre)
        && Objects.equals(apellidos, that.apellidos)
        && Objects.equals(pais, that.pais);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nombre, apellidos, numero_socio, pais);
  }

  @Override
  public String toString() {
    return "Propietario{"
        + "nombre='"
        + nombre
        + '\''
        + ", apellidos='"
        + apellidos
        + '\''
        + ", numero_socio="
        + numero_socio
        + ", pais='"
        + pais
        + '\''
        + '}';
  }
}
