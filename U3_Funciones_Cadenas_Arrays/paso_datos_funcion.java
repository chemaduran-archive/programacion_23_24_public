package U3_strings_arrays_funciones.teoria;

public class paso_datos_funcion {

  public static void main(String[] args) {

    int mivariable = 4;

    System.out.println("Comenzamos");
    // Realiza una función en la que no se recibe nada y no devuelve nada (la función devuelve
    // 'void')
    funcion1();

    System.out.println("Llamo a la función2...¿qué pasa?");
    // Podemos insertar el valor devuelto de la función en cualquier sitio que lo acepte. A todos
    // los efectos, es un valor del tipo que devuelve
    System.out.println(funcion2());
    System.out.print("Llamo a la función3 para sumar:");
    // El valor devuelto por una función, se puede almacenar en una variable. Tiene que ser,
    // obviamente, del mismo tipo que devuelve la función
    int resultado = funcion3_suma(mivariable, 3);
    System.out.println("El valor de mivariable es: " + mivariable);
    System.out.println(resultado);
    // La sobrecarga de una función tiene que ser con el mismo nombre de la función y el mismo
    // número de parámetros que se pasan. NO SE DISTINGUEN POR EL VALOR DEVUELTO (VER *NOTA1)
    System.out.print("Llamo a la función3 para sumar (sobrecargada):");
    double resultado_double = funcion3_suma(2.3, 3.5);
    System.out.println(resultado_double);

    // Se puede llamar recursivamente a una función. Esto es, que se llame así misma.
    System.out.print("Llamo a la función recursiva: ");
    System.out.println(funcion_recursiva(3));
  }

  public static void funcion1() {
    System.out.println("estoy en la funcion1");
  }

  public static int funcion2() {
    System.out.print("Devuelvo un valor concreto: ");
    int valor = 3;
    return valor;
  }

  public static int funcion3_suma(int a, int b) {
    a = 7;
    return (a + b);
  }

  public static double funcion3_suma(double primer_parametro, double b) {
    return (primer_parametro + b);
  }

  public static int funcion_recursiva(int n) {
    if (n == 0) {
      return n;
    } else {
      return funcion_recursiva(n - 1);
    }
  }

  //  *NOTA1: Estas dos funciones, para Java, son exactamente iguales y no es capaz de
  // distinguirlas, por lo que no se puede definir dos veces.
  //  public static double funcion4_multiplica(int a, int b) {
  //    return (double) (a * b);
  //  }
  //
  //  public static int funcion4_multiplica(int a, int b) {
  //    return (int) (a * b);
  //  }
}
