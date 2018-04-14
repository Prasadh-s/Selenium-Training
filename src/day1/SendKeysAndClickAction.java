package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysAndClickAction {

	
public WebDriver driver =null;
	
	public void launchBrowser() 
	{
		// to launch chrome
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://shareselenium.herokuapp.com/Edit.html");
	}
	
	public void sendKeysExample() {
		
//		driver.findElement(By.id("email")).sendKeys("Balamurugan");
//		driver.findElement(By.id("email")).clear();
	
		// SendKeys example with locator Type ID
		WebElement email =driver.findElement(By.id("email"));
		email.sendKeys("Balamurugan");
		email.clear();
	}
	
	public void clickExample() 
	{
		driver.navigate().to("https://shareselenium.herokuapp.com/Buttons.html");
		
		WebElement GoTOHOmePage =driver.findElement(By.id("home"));
		
		GoTOHOmePage.click();
	}
	
	public static void main(String[] args){
		SendKeysAndClickAction obj = new SendKeysAndClickAction();
		obj.launchBrowser();
		obj.sendKeysExample();
		obj.clickExample();
		
		obj.driver.close();
	}

}
