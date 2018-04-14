package day2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Findelements {

public WebDriver driver =null;
	
	public void launchBrowser() 
	{
		// to launch chrome
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public void getAllLinks() 
	{
		List< String> actualValues= new ArrayList<String>();
		
		List<WebElement>  links = driver.findElements(By.tagName("a"));
		for (WebElement link : links) 
		{
			//System.out.println(link.getText()); 
			actualValues.add(link.getText());
		}
		
		System.out.println(actualValues);
		System.out.println(actualValues.size());
		
	}
	
	public static void main(String[] args) {
		Findelements obj = new Findelements();
		obj.launchBrowser();
		obj.getAllLinks();
	}
}
