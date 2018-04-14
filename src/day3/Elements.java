package day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elements {

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
	
	public void verify_isDisabled() 
	{
		WebElement textbox = driver.findElement(By.xpath("(//div[@class='example'])[5]//input"));
		if(textbox.isEnabled())
		{
			textbox.sendKeys("Welcome");
		}else 
		{
			System.out.println("Input field is disabled");
		}
	}
	
	public void verifyElement_isDisplayed() 
	{
		try {
		WebElement textbox = driver.findElement(By.id("email"));
		
		if(textbox.isDisplayed())
		{
			textbox.sendKeys("Welcome");
		}
		}catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		
	}
	
	public void verifyElement_isSelected() 
	{
		driver.navigate().to("https://www.facebook.com/");
		
		WebElement radio = driver.findElement(By.xpath("//input[@name='sex' and @value='1']"));
		
		
		if(radio.isSelected())
		{
			System.out.println("Already selected");
		}
		else {
			
			radio.click();
		}
		
	}
	
	
	public static void main(String[] args) {
		Elements obj = new Elements();
		obj.launchBrowser();
		//obj.verify_isDisabled();
		//obj.verifyElement_isDisplayed();
		obj.verifyElement_isSelected();
	}
	
}
