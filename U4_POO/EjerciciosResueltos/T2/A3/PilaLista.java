package U4_poo.ejercicios.T2.A3;

import U4_poo.ejercicios.T2.A1.Lista;

public class PilaLista {
  private int indice_cima = -1;
  private Lista l;

  public PilaLista() {
    indice_cima = -1;
    l = new Lista();
  }

  public PilaLista(int capacidad_inicial) {
    indice_cima = -1;
    l = new Lista(capacidad_inicial);
  }

  private boolean pila_vacia() {
    return indice_cima == -1;
  }

  private boolean pila_llena() {
    return l.lista_llena();
  }

  public Integer cima() {
    Integer elemento_cima = null;
    if (!pila_vacia()) {
      elemento_cima = l.obtener_elemento(indice_cima);
    }
    return elemento_cima;
  }

  public void apilar(Integer e) {
    l.insertar_final(e);
    indice_cima++;
  }

  public Integer desapilar() {
    Integer elemento = l.eliminar_elemento(indice_cima);
    if (elemento != null) {
      indice_cima--;
    }
    return elemento;
  }

  public String mostrar() {
    return l.mostrar_lista() + "(cima)";
  }
}
