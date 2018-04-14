package day4;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	
public WebDriver driver =null;
	

	public void launchBrowser() 
	{
		// to launch chrome
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://toolsqa.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	}
	
	public void mouseHover() throws InterruptedException 
	{
		Actions act = new Actions(driver);
		
		// (//span[text()='Tutorial'])[1] or //ul[@id='primary-menu']/li[2]/a/span/span/span
		
		// for single action give perform() alone
		//act.moveToElement(driver.findElement(By.xpath("(//span[text()='Tutorial'])[1]"))).perform();
		
		// multiple action 
		
		act.moveToElement(driver.findElement(By.xpath("(//span[text()='Tutorial'])[1]"))).perform();
		
		Thread.sleep(2000);
		
		act.moveToElement(driver.findElement(By.xpath("//div[text()='Selenium Online Trainings ']")))
		.perform();;
		
		Thread.sleep(2000);
		
		act.moveToElement(driver.findElement(By.xpath("(//span[text()='Telerik Test Studio Tutorial'])[1]")))
		.click().build().perform();
		
	}
	
	
	public void rightClick() throws Exception 
	{
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//span[text()='HOME']"))).contextClick().build().perform();

		Thread.sleep(2000);
		
		Robot rt = new Robot();
		
		rt.keyPress(KeyEvent.VK_DOWN);
		rt.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(2000);
		
		rt.keyPress(KeyEvent.VK_ENTER);
		rt.keyRelease(KeyEvent.VK_ENTER);
		
		
	} 
	
	public void dragAndDrop() 
	{
		Actions act = new Actions(driver);
		WebElement source = driver.findElement(By.id(""));
		WebElement target = driver.findElement(By.id(""));
		act.dragAndDrop(source, target).build().perform();
	}
	
	public static void main(String[] args) throws Exception {
		
		ActionClass obj = new ActionClass();
		obj.launchBrowser();
		//obj.mouseHover();
		obj.rightClick();
	}
	
	
	
	
	
	
	
	
	
	
}
