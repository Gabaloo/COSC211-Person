package People;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class StudentTest {

  @Test
  void testStudent() {
    Student defStudent = new Student();
    
    String expectedName = "";
    String expectedAddress = "";
    String expectedPhone = "";
    String expectedEmail = "";
    String expectedStatus = "";
    
    String actualName = defStudent.getName();
    String actualAddress = defStudent.getAddress();
    String actualPhone = defStudent.getPhone();
    String actualEmail = defStudent.getEmail();
    String actualStatus = defStudent.getStatus();
    
    Assert.assertTrue(expectedName.equals(actualName));
    Assert.assertTrue(expectedAddress.equals(actualAddress));
    Assert.assertTrue(expectedPhone.equals(actualPhone));
    Assert.assertTrue(expectedEmail.equals(actualEmail));
    Assert.assertTrue(expectedStatus.equals(actualStatus));
    
  }

  
  @Test
  void testStudentString() {
    Student partialStudent = new Student("status");
    
    String expectedName = "";
    String expectedAddress = "";
    String expectedPhone = "";
    String expectedEmail = "";
    String expectedStatus = "status";
    
    String actualName = partialStudent.getName();
    String actualAddress = partialStudent.getAddress();
    String actualPhone = partialStudent.getPhone();
    String actualEmail = partialStudent.getEmail();
    String actualStatus = partialStudent.getStatus();
    
    Assert.assertTrue(expectedName.equals(actualName));
    Assert.assertTrue(expectedAddress.equals(actualAddress));
    Assert.assertTrue(expectedPhone.equals(actualPhone));
    Assert.assertTrue(expectedEmail.equals(actualEmail));
    Assert.assertTrue(expectedStatus.equals(actualStatus));
  }

  
  @Test
  void testStudentFullString() {
    Student stringStudent = new Student("name", "address", "123-456-7890", "email", "status");
    
    String expectedName = "name";
    String expectedAddress = "address";
    String expectedPhone = "123-456-7890";
    String expectedEmail = "email";
    String expectedStatus = "status";
    
    String actualName = stringStudent.getName();
    String actualAddress = stringStudent.getAddress();
    String actualPhone = stringStudent.getPhone();
    String actualEmail = stringStudent.getEmail();
    String actualStatus = stringStudent.getStatus();
    
    Assert.assertTrue(expectedName.equals(actualName));
    Assert.assertTrue(expectedAddress.equals(actualAddress));
    Assert.assertTrue(expectedPhone.equals(actualPhone));
    Assert.assertTrue(expectedEmail.equals(actualEmail));
    Assert.assertTrue(expectedStatus.equals(actualStatus));
    
  }
  
  
  
  @Test
  void testStudentFullInt() {
    Student intStudent = new Student("name", "address", 1234567890, "email", "status");
    
    String expectedName = "name";
    String expectedAddress = "address";
    String expectedPhone = "123-456-7890";
    String expectedEmail = "email";
    String expectedStatus = "status";
    
    String actualName = intStudent.getName();
    String actualAddress = intStudent.getAddress();
    String actualPhone = intStudent.getPhone();
    String actualEmail = intStudent.getEmail();
    String actualStatus = intStudent.getStatus();
    
    Assert.assertTrue(expectedName.equals(actualName));
    Assert.assertTrue(expectedAddress.equals(actualAddress));
    Assert.assertTrue(expectedPhone.equals(actualPhone));
    Assert.assertTrue(expectedEmail.equals(actualEmail));
    Assert.assertTrue(expectedStatus.equals(actualStatus));
    
  }

  
}
