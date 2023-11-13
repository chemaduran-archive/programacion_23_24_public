package U3_strings_arrays_funciones.teoria;

public class   funciones_matematicas {
  public static void main(String[] args) {
    //
    System.out.print("2+3 es ");
    System.out.println(2 + 3);
    System.out.print("2*3 es ");
    System.out.println(2 * 3);
    System.out.print("2-3 es ");
    System.out.println(2 - 3);
    System.out.print("3/2 es ");
    System.out.println(3 / 2);
    System.out.print("3,0/2 es ");
    System.out.println(3.0 / 2);
    System.out.print("El resto de dividir 13 entre 4 es ");
    System.out.println(13 % 4);

    System.out.print("Un número al azar entre 0 y 1: ");
    System.out.println(Math.random());
    System.out.print("Un número al azar entre 50 y 150: ");
    System.out.println((int) (Math.random() * 100 + 50));
    System.out.print("Una letra minúscula al azar: ");
    System.out.println((char) (Math.random() * 26 + 'a'));

    System.out.print("Coseno de PI radianes: ");
    System.out.println(Math.cos(Math.PI));
    System.out.print("Seno de 45 grados: ");
    System.out.println(Math.sin(Math.toRadians(45)));
    System.out.print("Arco cuya tangente es 1: ");
    System.out.println(Math.toDegrees(Math.atan(1)));

    System.out.print("Raíz cuadrada de 36: ");
    System.out.println(Math.sqrt(36));
    System.out.print("Cinco elevado al cubo: ");
    System.out.println(Math.pow(5.0, 3.0));
    System.out.print("Exponencial de 2: ");
    System.out.println(Math.exp(2));
    System.out.print("Logaritmo de 2,71828: ");
    System.out.println(Math.log(2.71828));

    System.out.print("Mayor valor entre 2 y 3: ");
    System.out.println(Math.max(2, 3));
    System.out.print("Valor absoluto de -4,5: ");
    System.out.println(Math.abs(-4.5));
    System.out.print("Menor entero más cercano a -4,5: ");
    System.out.println(Math.floor(-4.5));
    System.out.print("Mayor entero más cercano a -4,5: ");
    System.out.println(Math.ceil(-4.5));
    System.out.print("Redondeando -4,5 con ROUND: ");
    System.out.println(Math.round(-4.5));
    System.out.print("Redondeando 4,5 con ROUND: ");
    System.out.println(Math.round(4.5));
    System.out.print("Redondeando -4,6 con RINT: ");
    System.out.println(Math.rint(-4.6));
    System.out.print("Redondeando -4,5 con RINT: ");
    System.out.println(Math.rint(4.5));
  }
}
