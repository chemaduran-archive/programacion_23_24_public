package corregir.U4U5_ENTREGABLE.correcion_clase;

public abstract class Participante {
  protected String nombre;
  protected int edad;

  public Participante(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
  }

  public abstract void hacerjuramento();

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
}
