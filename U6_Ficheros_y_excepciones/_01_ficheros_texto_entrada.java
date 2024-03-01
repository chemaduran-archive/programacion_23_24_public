package U6_ficheros.teoria.ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class _01_ficheros_texto_entrada { // entrada = leer = reader
  public static void main(String[] args) {
    // La manera típica de leer un fichero será de la siguiente manera.
    // Es necesario rodear el código con el try-catch correspondiente porque nos puede dar una
    // excepción de entrada/salida (IO), como por ejemplo, que el fichero no se encuentre, o un
    // error en el disco.
    // En este caso, estamos recorriendo un fichero de texto carácter a carácter.
    try {
      FileReader in = new FileReader("/home/pedro/programas/prueba.txt");
      String texto = "";
      int c = in.read();
      while (c != -1) {
        texto += (char) c;
        c = in.read();
      }
      in.close();
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }

    // Sin embargo, una manera más óptima desde el punto de vista del rendimiento, es utilizar
    // BufferedReader:
    // En este caso, estamos leyendo un fichero de texto línea a línea, porque es el método que se
    // utiliza en el BufferedReader.
    String texto = "";
    try {
      BufferedReader in = new BufferedReader(new FileReader("U9_bd.examen.mañana_2122.Main.java"));
      String linea = in.readLine();
      while (linea != null) {
        texto += linea;
        linea = in.readLine();
      }
      in.close();
    } catch (IOException ex) {
      System.out.println(ex.getMessage());
    }
    System.out.println(texto);
  }
}
