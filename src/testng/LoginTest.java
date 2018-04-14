package testng;

import org.testng.annotations.*;

public class LoginTest extends BaseClass {
 
	

 @BeforeClass
 public void beforeClass() 
 {
	 System.out.println("BeforeClass");
 }
	
  @Test
  public void validateLogin() 
  {
	System.out.println("validateLogin");  
  }
  
  

  @Test
  public void validateForgetLink() 
  {
	  System.out.println("validateForgetLink");
  }
  
  
  
}
