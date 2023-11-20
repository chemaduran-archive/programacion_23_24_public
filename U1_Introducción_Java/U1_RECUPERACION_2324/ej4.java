package U1_intro_bucles_condicionales.ejercicios.entregable1920;

// Crear programa que pinte una flecha doble hacia la izquierda. Se pide al usuario la altura de la
// figura, que debe ser un número impar mayor o igual que 3. La distancia entre cada flecha de
// asteriscos es siempre de 5 espacios. Si la altura introducida por el usuario no es un número
// impar mayor o igual que 3, el programa debe mostrar un mensaje de error.

public class ej4 {
  public static void main(String[] args) {
    //
    int altura = 5;

    for (int fila = 1; fila <= altura; fila++) {
      for (int col = 1; col <= altura; col++) {
        if (col == (altura / 2 + 1) - (fila - 1) || col == fila - (altura / 2)) {
          System.out.print("*     *");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
