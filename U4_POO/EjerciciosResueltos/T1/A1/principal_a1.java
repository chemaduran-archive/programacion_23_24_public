package U4_poo.ejercicios.T1.A1;

public class principal_a1 {
  public static void main(String[] args) {
    CuentaCorriente c = new CuentaCorriente("Chema", "12345678");

    c.mostrar_informacion();

    c.ingresar_dinero(100);

    c.mostrar_informacion();

    if (c.sacar_dinero(60)) {
      System.out.println("Desde el principal, se sacó dinero");
    } else {
      System.out.println("Desde el principal, no se pudo sacar dinero");
    }

    c.mostrar_informacion();

    if (c.sacar_dinero(95)) {
      System.out.println("Desde el principal, se sacó dinero");
    } else {
      System.out.println("Desde el principal, NO se pudo sacar dinero");
    }

    c.mostrar_informacion();
    //
  }
}
