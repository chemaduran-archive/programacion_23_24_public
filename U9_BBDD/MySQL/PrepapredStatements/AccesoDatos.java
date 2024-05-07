package U9_bd.MYSQL.teoria;

import java.sql.*;
import java.util.Scanner;

public class AccesoDatos {

  public static void main(String[] args) {

    // Creamos el objeto conexión
    Connection connection = null;

    try {
      // Creo la conexión a la base de datos
      // La paso el nombre de la base de datos classimodels
      // El usuario de la base de datos user=usuario
      // La contraseña password=usuario
      connection =
          DriverManager.getConnection(
              "jdbc:mysql://localhost:3336/classicmodels?user=root&password=XXXXX");

      // Solicito los datos del cliente
      // Scanner sc = new Scanner(System.in);
      // System.out.println("Introduzca el número del cliente");
      // String cn = sc.nextLine();

      // Creo el objeto para ejecutar la sentencias SQL
      String sql = "select * from customers where customerName= ? and country = ? ";
      PreparedStatement statement = connection.prepareStatement(sql);

      // Establezco los parámetros
      statement.setString(1, "La Rochelle Gifts");
      statement.setString(2, "France");

      // Mostrar la consulta
      System.out.println("LA CONSULTA CONSTRUIDA ES: " + statement);

      // Ejecuta una consulta de sencilla de búsqueda
      // El resultado se almacena en el ResultSet (conjunto de resultados)
      ResultSet rs = statement.executeQuery();

      // Recorremos el conjunto de resultados
      while (rs.next()) {
        String number = rs.getString("customerNumber");
        String name = rs.getString("customerName");
        String address = rs.getString("addressLine1");
        String country = rs.getString("country");

        System.out.println("-------------------------");
        System.out.println("CustomerNumber: " + number);
        System.out.println("CustomerName: " + name);
        System.out.println("Address: " + address);
        System.out.println("Country: " + country);
        System.out.println("-------------------------");
      }

    } catch (SQLException e) {
      System.out.println(e.getMessage());
    } finally {
      try {
        if (connection != null) {
          connection.close();
        }
      } catch (SQLException e) {
        System.out.println(e.getMessage());
      }
    }
  }
}
