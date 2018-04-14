package day1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FB_Login {

	public WebDriver driver =null;
	
	public void launchBrowser() throws InterruptedException 
	{
		// to launch chrome
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		String actualTitle=driver.getTitle();
	
		if(actualTitle.equals("Facebook – log in or sign up"))
		{
			System.out.println("Pass");
		}else
		{
		System.err.println("Fail");
		}		
		
		String actualCurrentURL=driver.getCurrentUrl();
		
		if(actualCurrentURL.contains("facebook.com"))
		{
		System.out.println("Pass");
		}else 
		{
			System.err.println("Fail");
		}
		
		// other way to URL Navigation
		driver.navigate().to("http://chromedriver.storage.googleapis.com/index.html?path=2.33/");
		
		Thread.sleep(5000);
		//close
		
		driver.close();
		
		// quit
		//driver.quit();
		
	}
	
	
	
	public static void main(String[] args) throws InterruptedException
	{
		FB_Login obj =new FB_Login();
		obj.launchBrowser();
	}
}
