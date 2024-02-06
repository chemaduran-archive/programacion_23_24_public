package U5_herencia_interfaces.ejercicios.T1_en_clase.A9;

class Electrodomestico {
  protected double precio_base;
  protected colores color;
  protected consumos consumo_e;
  protected double peso;
  protected double precioFinal;

  public Electrodomestico() {
    precio_base = 100;
    color = colores.BLANCO;
    consumo_e = consumos.F;
    peso = 5;
  }

  public Electrodomestico(double precio_base, colores color, consumos consumo_e, double peso) {
    this.precio_base = precio_base;
    this.color = color;
    this.consumo_e = consumo_e;
    this.peso = peso;
  }

  public Electrodomestico(double precio_base, double peso) {
    this.precio_base = precio_base;
    color = colores.BLANCO;
    consumo_e = consumos.F;
    this.peso = peso;
  }

  public double getPrecio_base() {
    return precio_base;
  }

  public colores getColor() {
    return color;
  }

  public consumos getConsumo_e() {
    return consumo_e;
  }

  public double getPeso() {
    return peso;
  }

  public double getPrecioFinal() {
    precioFinal = precio_base;
    switch (consumo_e) {
      case A -> precioFinal += 100;
      case B -> precioFinal += 80;
      case C -> precioFinal += 60;
      case D -> precioFinal += 50;
      case E -> precioFinal += 30;
      case F -> precioFinal += 10;
    }
    if (peso >= 0 && peso <= 29) {
      precioFinal += 10;
    } else if (peso >= 30 && peso <= 49) {
      precioFinal += 60;
    } else if (peso >= 50 && peso <= 79) {
      precioFinal += 80;
    } else if (peso >= 80) {
      precioFinal += 100;
    }
    return precioFinal;
  }

  @Override
  public String toString() {
    return "precio_base="
        + precio_base
        + ", color="
        + color
        + ", consumo_e="
        + consumo_e
        + ", peso="
        + peso
        + ", precioFinal="
        + precioFinal;
  }

  public enum colores {
    BLANCO,
    NEGRO,
    ROJO,
    AZUL,
    GRIS
  }

  public enum consumos {
    A,
    B,
    C,
    D,
    E,
    F
  }
}
