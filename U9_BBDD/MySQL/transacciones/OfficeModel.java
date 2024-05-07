package U9_bd.MYSQL.teoria.transacciones;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OfficeModel {
  public static Integer insertOffice(Office office) {
    Integer rowsAffected = 0;
    Connection con = ConexionBD.getConnection();

    try {
      // (officeCode, city, phone, addressLine1, addressLine2, state, country, postalCode,
      // territory)
      String sql = "INSERT INTO offices VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
      PreparedStatement sentencia = con.prepareStatement(sql);

      sentencia.setString(1, office.getOfficeCode());
      sentencia.setString(2, office.getCity());
      sentencia.setString(3, office.getPhone());
      sentencia.setString(4, office.getAddressLine1());
      sentencia.setString(5, office.getAddressLine2());
      sentencia.setString(6, office.getState());
      sentencia.setString(7, office.getCountry());
      sentencia.setString(8, office.getPostalCode());
      sentencia.setString(9, office.getTerritory());

      rowsAffected = sentencia.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return rowsAffected;
  }
}