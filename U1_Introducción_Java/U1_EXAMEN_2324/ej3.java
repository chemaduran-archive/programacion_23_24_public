package U1_intro_bucles_condicionales.ejercicios.entregable2122tarde;

import java.util.Scanner;

// La hamburguesería Pitanza Feliz quiere se informatice su empresa. Realiza un programa que calcule
// el precio de unos pedidos en función del número de hamburguesas y del día en el que se haga.
//
// El precio de la hamburguesa básica con los ingredientes mínimos (pan, carne, queso) es de 3
// euros. La hamburguesa gourmet cuesta 5 euros, porque tiene carne de Waygu, pan artesano y queso
// de oveja.
//
// Los martes locos de Pitanza Feliz, un pedido de dos gourmet cuesta 9 euros, y los miércoles de
// desmadre, la hamburguesa básica cuesta 2 euros.
//
// Perteneciendo al club Fanegas de Pitanza Feliz, se obtiene un 12% de descuento sobre el precio
// final del pedido.
//
// Ejemplo1:
//
// Pedidos Pitanza Feliz
// Número de hamburguesas básicas: 4
// Número de hamburguesas gourmet: 1
// Día de la semana: viernes
// ¿Pertenece al club Fanegas? (s/n): n
//
// Aquí tiene su pedido. Gracias por su compra
// Hamburguesas básicas: 4
// Hamburguesas gourmet: 1
// Total: 17 €
// Descuento: 0 €
// A pagar: 17 €
// Ejemplo2:
//
// Pedidos Pitanza Feliz
// Número de hamburguesas básicas: 2
// Número de hamburguesas gourmet: 0
// Día de la semana: miércoles
// ¿Pertenece al club Fanegas? (s/n): s
//
// Aquí tiene su pedido. Gracias por su compra
// Hamburguesas básicas: 2
// Total: 6 €
// Descuento: 2,48 €
// A pagar:  3,52 €
// Ejemplo3:
//
// Pedidos Pitanza Feliz
// Número de hamburguesas básicas: 0
// Número de hamburguesas gourmet: 3
// Día de la semana: martes
// ¿Pertenece al club Fanegas? (s/n): s
//
// Aquí tiene su pedido. Gracias por su compra
// Hamburguesas gourmet: 3
// Total: 15 €
// Descuento: 2,68 €
// A pagar: 12,32 €
public class ej3 {
  public static void main(String[] args) {
    //
    Scanner sc = new Scanner(System.in);

    double total = 0;
    int precio_basicas = 3;
    final int precio_basicas_miercoles = 2;
    final int precio_gourmet = 5;
    final int precio_dos_gourmet_martes = 9;
    final double descuento_fanegas = 0.88;
    double a_pagar_gourmet = 0;
    double descuento = 0;

    System.out.println("Pedidos Pitanza Feliz");
    System.out.print("Número de hamburguesas básicas: ");
    int num_basicas = sc.nextInt();
    System.out.print("Número de hamburguesas gourmet: ");
    int num_gourmet = sc.nextInt();
    sc.nextLine();
    System.out.print("Día de la semana: ");
    String dia = sc.nextLine();
    System.out.print("¿Pertenece al club Fanegas? (s/n): ");
    String club_fanegas = sc.nextLine();

    // Calculamos los precios según el día
    if (dia.equalsIgnoreCase("martes")) {
      if (num_gourmet % 2 != 0) {
        a_pagar_gourmet = num_gourmet / 2 * precio_dos_gourmet_martes + precio_gourmet;
      }
    } else if (dia.equalsIgnoreCase("miércoles")) {
      precio_basicas = precio_basicas_miercoles;
      a_pagar_gourmet = num_gourmet * precio_gourmet;
    } else {
      a_pagar_gourmet = num_gourmet * precio_gourmet;
    }

    // Calculamos el total a pagar
    total = num_basicas * precio_basicas + a_pagar_gourmet;

    // Si pertenece al club, aplicamos el descuento
    if (club_fanegas.equalsIgnoreCase("s")) {
      descuento = total - total * descuento_fanegas;
    }

    System.out.println("Aquí tiene su pedido. Gracias por su compra");

    if (num_basicas > 0) System.out.println("Hamburguesas basicas: " + num_basicas);
    if (num_gourmet > 0) System.out.println("Hamburguesas gourmet: " + num_gourmet);
    System.out.println("Total: " + total + " €");
    System.out.println("Descuento: " + descuento + " €");
    System.out.println("A pagar: " + (total - descuento) + " €");
  }
}
