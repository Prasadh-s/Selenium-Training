package day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverCommands {

	
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
	
	public void refresh() {
		
		driver.navigate().refresh();
	}
	
	public void back() {
		
		driver.navigate().back();
	}
	
	public void froward() {
		driver.navigate().forward();
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		DriverCommands obj = new DriverCommands();
		obj.launchBrowser();
		
		Thread.sleep(3000);
		obj.refresh();
		
		Thread.sleep(3000);
		obj.back();
		
		Thread.sleep(3000);
		obj.froward();
	}
}
