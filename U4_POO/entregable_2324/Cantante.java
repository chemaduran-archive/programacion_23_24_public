package U4_poo.entregable_2324;

import java.util.Arrays;

public class Cantante {
  private String nombre_real;

  private String nombre_artistico;

  private int edad;

  private String ciudad_origen;

  private Cancion[] lista_canciones = new Cancion[0];

  private int indice = 0;

  public Cantante(String nombre_real, String nombre_artistico, int edad, String ciudad_origen) {
    this.nombre_real = nombre_real;
    this.nombre_artistico = nombre_artistico;
    this.edad = edad;
    this.ciudad_origen = ciudad_origen;
  }

  public String getNombre_real() {
    return nombre_real;
  }

  public void setNombre_real(String nombre_real) {
    this.nombre_real = nombre_real;
  }

  public String getNombre_artistico() {
    return nombre_artistico;
  }

  public void setNombre_artistico(String nombre_artistico) {
    this.nombre_artistico = nombre_artistico;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public String getCiudad_origen() {
    return ciudad_origen;
  }

  public void setCiudad_origen(String ciudad_origen) {
    this.ciudad_origen = ciudad_origen;
  }

  public Cancion[] getLista_canciones() {
    return lista_canciones;
  }

  public void setLista_canciones(Cancion[] lista_canciones) {
    this.lista_canciones = lista_canciones;
  }

  @Override
  public String toString() {
    return "Cantante{"
        + "nombre_real='"
        + nombre_real
        + '\''
        + ", nombre_artistico='"
        + nombre_artistico
        + '\''
        + ", edad="
        + edad
        + ", ciudad_origen='"
        + ciudad_origen
        + '\''
        + ", cancion="
        + Arrays.toString(lista_canciones)
        + '}';
  }

  public void agregar_cancion(Cancion nueva_cancion) {
    if (lista_canciones.length == indice) {
      lista_canciones = Arrays.copyOf(lista_canciones, lista_canciones.length + 1);
    }
    lista_canciones[indice] = nueva_cancion;
    indice++;
  }

  public void eliminar_cancion(Cancion cancion_eliminada) {
    int posicion = 0;
    for (int i = 0; i < indice; i++) {
      if (lista_canciones[i].getTitulo_cancion().equals(cancion_eliminada.getTitulo_cancion())) {
        posicion = i;
      }
    }
    Cancion[] copia_cancion =
        Arrays.copyOfRange(lista_canciones, posicion + 1, lista_canciones.length);
    for (int i = 0; i < copia_cancion.length; i++) {
      lista_canciones[posicion] = copia_cancion[i];
      posicion++;
    }
    indice--;
  }
}
