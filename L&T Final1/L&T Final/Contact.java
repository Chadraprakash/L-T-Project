
public class Contact {
  private String name;
  private String phoneNumber;
  private String email;
  private String address;

  public Contact(String name, String phoneNumber, String email, String address) {
      this.name = name;
      this.phoneNumber = phoneNumber;
      this.email = email;
      this.address = address;
  }
  public void setAllData(String name, String phoneNumber, String email, String address) {
    this.name = name;
    this.phoneNumber = phoneNumber;
    this.email = email;
    this.address = address;
  }
  public void updateAllData(String name, String phoneNumber, String email, String address) {
    this.name = name;
    this.phoneNumber = phoneNumber;
    this.email = email;
    this.address = address;
  }
  public void showData() {
    System.out.println("Name: " + this.name);
    System.out.println("Phone Number: " + this.phoneNumber);
    System.out.println("Email: " + this.email);
    System.out.println("Address: " + this.address);
  }
  public String getName() {
      return name;
  }

  public void setName(String name) {
      this.name = name;
  }

  public String getPhoneNumber() {
      return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
  }

  public String getEmail() {
      return email;
  }

  public void setEmail(String email) {
      this.email = email;
  }

  public String getAddress() {
      return address;
  }

  public void setAddress(String address) {
      this.address = address;
  }
}




