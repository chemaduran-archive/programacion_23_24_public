package U4_poo.ejercicios.T1.A6;

// Diseñar la clase Banco de la que interesa guardar su nombre, capital y la dirección central. Los
// bancos tienen las siguientes restricciones:
//
// a) Siempre tienen que tener un npombre, que no puede ser modificado
//
// b) Si no se especifica, todos los bancos tienen un capital por defecto de 5.2 millones de euros
// al crearse.
//
// c) El capital y la dirección de un banco son modificables.
//

public class Banco {
  // Atributos
  private final String nombre;
  private double capital;
  private String direccion;

  // Métodos
  public Banco(String nombre, double capital, String direccion) {
    this.nombre = nombre;
    this.capital = capital;
    this.direccion = direccion;
  }

  public Banco(String nombre, String direccion) {
    this(nombre, 5.2, direccion);
  }

  public String nombre() {
    return nombre;
  }

  public void NuevoCapital(double nuevo_capital) {
    capital = nuevo_capital;
  }

  public void NuevaDireccion(String nueva_direccion) {
    direccion = nueva_direccion;
  }
}
