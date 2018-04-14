package day4;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

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
	
	public void erailTable()
	{
		WebElement table = driver.findElement(By.xpath("(//div[@id='divTrainsList']/table/tbody)[1]"));
		
		List<WebElement> rows  = table.findElements(By.tagName("tr"));
		
		System.out.println("Total row size :: "+ rows.size());
		
		for (WebElement row : rows)
		{
			
			List<WebElement> cells = row.findElements(By.tagName("td"));
			//for (WebElement cell : cells) 
			for(int i =0; i<cells.size();i++)
			{
				System.out.print(cells.get(3).getText() +" | ");
				
			}		
			
			System.out.println();
		}
		
		
		
	}
	
	public static void main(String[] args) {
		
		WebTable obj = new WebTable();
		obj.launchBrowser();
		obj.erailTable();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
