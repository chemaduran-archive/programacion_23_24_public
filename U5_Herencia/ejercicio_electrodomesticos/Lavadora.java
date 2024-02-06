package U5_herencia_interfaces.ejercicios.T1_en_clase.A9;

import U5_herencia_interfaces.teoria.interfaces.comparable.Persona;

public class Lavadora extends Electrodomestico implements Comparable {
  protected double carga;

  public Lavadora() {
    super();
    this.carga = 5;
  }

  public Lavadora(double precio_base, double peso) {
    super(precio_base, peso);
    carga = 5;
  }

  public Lavadora(
      double precio_base, colores color, consumos consumo_e, double peso, double carga) {
    super(precio_base, color, consumo_e, peso);
    this.carga = carga;
  }

  public double getCarga() {
    return carga;
  }

  @Override
  public double getPrecioFinal() {
    precioFinal = super.getPrecioFinal();
    if (carga > 30) {
      precioFinal += 50;
    }
    return precioFinal;
  }

  @Override
  public String toString() {
    return "Lavadora{" + "carga=" + carga + super.toString() + "}";
  }

  @Override
  public int compareTo(Object o) {
    if (this == o || o == null) return 0;
    Lavadora otra = (Lavadora) o;
    if (this.getCarga() > otra.getCarga()) {
      return 1;
    } else if (this.getCarga() < otra.getCarga()) {
      return -1;
    }
    return 0;
  }
}
