package testng;

import org.testng.Reporter;
import org.testng.annotations.*;


public class NewTest {
 
	
	@BeforeSuite
	public void beforeSuite() 
	{
		
		System.out.println("Am beforeSuite");

	}
	
	@BeforeTest
	public void beforeTest() 
	{
		System.out.println("Am beforeTest");
	}
	

	@BeforeClass
	public void beforeClass() 
	{
		System.out.println("Am beforeClass");
	}
	

	@BeforeMethod
	public void beforeMethod() 
	{
		System.out.println("Am beforeMethod");
	}
	
	
	
	@Test(enabled=true,dependsOnMethods="TestCase2" )
	public void TestCase1() 
	{
		System.out.println("Am Test_1");
	}
	
	
	@Test()
	public void TestCase2() 
	{
		System.out.println("Am Test_2");
	}

	@AfterMethod
	public void afterMethod() 
	{
		System.out.println("Am afterMethod");
	}

	@AfterClass
	public void afterClass() 
	{
		System.out.println("Am afterClass");
	}

	@AfterTest
	public void afterTest() 
	{
		System.out.println("Am afterTest");
	}



	@AfterSuite
	public void afterSuite() 
	{
		System.out.println("Am afterSuite");
	}















}
