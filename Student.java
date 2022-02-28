package People;

public class Student extends Person{
  String classStatus;
  Student(){
    classStatus = "";
  }
  
  Student(String classStatus){
    this.classStatus = classStatus;
  }
  Student(String name, String address, String phone, String email, String classStatus){
    super(name, address, phone, email);
    this.classStatus = classStatus;
  }
  Student(String name, String address, int phone, String email, String classStatus){
    super(name, address, phone, email);
    this.classStatus = classStatus;
  }
  
  public void setStatus(String classStatus) {
    this.classStatus = classStatus;
  }
  
  public String getStatus() {
    return classStatus;
  }
}
