package U4_poo.teoria.enumerados;

public class ClaseCualquiera {

  public static void metodo(DiasDeLaSemana d) {
    if (d == DiasDeLaSemana.LUNES) {
      System.out.println("Es Lunes!");
    }
    EnumeradoEnFichero op = EnumeradoEnFichero.valor2;
  }

  public enum DiasDeLaSemana {
    LUNES,
    MARTES,
    MIERCOLES,
    JUEVES,
    VIERNES,
    SABADO,
    DOMINGO
  }
}
