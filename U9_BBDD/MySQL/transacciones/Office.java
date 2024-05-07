package U9_bd.MYSQL.teoria.transacciones;

public class Office {
  private final String officeCode;
  private final String city;
  private final String phone;
  private final String addressLine1;
  private final String addressLine2;
  private final String state;
  private final String country;
  private final String postalCode;
  private final String territory;

  public Office(
      String officeCode,
      String city,
      String phone,
      String addressLine1,
      String addressLine2,
      String state,
      String country,
      String postalCode,
      String territory) {
    this.officeCode = officeCode;
    this.city = city;
    this.phone = phone;
    this.addressLine1 = addressLine1;
    this.addressLine2 = addressLine2;
    this.state = state;
    this.country = country;
    this.postalCode = postalCode;
    this.territory = territory;
  }

  public String getOfficeCode() {
    return officeCode;
  }

  public String getCity() {
    return city;
  }

  public String getPhone() {
    return phone;
  }

  public String getAddressLine1() {
    return addressLine1;
  }

  public String getAddressLine2() {
    return addressLine2;
  }

  public String getState() {
    return state;
  }

  public String getCountry() {
    return country;
  }

  public String getPostalCode() {
    return postalCode;
  }

  public String getTerritory() {
    return territory;
  }
}
