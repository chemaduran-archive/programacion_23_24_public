package U5_herencia_interfaces.ejercicios.T1_en_clase.A9;

public class principal_a9_clase {
  public static void main(String[] args) {
    Electrodomestico[] array_el = new Electrodomestico[10];

    Lavadora l1 = new Lavadora();
    Electrodomestico l2 = new Lavadora();
    Televisor t1 = new Televisor();

    array_el[0] = l1;
    array_el[1] = l2;
    array_el[2] = t1;

    // Puedo volver a convertir el electrodoméstico, que antes
    // era lavadora
    Lavadora nueva = (Lavadora) array_el[1];
    double carga = nueva.getCarga();

    for (int i = 0; i < array_el.length; i++) {
      System.out.println(array_el[i].getColor());
    }
  }
}
