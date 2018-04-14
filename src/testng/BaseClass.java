package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.*;

public class BaseClass {
	

public WebDriver driver =null;
public String userName="";


    @Parameters({"userName"})
	@BeforeSuite
	public void beforeSuite(String user) 
	{
		
		System.out.println("Am beforeSuite");
		userName=user;
	} 
	
	@Parameters({"BrowserName"})
	@BeforeTest
	public void beforeTest(String Browser) 
	{
		System.out.println(userName);
		if(Browser.toLowerCase().equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("Launcing Chrome Browser");
		}
		
		else if(Browser.equals("IE"))	
		{
			System.setProperty("webdriver.ie.driver", "./driver/IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			System.out.println("Launcing IE Browser");
		}
		
		
		driver.manage().window().maximize();
		
	}
	
	@BeforeMethod
	public void beforeMethod() 
	{
		System.out.println("Am beforeMethod");
	}
	
	@AfterMethod
	public void afterMethod() 
	{
		System.out.println("Am afterMethod");
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
