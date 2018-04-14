package testng;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;




public class DataProviderExample
{
	
	
  @Test(dataProvider="LoginTest")
  public void LoginTestcase(String user, String pass, String domain)

  {
	  System.out.println(user);
	  System.out.println(pass);
	  System.out.println(domain);
	  if(user.equals("TestIntellect"))
	  {
		  System.out.println("Pass");
	  }else
	  {
		  System.out.println("Fail");
		  Assert.fail();
	  }
	  
	  System.out.println("Assert called");
  }
  
 
  
  @DataProvider(name="LoginTest")
  public Object[][] getDataFromDataprovider()
  {
  return new Object[][] 
  	{
          { "Bala", "India","Automation" },
          { "murugan", "UK","Manual" },
         
      };

  }
}
