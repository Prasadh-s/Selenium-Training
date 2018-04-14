package day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributes {

public WebDriver driver =null;
	
	public void launchBrowser() 
	{
		// to launch chrome
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://shareselenium.herokuapp.com/Edit.html");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	}
	
	public void getAttributes() 
	{
		WebElement inputbox = driver.findElement(By.name("username"));
		System.out.println(inputbox.getAttribute("value"));
	}
	
	public static void main(String[] args) {
		GetAttributes obj = new GetAttributes();
		obj.launchBrowser();
		obj.getAttributes();
	}
	
	
	
	
	
	
	
	
	
}
