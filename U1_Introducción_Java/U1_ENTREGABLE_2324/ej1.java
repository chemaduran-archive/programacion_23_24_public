package resolucion.U1_ENTREGABLE_2324;

public class ej1 {
  public static void main(String[] args) {
    int altura = 7;

    for (int i = 1; i <= altura; i++) {
      for (int j = 1; j <= altura * 2 + 3; j++) {
        if ((i == 1 && j < altura + 1 || i == altura && j <= altura || i + j == altura + 1)
            || (i == 1 && j > altura + 3)
            || (i == altura && j > altura + 3)
            || (i + j == altura * 2 + 4)) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }

      System.out.println();
    }
  }
}
