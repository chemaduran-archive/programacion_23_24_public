package U4_poo.ejercicios.T1.A8;

public class Bombilla {
  private static boolean interruptor_general = true;
  // Atributos
  private boolean estado;

  // Constructor
  public Bombilla(boolean estado_inicial) {
    this.estado = estado_inicial;
  }

  public static void colapso() {
    interruptor_general = !interruptor_general;
  }

  public void interruptor() {
    estado = !estado;
  }

  public void mostrar_estado() {
    if (estado && interruptor_general) {
      System.out.println("Encendida!");
    } else {
      System.out.println("Apagada!");
    }
  }
}
