package People;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class PersonTest {
  
  @Test
  
  public void testPersonDefault() {
    Person defPerson = new Person();
    
    String expectedDefName = "";
    String expectedDefAddress = "";
    String expectedDefPhone = "";
    String expectedDefEmail = "";
    
    String actualDefName = defPerson.getName();
    String actualDefAddress = defPerson.getAddress();
    String actualDefPhone = defPerson.getPhone();
    String actualDefEmail = defPerson.getPhone();
    
    Assert.assertTrue(expectedDefName.equals(actualDefName));
    Assert.assertTrue(expectedDefAddress.equals(actualDefAddress));
    Assert.assertTrue(expectedDefPhone.equals(actualDefPhone));
    Assert.assertTrue(expectedDefEmail.equals(actualDefEmail));
        
  }
  
  @Test
  public void testPersonInt() {
    Person intPerson = new Person("Name", "Address", 1234567890, "Email");
    
    String expectedIntName = "Name";
    String expectedIntAddress = "Address";
    String expectedIntPhone = "123-456-7890";
    String expectedIntEmail = "Email";
    
    String actualIntName = intPerson.getName();
    String actualIntAddress = intPerson.getAddress();
    String actualIntPhone = intPerson.getPhone();
    String actualIntEmail = intPerson.getEmail();

    Assert.assertTrue(expectedIntName.equals(actualIntName));
    Assert.assertTrue(expectedIntAddress.equals(actualIntAddress));
    Assert.assertTrue(expectedIntPhone.equals(actualIntPhone));
    Assert.assertTrue(expectedIntEmail.equals(actualIntEmail));
  }
  
  
  @Test
  void testPersonString() {
    Person stringPerson = new Person("Name", "Address", "123-456-7890", "Email");
    
    String expectedStringName = "Name";
    String expectedStringAddress = "Address";
    String expectedStringPhone = "123-456-7890";
    String expectedStringEmail = "Email";
    
    String actualStringName = stringPerson.getName();
    String actualStringAddress = stringPerson.getAddress();
    String actualStringPhone = stringPerson.getPhone();
    String actualStringEmail = stringPerson.getEmail();

    Assert.assertTrue(expectedStringName.equals(actualStringName));
    Assert.assertTrue(expectedStringAddress.equals(actualStringAddress));
    Assert.assertTrue(expectedStringPhone.equals(actualStringPhone));
    Assert.assertTrue(expectedStringEmail.equals(actualStringEmail));
  }
  
  
}
