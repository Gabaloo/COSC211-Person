package People;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class EmployeeTest {

  @Test
  void testEmployee() {
    Employee defEmployee = new Employee();
    
    String expectedName = "";
    String expectedAddress = "";
    String expectedPhone = "";
    String expectedEmail = "";
    String expectedOffice = "";
    int expectedSalary = 0;
    int expectedDay = 0;
    int expectedMonth = 0;
    int expectedYear = 0;
    
    String actualName = defEmployee.getName();
    String actualAddress = defEmployee.getAddress();
    String actualPhone = defEmployee.getPhone();
    String actualEmail = defEmployee.getEmail();
    String actualOffice = defEmployee.getOffice();
    int actualSalary = defEmployee.getSalary();
    int actualDay = defEmployee.getDateHired().getDay();
    int actualMonth = defEmployee.getDateHired().getMonth();
    int actualYear = defEmployee.getDateHired().getYear();
    
    Assert.assertTrue(expectedName.equals(actualName));
    Assert.assertTrue(expectedAddress.equals(actualAddress));
    Assert.assertTrue(expectedPhone.equals(actualPhone));
    Assert.assertTrue(expectedEmail.equals(actualEmail));
    Assert.assertTrue(expectedOffice.equals(actualOffice));
    Assert.assertTrue(expectedSalary == actualSalary);
    Assert.assertTrue(expectedDay == actualDay);
    Assert.assertTrue(expectedMonth == actualMonth);
    Assert.assertTrue(expectedYear == actualYear);
    
  }

  @Test
  void testEmployeePartial() {    
    String expectedName = "";
    String expectedAddress = "";
    String expectedPhone = "";
    String expectedEmail = "";
    String expectedOffice = "office";
    int expectedSalary = 1;
    int expectedDay = 3;
    int expectedMonth = 2;
    int expectedYear = 2000;
    
    MyDate dateHired = new MyDate(expectedYear, expectedMonth, expectedDay);
    Employee partialEmployee = new Employee(expectedOffice, expectedSalary, dateHired);
    
    String actualName = partialEmployee.getName();
    String actualAddress = partialEmployee.getAddress();
    String actualPhone = partialEmployee.getPhone();
    String actualEmail = partialEmployee.getEmail();
    String actualOffice = partialEmployee.getOffice();
    int actualSalary = partialEmployee.getSalary();
    int actualDay = partialEmployee.getDateHired().getDay();
    int actualMonth = partialEmployee.getDateHired().getMonth();
    int actualYear = partialEmployee.getDateHired().getYear();
    
    
    Assert.assertTrue(expectedName.equals(actualName));
    Assert.assertTrue(expectedAddress.equals(actualAddress));
    Assert.assertTrue(expectedPhone.equals(actualPhone));
    Assert.assertTrue(expectedEmail.equals(actualEmail));
    Assert.assertTrue(expectedOffice.equals(actualOffice));
    Assert.assertTrue(expectedSalary == actualSalary);
    Assert.assertTrue(expectedDay == actualDay);
    Assert.assertTrue(expectedMonth == actualMonth);
    Assert.assertTrue(expectedYear == actualYear);
  }
  
  
  @Test
  void testEmployeeFullString() {
    String expectedName = "name";
    String expectedAddress = "address";
    String expectedPhone = "123-456-7890";
    String expectedEmail = "email";
    String expectedOffice = "office";
    int expectedSalary = 1;
    int expectedDay = 3;
    int expectedMonth = 2;
    int expectedYear = 2000;
    
    MyDate dateHired = new MyDate(expectedYear, expectedMonth, expectedDay);
    Employee stringEmployee = new Employee(expectedName, expectedAddress, expectedPhone, expectedEmail, expectedOffice, expectedSalary, dateHired);
    
    String actualName = stringEmployee.getName();
    String actualAddress = stringEmployee.getAddress();
    String actualPhone = stringEmployee.getPhone();
    String actualEmail = stringEmployee.getEmail();
    String actualOffice = stringEmployee.getOffice();
    int actualSalary = stringEmployee.getSalary();
    int actualDay = stringEmployee.getDateHired().getDay();
    int actualMonth = stringEmployee.getDateHired().getMonth();
    int actualYear = stringEmployee.getDateHired().getYear();
    
    
    Assert.assertTrue(expectedName.equals(actualName));
    Assert.assertTrue(expectedAddress.equals(actualAddress));
    Assert.assertTrue(expectedPhone.equals(actualPhone));
    Assert.assertTrue(expectedEmail.equals(actualEmail));
    Assert.assertTrue(expectedOffice.equals(actualOffice));
    Assert.assertTrue(expectedSalary == actualSalary);
    Assert.assertTrue(expectedDay == actualDay);
    Assert.assertTrue(expectedMonth == actualMonth);
    Assert.assertTrue(expectedYear == actualYear);
  }

  @Test
  void testEmployeeFullInt() {
    String expectedName = "name";
    String expectedAddress = "address";
    String expectedPhone = "123-456-7890";
    int phone = 1234567890;
    String expectedEmail = "email";
    String expectedOffice = "office";
    int expectedSalary = 1;
    int expectedDay = 3;
    int expectedMonth = 2;
    int expectedYear = 2000;
    
    MyDate dateHired = new MyDate(expectedYear, expectedMonth, expectedDay);
    Employee intEmployee = new Employee(expectedName, expectedAddress, phone, expectedEmail, expectedOffice, expectedSalary, dateHired);
    
    String actualName = intEmployee.getName();
    String actualAddress = intEmployee.getAddress();
    String actualPhone = intEmployee.getPhone();
    String actualEmail = intEmployee.getEmail();
    String actualOffice = intEmployee.getOffice();
    int actualSalary = intEmployee.getSalary();
    int actualDay = intEmployee.getDateHired().getDay();
    int actualMonth = intEmployee.getDateHired().getMonth();
    int actualYear = intEmployee.getDateHired().getYear();
    
    
    Assert.assertTrue(expectedName.equals(actualName));
    Assert.assertTrue(expectedAddress.equals(actualAddress));
    Assert.assertTrue(expectedPhone.equals(actualPhone));
    Assert.assertTrue(expectedEmail.equals(actualEmail));
    Assert.assertTrue(expectedOffice.equals(actualOffice));
    Assert.assertTrue(expectedSalary == actualSalary);
    Assert.assertTrue(expectedDay == actualDay);
    Assert.assertTrue(expectedMonth == actualMonth);
    Assert.assertTrue(expectedYear == actualYear);
  }
  
}
