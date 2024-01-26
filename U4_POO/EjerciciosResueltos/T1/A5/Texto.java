package U4_poo.ejercicios.T1.A5;
// Diseñar la clase Texto que gestiona una cadena de caracteres
// con algunas características:
//
// -La cadena de caracteres tendrá una longitud máxima, que se especifica
// en el constructor.
//
// -Permite añadir un carácter, al principio o al final, siempre y cuando exista
// espacio disponible.
//
// -Igualmente, permite añadir una cadena, al principio o al final del texto,
// siempre y cuando no se rebase el tamaño máximo establecido.
//
// -Es necesario saber cuántas vocales (mayúsculas y minúsculas) hay en el texto.

public class Texto {
  // Atributo
  private final long max_long;
  private String cad;

  public Texto(long max_long) {
    cad = "";
    this.max_long = max_long;
  }

  public void add_char(char c) {
    if (max_long > cad.length()) {
      cad = c + cad;
    }
  }

  public void add_string(String s) {
    if (max_long >= cad.length() + s.length()) {
      cad = s + cad;
    }
  }

  public void add_char_final(char c) {
    if (max_long > cad.length()) {
      cad = cad + c;
    }
  }

  public void add_string_final(String s) {
    if (max_long >= cad.length() + s.length()) {
      cad = cad + s;
    }
  }

  public void mostrar() {
    System.out.println(cad);
  }

  public int num_vocales() {
    int n_vocales = 0;

    for (int i = 0; i < cad.length(); i++) {
      if (es_vocal(cad.charAt(i))) {
        n_vocales++;
      }
    }
    return n_vocales;
  }

  private boolean es_vocal(char c) {
    final String vocales = "aeiouáéíóú";
    boolean es_vocal = false;
    c = Character.toLowerCase(c);
    if (vocales.indexOf(c) != -1) {
      es_vocal = true;
    }
    return es_vocal;
  }
}