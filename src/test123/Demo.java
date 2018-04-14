package test123;

import org.testng.annotations.Test;

public class Demo 
{
  @Test(dataProviderClass=DPData.class ,dataProvider="LoginTest",invocationCount=3,suiteName="Bala")
  public void show(String a, String b, String c)
  {
	  System.out.println(a);

	  System.out.println(b);

	  System.out.println(c);
	  
  }
}
