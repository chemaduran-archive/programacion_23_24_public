package U4_poo.ejercicios.teoria.floristeria;

// no puedo hacerlo porque Regalo no es public
import U4_poo.ejercicios.teoria.Regalo;

// Esta clase Maceta, sólo es accesible por sus clases vecinas.
class Maceta {
  public void ponerPlanta() {
    System.out.println("Estoy poniendo la planta");
    // No puedo acceder Regalo, porque Regalo no es public
    Regalo regalo = new Regalo();
  }
}
