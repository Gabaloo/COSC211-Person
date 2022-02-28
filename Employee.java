package People;

public class Employee extends Person{
  String office;
  MyDate dateHired;
  int salary;
  
  Employee(){
    office = "";
    salary = 0;
    dateHired = new MyDate(0, 0, 0);
  }
  
  Employee(String office, int salary, MyDate dateHired){
    this.office = office;
    this.salary = salary;
    this.dateHired = dateHired;
  }
  
  Employee(String name, String address, String phone, String email, String office, int salary, MyDate dateHired){
    super(name, address, phone, email);
    this.office = office;
    this.salary = salary;
    this.dateHired = dateHired;
  }
  
  Employee(String name, String address, int phone, String email, String office, int salary, MyDate dateHired){
    super(name, address, phone, email);
    this.office = office;
    this.salary = salary;
    this.dateHired = dateHired;
  }
  
  
  public void setOffice(String office) {
    this.office = office;
  }
  
  public void setDateHired(MyDate dateHired) {
    this.dateHired = dateHired;
  }
  
  public void setSalary(int salary) {
    this.salary = salary;
  }
  
  public String getOffice() {
    return office;
  }
  
  public MyDate getDateHired() {
    return dateHired;
  }
  
  public int getSalary() {
    return salary;
  }
  
}
