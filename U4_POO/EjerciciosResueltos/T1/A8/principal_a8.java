package U4_poo.ejercicios.T1.A8;

// Modelar una casa con muchas bombillas, de forma que cada bombilla se pueda encender o apagar
// individualmente. Para ello hacer una clase Bombilla con una variable privada que indique si está
// encencida o apagada, así como un método que nos diga el estado de la bombilla. Además, queremos
// poner un interruptor general, de forma que si saltan los fusibles, todas las bombillas se
// muestran como apagadas. Cuando el fusible se repara, las bombillas vuelven a estar encendidas o
// apagadas, según estuvieran antes del percance. Cada bombilla se enciende o se apagan
// individualmente, pero solo responde si su interruptor particular está activado y además hay luz
// general.

public class principal_a8 {
  public static void main(String[] args) {
    //

    Bombilla b1 = new Bombilla(true);
    Bombilla b2 = new Bombilla(false);
    Bombilla b3 = new Bombilla(true);

    b1.mostrar_estado();
    b2.mostrar_estado();
    b3.mostrar_estado();
    System.out.println();

    b3.interruptor();

    b1.mostrar_estado();
    b2.mostrar_estado();
    b3.mostrar_estado();
    System.out.println();

    Bombilla.colapso();

    b1.mostrar_estado();
    b2.mostrar_estado();
    b3.mostrar_estado();
    System.out.println();

    Bombilla.colapso();

    b1.mostrar_estado();
    b2.mostrar_estado();
    b3.mostrar_estado();
    System.out.println();
  }
}
