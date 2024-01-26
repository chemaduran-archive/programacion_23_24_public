package U4_poo.ejercicios.T2.A2;

import java.util.Arrays;

public class PilaTabla {
  private Integer[] t;
  private int indice_cima;
  private final int MAX_ELEMENTOS = 10;

  public PilaTabla() {
    t = new Integer[MAX_ELEMENTOS];
    indice_cima = -1;
  }

  public PilaTabla(int capacidad_inicial) {
    t = new Integer[capacidad_inicial];
    indice_cima = -1;
  }

  private boolean pila_vacia() {
    return indice_cima == -1;
  }

  private boolean pila_llena() {
    return indice_cima == t.length - 1;
  }

  Integer cima() {
    Integer elemento_cima = null;
    if (!pila_vacia()) {
      elemento_cima = t[indice_cima];
    }
    return elemento_cima;
  }

  public void apilar(Integer e) {
    if (pila_llena()) {
      t = Arrays.copyOf(t, t.length + 10);
    }
    t[++indice_cima] = e;
  }

  public Integer desapilar() {
    Integer elemento = null;
    if (!pila_vacia()) {
      elemento = t[indice_cima];
      indice_cima--;
    }
    return elemento;
  }

  public String mostrar() {
    String resultado = "";
    for (int i = 0; i <= indice_cima; i++) {
      resultado += t[i] + " ";
    }
    resultado += "(cima)";
    return resultado;
  }
}
