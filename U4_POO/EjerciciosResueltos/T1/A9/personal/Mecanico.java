package U4_poo.ejercicios.T1.A9.personal;

public class Mecanico {
  public String getNombre() {
    return nombre;
  }

  public String getTelefono() {
    return telefono;
  }

  public Especialidad getEspecialidad() {
    return especialidad;
  }

  // Atributos
  private String nombre;
  private String telefono;
  private Especialidad especialidad;

  public Mecanico(String nombre, String telefono, Especialidad especialidad) {
    this.nombre = nombre;
    this.telefono = telefono;
    this.especialidad = especialidad;
  }

  public void mostrar_informacion() {
    System.out.println("MECANICO: nombre = " + nombre);
    System.out.println("MECANICO: tlfno = " + telefono);
    System.out.println("MECANICO: especialidad = " + especialidad);
  }
}
