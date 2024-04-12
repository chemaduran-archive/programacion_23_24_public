package U7_collections.en_clase.t4;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class principal {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(
        "¿Desea cargar los datos mediante un fichero binario o desde la consola? A / B");
    String respuesta = sc.nextLine();
    Map<String, Empleado> mapa = new LinkedHashMap<>();
    boolean continuar = true;
    if (respuesta.equals("B")) {
      while (continuar) {
        System.out.println("Ingrese el dni :");
        String dni = sc.nextLine();
        Empleado emp = ingresarUsuario(sc, dni);
        mapa.put(emp.getDni(), emp);
        System.out.println("¿Desea ingresar un siguiente empleado :   S/N");
        respuesta = sc.nextLine();
        if (respuesta.equals("N")) {
          continuar = false;
        }
      }
      guardarEnBinario(mapa);
    } else {
      try (ObjectInputStream aaa =
          new ObjectInputStream(
              new FileInputStream("src/main/java/U7_collections/en_clase/t4/pipin.bin"))) {
        mapa = (Map<String, Empleado>) aaa.readObject();
      } catch (IOException | ClassNotFoundException ex) {
        System.out.println(ex.getMessage());
      }
    }
    //    System.out.println(mapa);
    // Pam veraniega descuido
    continuar = true;
    while (continuar) {
      System.out.println("¿Qué desea hacer?");
      System.out.println("A) Visualizar los datos de todos los empleados.");
      System.out.println("B) Borrar uno o varios empleados.");
      System.out.println("C) Visualizar un empleado en especifico.");
      System.out.println("D) Modificar un empleado en especifico.");
      System.out.println("E) Insertar uno o varios empleados nuevos.");
      System.out.println("F) Terminar el programa.");
      respuesta = sc.nextLine();
      switch (respuesta) {
        case "A":
          System.out.println(mapa);
          break;
        case "B":
          System.out.println("Ingrese DNI del empleado que desea borrar :");
          String dni = sc.nextLine();
          if (mapa.containsKey(dni)) {
            mapa.remove(dni);
            System.out.println("Se ha borrado satisfactoriamente.");
          } else {
            System.out.println("No se ha encontrado un empleado con ese DNI.");
          }
          break;
        case "C":
          System.out.println("Ingrese DNI del empleado que desea borrar :");
          dni = sc.nextLine();
          if (mapa.containsKey(dni)) {
            System.out.println(mapa.get(dni));
          } else {
            System.out.println("No se ha encontrado un empleado con ese DNI.");
          }
          break;
        case "D":
          System.out.println("Ingrese DNI del empleado que desea modificar :");
          dni = sc.nextLine();
          if (mapa.containsKey(dni)) {
            Empleado emp = ingresarUsuario(sc, dni);
            mapa.put(emp.getDni(), emp);
          } else {
            System.out.println("No se ha encontrado un empleado con ese DNI.");
          }
          break;
        case "E":
          System.out.println("Ingrese el dni :");
          dni = sc.nextLine();
          Empleado emp = ingresarUsuario(sc, dni);
          mapa.put(emp.getDni(), emp);
          break;
        case "F":
          continuar = false;
          break;
        default:
          System.out.println("La opcion ingresada no es valida.");
      }
      guardarEnBinario(mapa);
    }
  }

  private static void guardarEnBinario(Map<String, Empleado> mapa) {
    try (ObjectOutputStream aaa =
        new ObjectOutputStream(
            new FileOutputStream("src/main/java/U7_collections/en_clase/t4/pipin.bin"))) {
      aaa.writeObject(mapa);
    } catch (IOException ex) {
      System.out.println(ex.getMessage());
    }
  }

  private static Empleado ingresarUsuario(Scanner sc, String dni) {
    System.out.println("Ingrese el nombre del empleado :");
    String nombre = sc.nextLine();
    System.out.println("Ingrese la edad del empleado :");
    int edad = sc.nextInt();
    sc.nextLine();
    System.out.println("Ingrese la estatura del empleado :");
    double estatura = sc.nextDouble();
    sc.nextLine();
    System.out.println("Ingrese el sueldo del empleado :");
    double sueldo = sc.nextDouble();
    sc.nextLine();
    System.out.println("Ingrese el nombre del departamento :");
    String nombreDep = sc.nextLine();
    Departamento dep = new Departamento(nombreDep);
    Empleado emp = new Empleado(nombre, dni, edad, estatura, sueldo, dep, "sos");
    return emp;
  }
}
