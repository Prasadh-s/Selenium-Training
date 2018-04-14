package day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	
public WebDriver driver =null;
	
	public void launchBrowser() 
	{
		// to launch chrome
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.softwaretestinghelp.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	}
	
	public void handleFrameByString() 
	{
		driver.switchTo().frame("aswift_0");
		System.out.println("Parent Frame switched");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='google_ads_frame1']")));
		System.out.println("Child frame Switched");
		
		WebElement button = driver.findElement(By.id("ala1"));
		button.click();
		
		// Switch back
		
		driver.switchTo().defaultContent();
	}
	
	public static void main(String[] args) {
		Frames obj = new Frames();
		
		obj.launchBrowser();
		obj.handleFrameByString();
	}
	
}
