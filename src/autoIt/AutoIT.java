package autoIt;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class AutoIT 
{
	
	WebDriver driver ;
	@BeforeMethod
	public void openBrowser() 
	{
		// launch browser and get url
		//https://www.testintellect.com/become-a-trainer
	}
	
	@Test
	public void handleAuoIT() throws InterruptedException, IOException
	{
	
		// click Upload Button
		driver.findElement(By.id("photo")).click();
		Thread.sleep(5000);
		// To call Autoit Exe file 
		Runtime.getRuntime().exec("C:\\Users\\Balamurugan\\Desktop\\MarchBatchAutoitTrial.exe");
		
		Thread.sleep(10000);
	}

}
