package People;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class FacultyTest {

  @Test
  void testFaculty() {
    Faculty defFaculty = new Faculty();
    
    String expectedName = "";
    String expectedAddress = "";
    String expectedPhone = "";
    String expectedEmail = "";
    String expectedRank = "";
    String expectedHours = "";
    String expectedOffice = "";
    int expectedSalary = 0;
    int expectedDay = 0;
    int expectedMonth = 0;
    int expectedYear = 0;
    
    String actualName = defFaculty.getName();
    String actualAddress = defFaculty.getAddress();
    String actualPhone = defFaculty.getPhone();
    String actualEmail = defFaculty.getEmail();
    String actualRank = defFaculty.getRank();
    String actualHours = defFaculty.getOfficeHours();
    String actualOffice = defFaculty.getOffice();
    int actualSalary = defFaculty.getSalary();
    int actualDay = defFaculty.getDateHired().getDay();
    int actualMonth = defFaculty.getDateHired().getMonth();
    int actualYear = defFaculty.getDateHired().getYear();
    
    Assert.assertTrue(expectedName.equals(actualName));
    Assert.assertTrue(expectedAddress.equals(actualAddress));
    Assert.assertTrue(expectedPhone.equals(actualPhone));
    Assert.assertTrue(expectedEmail.equals(actualEmail));
    Assert.assertTrue(expectedRank.equals(actualRank));
    Assert.assertTrue(expectedHours.equals(actualHours));
    Assert.assertTrue(expectedOffice.equals(actualOffice));
    Assert.assertTrue(expectedSalary == actualSalary);
    Assert.assertTrue(expectedDay == actualDay);
    Assert.assertTrue(expectedMonth == actualMonth);
    Assert.assertTrue(expectedYear == actualYear);;
  }

  @Test
  void testFacultyPartial() {    
    String expectedName = "";
    String expectedAddress = "";
    String expectedPhone = "";
    String expectedEmail = "";
    String expectedRank = "";
    String expectedHours = "";
    String expectedOffice = "";
    int expectedSalary = 0;
    int expectedDay = 0;
    int expectedMonth = 0;
    int expectedYear = 0;
    
    Faculty partialFaculty = new Faculty(expectedHours, expectedRank);
    
    String actualName = partialFaculty.getName();
    String actualAddress = partialFaculty.getAddress();
    String actualPhone = partialFaculty.getPhone();
    String actualEmail = partialFaculty.getEmail();
    String actualRank = partialFaculty.getRank();
    String actualHours = partialFaculty.getOfficeHours();
    String actualOffice = partialFaculty.getOffice();
    int actualSalary = partialFaculty.getSalary();
    int actualDay = partialFaculty.getDateHired().getDay();
    int actualMonth = partialFaculty.getDateHired().getMonth();
    int actualYear = partialFaculty.getDateHired().getYear();
    
    Assert.assertTrue(expectedName.equals(actualName));
    Assert.assertTrue(expectedAddress.equals(actualAddress));
    Assert.assertTrue(expectedPhone.equals(actualPhone));
    Assert.assertTrue(expectedEmail.equals(actualEmail));
    Assert.assertTrue(expectedRank.equals(actualRank));
    Assert.assertTrue(expectedHours.equals(actualHours));
    Assert.assertTrue(expectedOffice.equals(actualOffice));
    Assert.assertTrue(expectedSalary == actualSalary);
    Assert.assertTrue(expectedDay == actualDay);
    Assert.assertTrue(expectedMonth == actualMonth);
    Assert.assertTrue(expectedYear == actualYear);
  }

  @Test
  void testFacultyString() {
    String expectedName = "name";
    String expectedAddress = "address";
    String expectedPhone = "123-456-7890";
    String expectedEmail = "email";
    String expectedRank = "rank";
    String expectedHours = "hours";
    String expectedOffice = "office";
    int expectedSalary = 1;
    int expectedDay = 2;
    int expectedMonth = 3;
    int expectedYear = 2000;
    
    MyDate dateHired = new MyDate(expectedYear, expectedMonth, expectedDay);
    Faculty partialFaculty = new Faculty(expectedName, expectedAddress, expectedPhone, expectedEmail, expectedOffice, expectedSalary, dateHired, expectedHours, expectedRank);
    
    String actualName = partialFaculty.getName();
    String actualAddress = partialFaculty.getAddress();
    String actualPhone = partialFaculty.getPhone();
    String actualEmail = partialFaculty.getEmail();
    String actualRank = partialFaculty.getRank();
    String actualHours = partialFaculty.getOfficeHours();
    String actualOffice = partialFaculty.getOffice();
    int actualSalary = partialFaculty.getSalary();
    int actualDay = partialFaculty.getDateHired().getDay();
    int actualMonth = partialFaculty.getDateHired().getMonth();
    int actualYear = partialFaculty.getDateHired().getYear();
    
    Assert.assertTrue(expectedName.equals(actualName));
    Assert.assertTrue(expectedAddress.equals(actualAddress));
    Assert.assertTrue(expectedPhone.equals(actualPhone));
    Assert.assertTrue(expectedEmail.equals(actualEmail));
    Assert.assertTrue(expectedRank.equals(actualRank));
    Assert.assertTrue(expectedHours.equals(actualHours));
    Assert.assertTrue(expectedOffice.equals(actualOffice));
    Assert.assertTrue(expectedSalary == actualSalary);
    Assert.assertTrue(expectedDay == actualDay);
    Assert.assertTrue(expectedMonth == actualMonth);
    Assert.assertTrue(expectedYear == actualYear);
  }
  
  @Test
  void testFacultyInt() {
    String expectedName = "name";
    String expectedAddress = "address";
    String expectedPhone = "123-456-7890";
    int phone = 1234567890;
    String expectedEmail = "email";
    String expectedRank = "rank";
    String expectedHours = "hours";
    String expectedOffice = "office";
    int expectedSalary = 1;
    int expectedDay = 2;
    int expectedMonth = 3;
    int expectedYear = 2000;
    
    MyDate dateHired = new MyDate(expectedYear, expectedMonth, expectedDay);
    Faculty partialFaculty = new Faculty(expectedName, expectedAddress, phone, expectedEmail, expectedOffice, expectedSalary, dateHired, expectedHours, expectedRank);
    
    String actualName = partialFaculty.getName();
    String actualAddress = partialFaculty.getAddress();
    String actualPhone = partialFaculty.getPhone();
    String actualEmail = partialFaculty.getEmail();
    String actualRank = partialFaculty.getRank();
    String actualHours = partialFaculty.getOfficeHours();
    String actualOffice = partialFaculty.getOffice();
    int actualSalary = partialFaculty.getSalary();
    int actualDay = partialFaculty.getDateHired().getDay();
    int actualMonth = partialFaculty.getDateHired().getMonth();
    int actualYear = partialFaculty.getDateHired().getYear();
    
    Assert.assertTrue(expectedName.equals(actualName));
    Assert.assertTrue(expectedAddress.equals(actualAddress));
    Assert.assertTrue(expectedPhone.equals(actualPhone));
    Assert.assertTrue(expectedEmail.equals(actualEmail));
    Assert.assertTrue(expectedRank.equals(actualRank));
    Assert.assertTrue(expectedHours.equals(actualHours));
    Assert.assertTrue(expectedOffice.equals(actualOffice));
    Assert.assertTrue(expectedSalary == actualSalary);
    Assert.assertTrue(expectedDay == actualDay);
    Assert.assertTrue(expectedMonth == actualMonth);
    Assert.assertTrue(expectedYear == actualYear);
  }

}
