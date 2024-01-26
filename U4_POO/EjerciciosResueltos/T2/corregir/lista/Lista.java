package U4_poo.ejercicios.T2.corregir.lista;

import java.util.Arrays;

public class Lista {
  private Integer[] tabla;
  private Integer indice = 0;

  public Lista() {
    this.tabla = new Integer[10];
  }

  public Lista(Integer capacidad) {
    this.tabla = new Integer[capacidad];
  }

  public int numerosInsertados() {
    return indice;
  }

  public void insertarNumeroFinal(Integer numero) {
    if (indice >= tabla.length) {
      tabla = Arrays.copyOf(tabla, tabla.length + 1);
    }
    tabla[indice] = numero;
    indice++;
  }

  public void insertarNumeroInicio(Integer numero) {
    Integer[] copia = Arrays.copyOf(tabla, indice);
    System.out.println(Arrays.toString(copia));
    tabla[0] = numero;
    for (int i = 0; i < copia.length; i++) {
      tabla[i + 1] = copia[i];
    }
    indice++;
  }

  public void insertarNumeroPosicion(int posicion, Integer numero) {
    if (posicion >= 0 && posicion < indice) {
      Integer[] copia = Arrays.copyOf(tabla, indice);
      System.out.println(Arrays.toString(copia));
      tabla[posicion] = numero;
      for (int i = posicion; i < copia.length; i++) {
        tabla[i + 1] = copia[i];
      }
      indice++;
    }
  }

  public void insertarListaFinal(Integer[] lista) {
    for (int i = 0; i < lista.length; i++) {
      insertarNumeroFinal(lista[i]);
    }
  }

  public void eliminarNumero(int posicion) {
    if (posicion >= 0 && posicion < indice) {
      Integer[] copia = Arrays.copyOf(tabla, indice);
      System.out.println(Arrays.toString(copia));
      for (int i = posicion + 1; i < copia.length; i++) {
        tabla[i - 1] = copia[i];
      }
      indice--;
    }
  }

  public Integer obtenerNumero(int posicion) {
    if (posicion >= 0 && posicion < indice) {
      return tabla[posicion];
    } else return null;
  }

  public int buscarNumero(Integer numero) {
    for (int i = 0; i < tabla.length; i++) {
      if (tabla[i].equals(numero)) {
        return i;
      }
    }
    return -1;
  }

  public void mostrarLista() {
    for (int i = 0; i < indice; i++) {
      System.out.print(" " + tabla[i]);
    }
  }
}
