package U9_bd.SQLITE;

import java.sql.*;

public class principal_u9 {
  public static void main(String[] args) {
    Connection connection = null;
    try {
      // create a database connection
      connection = DriverManager.getConnection("jdbc:sqlite:sampledatabase.db");
      Statement statement = connection.createStatement();
      statement.setQueryTimeout(30); // set timeout to 30 sec.

      ResultSet rs = statement.executeQuery("SELECT * FROM employees");

      while (rs.next()) {
        // read the result set
        System.out.println("firstName      = " + rs.getString("firstName"));
        System.out.println("employeeNumber = " + rs.getInt("employeeNumber"));
      }
    } catch (SQLException e) {
      // if the error message is "out of memory" it probably means no database file is found
      System.err.println(e.getMessage());
    } finally {
      try {
        if (connection != null) connection.close();
      } catch (SQLException e) {
        // connection close failed.
        System.err.println(e.getMessage());
      }
    }
  }
}
