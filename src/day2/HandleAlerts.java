package day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

public WebDriver driver =null;
	
	public void launchBrowser() 
	{
		// to launch chrome
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver=new ChromeDriver();
		
		System.out.println(driver);
		
		driver.manage().window().maximize();
		
		driver.get("https://shareselenium.herokuapp.com/Alerts.html");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		
	}
	
	
	public void clickOK() 
	{
		WebElement button =driver.findElement(By.xpath("//button[text()='Alert Box']"));
		button.click();
		
		// Handle alert		
		Alert alt = driver.switchTo().alert();
		alt.accept();	
	} 
	
	public void clickCancel() 
	{
		WebElement button =driver.findElement(By.xpath("//button[text()='Confirm Box']"));
		button.click();
		
		// Handle alert		
		Alert alt = driver.switchTo().alert();
		alt.dismiss();	
	} 
	
	
	public static void main(String[] args) {
		HandleAlerts obj = new HandleAlerts();
		
		obj.launchBrowser();
		obj.clickOK();
		obj.clickCancel();
	}
}
