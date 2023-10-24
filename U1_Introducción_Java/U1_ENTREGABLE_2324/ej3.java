package resolucion.U1_ENTREGABLE_2324;

import java.util.Scanner;

public class ej3 {
  public static void main(String[] args) {
    float PRECIO_INDIVIDUAL = 8;
    final float PRECIO_DIA_ESPECTADOR = 5;
    final float PRECIO_PAREJA = 11;
    final float DESCUENTO_CINECAMPA = 0.1f;
    float precio_final = 0.0f;
    float descuento_final = 0.0f;

    Scanner sc = new Scanner(System.in);
    System.out.println("Venta de entradas CineCampa");
    System.out.println("Número de entradas: ");
    int num_entradas = sc.nextInt();
    sc.nextLine();
    System.out.println("Día de la semana: ");
    String dia_semana = sc.nextLine();
    System.out.println("¿Tiene tarjeta CineCampa? (s/n): ");
    String tarjeta = sc.nextLine();

    System.out.println("Aquí tiene sus entradas. Gracias por su compra.");
    if (dia_semana.equalsIgnoreCase("miercoles")) {
      System.out.println("Entradas individuales: " + num_entradas);
      System.out.println("Precio por entrada individual: " + PRECIO_DIA_ESPECTADOR);
      precio_final = num_entradas * PRECIO_DIA_ESPECTADOR;
    } else if (dia_semana.equalsIgnoreCase("jueves") && num_entradas >= 2) {
      if (num_entradas % 2 != 0) { // Hay una entrada "colgando". Sólo una. SIEMPRE.
        num_entradas--; // La resto.
        precio_final = PRECIO_INDIVIDUAL; // Añado el precio de la entrada al precio final
        System.out.println("Entradas individuales: 1");
      }
      System.out.println("Entradas de parejas: " + num_entradas / 2);
      precio_final += num_entradas * (PRECIO_PAREJA / 2);
      System.out.println("Precio por entrada de pareja: " + PRECIO_PAREJA);
    } else { // cualquier otro día
      System.out.println("Entradas individuales: " + num_entradas);
      System.out.println("Precio por entrada individual: " + PRECIO_INDIVIDUAL);
      precio_final = num_entradas * PRECIO_INDIVIDUAL;
    }
    System.out.println("Total: " + precio_final);
    if (tarjeta.equalsIgnoreCase("s")) {
      descuento_final = (precio_final * DESCUENTO_CINECAMPA);
      precio_final -= precio_final * DESCUENTO_CINECAMPA;
    }

    System.out.println("Descuento: " + descuento_final);
    System.out.println("A pagar: " + precio_final);
  }
}
