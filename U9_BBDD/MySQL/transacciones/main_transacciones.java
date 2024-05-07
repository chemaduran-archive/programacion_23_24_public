package U9_bd.MYSQL.teoria.transacciones;

import java.sql.Connection;
import java.sql.SQLException;

public class main_transacciones {
  public static void main(String[] args) {
    Connection con = ConexionBD.getConnection();

    try {
      con.setAutoCommit(false);

      OfficeModel.insertOffice(
          new Office(
              "8",
              "Madrid",
              "+34 915 658 357",
              "Avenida Grijander, 7",
              "default",
              "",
              "Spain",
              "41005",
              "EMEA"));

      System.out.println("Insertada oficina. Vamos a por el empleado");

      EmployeeModel.insertEmployee(
          new Employee(
              8000,
              "Hernandez",
              "Juan",
              "x8000",
              "juanhernandez@classicmodelcars.com",
              "8",
              1, // 1102
              "Sales Rep"));

      con.commit();

      System.out.println("Insertado empleado.");

    } catch (SQLException e) {
      System.out.println("error: " + e.getMessage());
      try {
        if (con != null) {
          System.out.println(
              "Dejamos la BD en estado consistente. Ya se pueden hacer otros commits consistentemente.");
          con.rollback();
        }
      } catch (SQLException ex) {
        System.out.println("Error en el rollback.");
        for (StackTraceElement element : ex.getStackTrace()) {
          System.out.println(element);
        }
      }
    }
  }
}
