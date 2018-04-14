package day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selection_Dropdown {

public WebDriver driver =null;
	
	public void launchBrowser() 
	{
		// to launch chrome
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public void choseByIndex() 
	{
		WebElement Day = driver.findElement(By.name("birthday_day"));
		Select st = new Select(Day);
		st.selectByIndex(7);
	}
	
	public void choseByValue() 
	{
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select st = new Select(month);
		st.selectByValue("10");
	}
	
	public void choseByVisibleText() 
	{
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select st = new Select(year);
		st.selectByVisibleText("2014");
	}
	
	public void getFirstSelectedOption() 
	{
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select st = new Select(year);
		System.out.println(st.getFirstSelectedOption().getText());
	}
	
	public void getOptions() 
	{
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select st = new Select(year);
		
		List<WebElement> values = st.getOptions();
		for (WebElement value : values) {
			
			System.out.println(value.getText());
		}
	}
	
	public static void main(String[] args) {
		Selection_Dropdown obj = new Selection_Dropdown();
		obj.launchBrowser();
		obj.getFirstSelectedOption();
		obj.choseByIndex();
		obj.choseByValue();
		obj.choseByVisibleText();
		obj.getOptions();
	}
	
	
	
}
