package U5_herencia_interfaces.teoria.ejemplo_persona;

public class main_1 {
  public static void main(String[] args) {
    //
    Persona persona1 = new Persona("Pepito Piscinas", 10, 100);
    Persona persona2 = new Persona("Pepito Piscinas", 45, 218);
    Empleado empleado1 = new Empleado("John Cobra", 3, 90, 1000);
    Perro perro1 = new Perro();

    if (persona1.equals(empleado1)) {
      System.out.println("son personas iguales");
    } else {
      System.out.println("son personas distintas");
    }
  }
}
