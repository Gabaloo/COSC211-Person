package People;

public class Faculty extends Employee{
  String officeHours;
  String rank;
  
  Faculty(){
    officeHours = "";
    rank = "";    
  }
  
  Faculty(String officeHours, String rank){
    this.officeHours = officeHours;
    this.rank = rank;
  }
  
  Faculty(String name, String address, String phone, String email, String office, int salary, MyDate dateHired, String officeHours, String rank){
    super(name, address, phone, email, office, salary, dateHired);
    this.officeHours = officeHours;
    this.rank = rank;
  }
  
  Faculty(String name, String address, int phone, String email, String office, int salary, MyDate dateHired, String officeHours, String rank){
    super(name, address, phone, email, office, salary, dateHired);
    this.officeHours = officeHours;
    this.rank = rank;
  }
  
  public void setOfficeHours(String officeHours) {
    this.officeHours = officeHours;
  }
  
  public void setRank(String rank) {
    this.rank = rank;
  }
  
  public String getOfficeHours() {
    return officeHours;
  }
  
  public String getRank() {
    return rank;
  }
}
