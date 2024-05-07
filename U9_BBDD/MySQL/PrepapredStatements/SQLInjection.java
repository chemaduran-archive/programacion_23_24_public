package U9_bd.MYSQL.teoria;

import java.sql.*;
import java.util.Scanner;

public class SQLInjection {

  public static void main(String[] args) {

    Connection connection = null;

    try {
      // Creo la conexión a la base de datos
      // La paso el nombre de la base de datos classimodels
      // El usuario de la base de datos user=usuario
      // La contraseña password=usuario
      connection =
          DriverManager.getConnection(
              "jdbc:mysql://localhost:3336/classicmodels?user=root&password=XXXXX&allowMultiQueries=true");

      /// Creo el objeto para ejecutar la sentencias SQL
      Statement statement = connection.createStatement();

      // Establezco un tiempo máximo de respuesta
      statement.setQueryTimeout(30);

      // Solicito los datos del cliente
      Scanner sc = new Scanner(System.in);
      System.out.println("Introduzca el número del cliente");
      String cn = sc.nextLine();

      String query = "select * from customers where customerNumber=" + cn;

      System.out.println("Esta es la consulta construida: " + query);

      // Ejecuta una consulta de sencilla de búsqueda
      // El resultado se almacena en el ResultSet (conjunto de resultados)
      ResultSet rs = statement.executeQuery(query);

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
