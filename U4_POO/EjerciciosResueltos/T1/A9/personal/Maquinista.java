package U4_poo.ejercicios.T1.A9.personal;

public class Maquinista {
  // Atributos
  private String nombre;
  private String dni;
  private double sueldo;
  private int rango;

  public Maquinista(String nombre, String dni, double sueldo, int rango) {
    this.nombre = nombre;
    this.dni = dni;
    this.sueldo = sueldo;
    this.rango = rango;
  }

  public void mostrar_informacion() {
    System.out.println("MAQUINISTA: nombre = " + nombre);
    System.out.println("MAQUINISTA: dni = " + dni);
    System.out.println("MAQUINISTA: sueldo = " + sueldo);
    System.out.println("MAQUINISTA: rango = " + rango);
  }
}
