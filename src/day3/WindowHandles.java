package day3;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	
public WebDriver driver =null;
	
	public void launchBrowser() 
	{
		// to launch chrome
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://shareselenium.herokuapp.com/WindowsHandle.html");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	}
	
	public void switchSingleWindow() 
	
	{
		String parentWindowSessionID= driver.getWindowHandle();
		System.out.println(parentWindowSessionID);
		
		WebElement button= driver.findElement(By.id("home"));
		button.click();
		
		Set<String> sessionIDs= driver.getWindowHandles();
		for (String sessionId : sessionIDs) 
		{
			
			driver.switchTo().window(sessionId);	
			
		}
		
		// performaing operations in child window and closes
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		// swict back to parent window
		
		driver.switchTo().window(parentWindowSessionID);
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		
	}
	
	
	public void switchMultipleWindow() 
	
	{
		String parentWindowSessionID= driver.getWindowHandle();
		System.out.println(parentWindowSessionID);
		
		WebElement button= driver.findElement(By.xpath("//button[text()='Open Multiple Windows']"));
		button.click();
		
		// opens 3 windows
		Set<String> sessionIDs= driver.getWindowHandles();
		for (String sessionId : sessionIDs) 
		{
			
			driver.switchTo().window(sessionId);
			
			String actualTitle =driver.getTitle();
			if(actualTitle.equals("404 Not Found"))
			{
				String content = driver.findElement(By.tagName("p")).getText();
				System.out.println(content);
				driver.close();
				break;
			}
			
		}
		
		driver.quit();
		
	}
	
	
	
	public static void main(String[] args) {
		WindowHandles obj = new WindowHandles();
		obj.launchBrowser();
		//obj.switchSingleWindow();
		obj.switchMultipleWindow();
	}
}
