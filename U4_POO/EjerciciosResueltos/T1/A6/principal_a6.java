package U4_poo.ejercicios.T1.A6;

public class principal_a6 {
  public static void main(String[] args) {
    //
    Banco b = new Banco("Bancadi", "Calle del millonario");
    CuentaCorriente c = new CuentaCorriente("Chemita", "123456");

    c.mostrar_informacion();
    System.out.println();

    c.cambiar_banco(b);

    c.mostrar_informacion();
  }
}
