package People;

public class Person {
  String name;
  String address;
  String phone;
  String email;
  
  Person(){
    name = "";
    address = "";
    phone = "";
    email = "";       
  }
  
  Person(String name, String address, String phone, String email){
    this.name = name;
    this.address = address;
    this.phone = phone;
    this.email = email;    
  }
  
  Person(String name, String address, int phone, String email){
    this.name = name;
    this.address = address;
    this.phone = phoneToString(phone);
    this.email = email;
  }
  
  public String phoneToString(int phone) {
    StringBuffer temp = new StringBuffer("");
    temp.append(Integer.toString(phone));
    temp.insert(6, '-');
    temp.insert(3, '-');
    //System.out.println("TEST: " + temp);
    String phoneString = temp.toString();
    return phoneString;
    
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public void setAddress(String address){
    this.address = address;
  }
  
  public void setPhone(int phone) {
    this.phone = phoneToString(phone);
  }
  
  public void setPhone(String phone) {
    this.phone = phone;
  }
  
  public void setEmail(String email) {
    this.email = email;
  }
  
  public String getName() {
    return name;
  }
  
  public String getAddress() {
    return address;
  }
  
  public String getPhone() {
    return phone;
  }
  
  public String getEmail() {
    return email;
  }
}
