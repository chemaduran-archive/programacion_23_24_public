package U4_poo.ejercicios.T1.A9.personal;

public class JefeEstacion {
  // Atributos
  String nombre;
  String dni;

  public void JefeEstacion(String nombre, String dni) {
    this.dni = dni;
    this.nombre = nombre;
  }

  public void mostrar_informacion() {
    System.out.println("JEFE_ESTACION: nombre = " + nombre);
    System.out.println("JEFE_ESTACION: dni = " + dni);
  }
}
