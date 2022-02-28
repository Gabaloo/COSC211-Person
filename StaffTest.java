package People;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class StaffTest {

  @Test
  public void testStaff() {
    Staff defStaff = new Staff();
    
    String expectedName = "";
    String expectedAddress = "";
    String expectedPhone = "";
    String expectedEmail = "";
    String expectedTitle = "";
    String expectedOffice = "";
    int expectedSalary = 0;
    int expectedDay = 0;
    int expectedMonth = 0;
    int expectedYear = 0;
    
    String actualName = defStaff.getName();
    String actualAddress = defStaff.getAddress();
    String actualPhone = defStaff.getPhone();
    String actualEmail = defStaff.getEmail();
    String actualTitle = defStaff.getTitle();
    String actualOffice = defStaff.getOffice();
    int actualSalary = defStaff.getSalary();
    int actualDay = defStaff.getDateHired().getDay();
    int actualMonth = defStaff.getDateHired().getMonth();
    int actualYear = defStaff.getDateHired().getYear();
    
    Assert.assertTrue(expectedName.equals(actualName));
    Assert.assertTrue(expectedAddress.equals(actualAddress));
    Assert.assertTrue(expectedPhone.equals(actualPhone));
    Assert.assertTrue(expectedEmail.equals(actualEmail));
    Assert.assertTrue(expectedTitle.equals(actualTitle));
    Assert.assertTrue(expectedOffice.equals(actualOffice));
    Assert.assertTrue(expectedSalary == actualSalary);
    Assert.assertTrue(expectedDay == actualDay);
    Assert.assertTrue(expectedMonth == actualMonth);
    Assert.assertTrue(expectedYear == actualYear);
    
  }
  

  @Test
  void testStaffPartial() {
    Staff partialStaff = new Staff("title");
    
    String expectedName = "";
    String expectedAddress = "";
    String expectedPhone = "";
    String expectedEmail = "";
    String expectedTitle = "title";
    String expectedOffice = "";
    int expectedSalary = 0;
    int expectedDay = 0;
    int expectedMonth = 0;
    int expectedYear = 0;
    
    String actualName = partialStaff.getName();
    String actualAddress = partialStaff.getAddress();
    String actualPhone = partialStaff.getPhone();
    String actualEmail = partialStaff.getEmail();
    String actualTitle = partialStaff.getTitle();
    String actualOffice = partialStaff.getOffice();
    int actualSalary = partialStaff.getSalary();
    int actualDay = partialStaff.getDateHired().getDay();
    int actualMonth = partialStaff.getDateHired().getMonth();
    int actualYear = partialStaff.getDateHired().getYear();
    
    Assert.assertTrue(expectedName.equals(actualName));
    Assert.assertTrue(expectedAddress.equals(actualAddress));
    Assert.assertTrue(expectedPhone.equals(actualPhone));
    Assert.assertTrue(expectedEmail.equals(actualEmail));
    Assert.assertTrue(expectedTitle.equals(actualTitle));
    Assert.assertTrue(expectedOffice.equals(actualOffice));
    Assert.assertTrue(expectedSalary == actualSalary);
    Assert.assertTrue(expectedDay == actualDay);
    Assert.assertTrue(expectedMonth == actualMonth);
    Assert.assertTrue(expectedYear == actualYear);
  }

  
  @Test
  void testStaffFullString() {
    
    String expectedName = "name";
    String expectedAddress = "address";
    String expectedPhone = "123-456-7890";
    String expectedEmail = "email";
    String expectedTitle = "title";
    String expectedOffice = "office";
    int expectedSalary = 1;
    int expectedDay = 3;
    int expectedMonth = 2;
    int expectedYear = 2000;
    
    MyDate dateHired = new MyDate(expectedYear, expectedMonth, expectedDay);
    Staff stringStaff = new Staff(expectedName, expectedAddress, expectedPhone, expectedEmail, expectedOffice, expectedSalary, dateHired, expectedTitle);
    
    String actualName = stringStaff.getName();
    String actualAddress = stringStaff.getAddress();
    String actualPhone = stringStaff.getPhone();
    String actualEmail = stringStaff.getEmail();
    String actualTitle = stringStaff.getTitle();
    String actualOffice = stringStaff.getOffice();
    int actualSalary = stringStaff.getSalary();
    int actualDay = stringStaff.getDateHired().getDay();
    int actualMonth = stringStaff.getDateHired().getMonth();
    int actualYear = stringStaff.getDateHired().getYear();
    
    Assert.assertTrue(expectedName.equals(actualName));
    Assert.assertTrue(expectedAddress.equals(actualAddress));
    Assert.assertTrue(expectedPhone.equals(actualPhone));
    Assert.assertTrue(expectedEmail.equals(actualEmail));
    Assert.assertTrue(expectedTitle.equals(actualTitle));
    Assert.assertTrue(expectedOffice.equals(actualOffice));
    Assert.assertTrue(expectedSalary == actualSalary);
    Assert.assertTrue(expectedDay == actualDay);
    Assert.assertTrue(expectedMonth == actualMonth);
    Assert.assertTrue(expectedYear == actualYear);
  }

  @Test
  void testStaffFullInt() {
    String expectedName = "name";
    String expectedAddress = "address";
    String expectedPhone = "123-456-7890";
    int phone = 1234567890;
    String expectedEmail = "email";
    String expectedTitle = "title";
    String expectedOffice = "office";
    int expectedSalary = 1;
    int expectedDay = 3;
    int expectedMonth = 2;
    int expectedYear = 2000;
    
    MyDate dateHired = new MyDate(expectedYear, expectedMonth, expectedDay);
    Staff intStaff = new Staff(expectedName, expectedAddress, phone, expectedEmail, expectedOffice, expectedSalary, dateHired, expectedTitle);
    
    String actualName = intStaff.getName();
    String actualAddress = intStaff.getAddress();
    String actualPhone = intStaff.getPhone();
    String actualEmail = intStaff.getEmail();
    String actualTitle = intStaff.getTitle();
    String actualOffice = intStaff.getOffice();
    int actualSalary = intStaff.getSalary();
    int actualDay = intStaff.getDateHired().getDay();
    int actualMonth = intStaff.getDateHired().getMonth();
    int actualYear = intStaff.getDateHired().getYear();
    
    Assert.assertTrue(expectedName.equals(actualName));
    Assert.assertTrue(expectedAddress.equals(actualAddress));
    Assert.assertTrue(expectedPhone.equals(actualPhone));
    Assert.assertTrue(expectedEmail.equals(actualEmail));
    Assert.assertTrue(expectedTitle.equals(actualTitle));
    Assert.assertTrue(expectedOffice.equals(actualOffice));
    Assert.assertTrue(expectedSalary == actualSalary);
    Assert.assertTrue(expectedDay == actualDay);
    Assert.assertTrue(expectedMonth == actualMonth);
    Assert.assertTrue(expectedYear == actualYear);
  }
  

}
