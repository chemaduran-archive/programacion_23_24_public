package U6_ficheros.teoria.ficheros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class _02_ficheros_texto_salida { // salida = escribir = writer
  public static void main(String[] args) {
    // La manera típica de escribir un fichero será de la siguiente manera.
    // Al igual que con la lectura, hay que rodear con un try-catch.
    try {
      FileWriter out = new FileWriter("/home/pedro/programas/prueba.txt");
      String texto = "hola";
      out.write(texto);
      out.close();
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }

    // Al igual que con el BufferedReader, existe su contrapartida BufferedWriter para la escritura
    // de ficheros
    try {
      BufferedWriter out = new BufferedWriter(new FileWriter("Machado.txt"));
      String cad = "Mi infancia son recuerdos de un patio de Sevilla";
      for (int i = 0; i < cad.length(); i++) {
        out.write(cad.charAt(i));
      }
      cad = "y un huerto claro donde madura el limonero";
      out.newLine();
      out.write(cad);
      out.close();
    } catch (IOException ex) {
      System.out.println(ex.getMessage());
    }
  }
}