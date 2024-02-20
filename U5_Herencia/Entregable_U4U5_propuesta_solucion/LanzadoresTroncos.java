package corregir.U4U5_ENTREGABLE.correcion_clase;

public class LanzadoresTroncos extends Participante implements lanzar {
  private TiposTroncos nombre_prueba;

  public LanzadoresTroncos(String nombre, int edad, TiposTroncos nombre_prueba) {
    super(nombre, edad);
    this.nombre_prueba = nombre_prueba;
  }

  @Override
  public void hacerjuramento() {
    System.out.println("Yo" + nombre + " , como lanzador, juro los valores deportivos mundiales");
  }

  @Override
  public String toString() {
    return "LanzadoresTroncos{"
        + "nombre_prueba='"
        + nombre_prueba
        + '\''
        + ", nombre='"
        + nombre
        + '\''
        + ", edad="
        + edad
        + '}';
  }

  @Override
  public void lanzar() {
    System.out.println("Voy a lanzar");
  }

  public enum TiposTroncos {
    PINO,
    ROBLE,
    OLIVO
  }
}
