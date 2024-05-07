package U9_bd.MYSQL.teoria.transacciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
  private static Connection con = null;

  public static Connection getConnection() {
    try {
      if (con == null) {
        con =
            DriverManager.getConnection(
                "jdbc:mysql://localhost:3336/classicmodels?user=root&password=XXXXX");
        System.out.println("Connection Successful");
      }
    } catch (SQLException ex) {
      System.out.println("Error: " + ex.getMessage());
      // Print the stack trace nicely
      for (StackTraceElement element : ex.getStackTrace()) {
        System.out.println(element);
      }
    }
    return con;
  }

  public static void close() {
    try {
      if (con != null) con.close();
    } catch (SQLException e) {
      // Falla el cierre de la conexión
      System.err.println(e.getMessage());
    }
  }
}
