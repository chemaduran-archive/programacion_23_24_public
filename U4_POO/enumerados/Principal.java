package U4_poo.teoria.enumerados;

public class Principal {
  public static void main(String[] args) {

    for (EnumeradoEnFichero item : EnumeradoEnFichero.values()) {
      System.out.println(item);
    }

    ClaseCualquiera.DiasDeLaSemana d = ClaseCualquiera.DiasDeLaSemana.LUNES;
    EnumeradoEnFichero op = EnumeradoEnFichero.valor2;

    String[] array_string = {"LUNES", "MARTES"};

    if (array_string[0].equals("LUNE")) {
      System.out.println("Es LUNES");
    } else {
      System.out.println("Error también. Nos podemos equivocar!");
    }

    ClaseCualquiera.metodo(ClaseCualquiera.DiasDeLaSemana.MARTES);

    System.out.println(d);
  }
}
