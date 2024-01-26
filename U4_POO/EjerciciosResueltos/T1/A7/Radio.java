package U4_poo.ejercicios.T1.A7;

public class Radio {
  private final double limite_max = 108;
  private final double limite_min = 80;
  private double frecuencia;

  public Radio() {
    setFrecuencia(80);
  }

  public void up() {
    setFrecuencia(getFrecuencia() + 0.5);
  }

  public void down() {
    setFrecuencia(getFrecuencia() - 0.5);
  }

  public double getFrecuencia() {
    return frecuencia;
  }

  public void setFrecuencia(double frecuencia) {
    if (frecuencia > limite_max) {
      this.frecuencia = limite_min;
    } else if (frecuencia < limite_min) {
      this.frecuencia = limite_max;
    } else {
      this.frecuencia = frecuencia;
    }
  }

  public String display() {
    return "radio{" + "frecuencia=" + frecuencia + '}';
  }
}
