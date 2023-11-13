package U3_strings_arrays_funciones.teoria;

public class clases_wrapper_character {
  public static void main(String[] args) {
    // char es el tipo primitivo. Character la clase envolvente

    // Constructor a partir de un char
    Character c1 = 'c';
    Character c2 = 'a'; // En versiones nuevas está deprecado (obsoleto). IntelliJ lo tacha por
    // innecesario.

    // Devuelve el valor equivalente
    Character c3 = 'b';
    char c4 = c3.charValue(); // lo que hace es devolver el char interno
    // que alberga este Character. En versiones nuevas, no es necesario, se hace
    // directamente

    // Método estático que comprueba si es minúscula. Puede invocarse
    // sin necesidad de declarar un Character
    boolean b1 = Character.isLowerCase('b');
    // Lo mismo para mayúsculas
    boolean b2 = Character.isUpperCase('b');
    // Comprueba si el carácter pasado es un dígito (carácter del 0 al 9)
    boolean b3 = Character.isDigit('b');
    // Comprueba si el carácter pasado es una letra
    boolean b4 = Character.isLetter('b');
    // Devuelve el carácter que se le pasa a mayúscula
    Character c5 = Character.toUpperCase('c');
    // Devuelve el carácter que se le pasa a minúscula
    Character c6 = Character.toLowerCase('c');

    // Método Estático. Devuelve un Character a partir de un char.
    char letra_m = Character.valueOf('h'); // Ya no es necesario y
    // se puede hacer directamente

    Character m = 'h';
    System.out.println(m);
  }
}
