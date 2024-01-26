package U4_poo.ejercicios.T1.A4;

public class principal_a4 {
  public static void main(String[] args) {
    CuentaCorriente a = new CuentaCorriente("chema", "123456789");
    CuentaCorriente b = new CuentaCorriente("jorge", "987654321");

    a.mostrar_informacion();
    System.out.println();
    b.mostrar_informacion();

    System.out.println();
    // System.out.println(CuentaCorriente.banco);
    CuentaCorriente.cambiar_banco("Unicaja");

    // CuentaCorriente.banco = "Monte de Piedad";

    // System.out.println(CuentaCorriente.banco);
    b.mostrar_informacion();
  }
}
