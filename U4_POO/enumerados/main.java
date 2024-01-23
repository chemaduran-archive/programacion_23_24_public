package U4_poo.teoria.enumerados;

// import U4.teoria.ejemplo.visibilidad.sin_modificador; // no puedo

import U4_poo.teoria.visibilidad.atributos;
import U4_poo.teoria.visibilidad.clase_publica;

public class main {
  public static void main(String[] args) {
    clase_publica p1 = new clase_publica();

    atributos at1 = new atributos();

    int a = at1.atributo_public;
  }
  // sin_modificador s2 = new sin_modificador();  // no puedo

}
