package day4;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreensot {

	
public WebDriver driver =null;
	

	public void launchBrowser() 
	{
		// to launch chrome
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://erail.in/trains-between-stations/new-delhi-NDLS/mumbai-central-BCT?view=d");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	}
	
	public void screenshot() throws IOException 
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);		
		FileUtils.copyFile(src, new File("./ScreenShot/image.png"));
				 

	}
	
	public static void main(String[] args) throws IOException 
	{
		TakeScreensot obj = new TakeScreensot();
		obj.launchBrowser();
		obj.screenshot();
	}
}
