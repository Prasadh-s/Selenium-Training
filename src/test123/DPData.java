package test123;

import org.testng.annotations.DataProvider;

public class DPData {

	
	@DataProvider(name="LoginTest")
	  public static Object[][] getDataFromDataprovider()
	  {
	  return new Object[][] 
	  	{
	          { "Bala", "India","Automation" },
	          { "murugan", "UK","Manual" },
	         
	      };

	  }
	
}
