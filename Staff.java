package People;

public class Staff extends Employee{
  String title;
  
  Staff(){
    title = "";
  }
  
  Staff(String title){
    this.title = title;
  }
  
  Staff(String name, String address, String phone, String email, String office, int salary, MyDate dateHired, String title){
   super(name, address, phone, email, office, salary, dateHired);
   this.title = title;
  }
  
  Staff(String name, String address, int phone, String email, String office, int salary, MyDate dateHired, String title){
    super(name, address, phone, email, office, salary, dateHired);
    this.title = title;
   }
  
  public void setTitle(String title) {
    this.title = title;
  }
  
  public String getTitle() {
    return title;
  }
}
