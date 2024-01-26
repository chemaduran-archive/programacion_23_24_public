package U4_poo.ejercicios.T1.A7;

// Se quiere definir una clase que permita controlar un sintonizador digital de emisoras FM;
// concretamente, se desea dotar al controlador de una interfaz que permita subir (up) o bajar
// (down) la frecuencia (en saltos de 0.5 MHz) y mostrar la frecuencia sintonizada en un momento
// dado (display). Supondremos que el rango de frecuencias a manejar oscila entre los 80MHz y los
// 108MHz y que, al inicio, el controlador sintonice a 80MHz. Si durante una operación de subida o
// bajada se sobrepasa uno de los dos límites, la frecuencia sintonizada debe pasar a ser la del
// extremo contrario. Escribir un pequeño programa principal para probar su funcionamiento.

public class main_a7 {
  public static void main(String[] args) {
    //
    // Generamos una radio FM
    Radio radio = new Radio();

    // Mostramos su frecuencia
    System.out.println(radio.display());

    // reducimos una vez
    radio.down();
    System.out.println(radio.display());

    // Volvemos a subir
    radio.up();
    System.out.println(radio.display());

    // Subimos varias veces y mostramos
    radio.up();
    radio.up();
    radio.up();
    System.out.println(radio.display());
  }
}
