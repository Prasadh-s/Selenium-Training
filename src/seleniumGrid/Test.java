package seleniumGrid;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;

public class Test {

	public static WebDriver driver;
	
	public static void main(String[] args) throws MalformedURLException 
	{
		
 		String Hub = "http://192.168.1.5:4444/wd/hub";
 		
 		System.out.println("test");
 		
 		DesiredCapabilities cap =new DesiredCapabilities();
 		
 		cap.setBrowserName("chrome");
 		cap.setPlatform(Platform.ANY);
 		
 
 		driver = new RemoteWebDriver(new URL(Hub), cap);
 
 		
 		//test steps
 		driver.navigate().to("http://www.testintellect.com");
 		System.out.println(driver.getTitle());
 	
 		driver.quit();

	}

}

//java -jar selenium-server-standalone-3.7.1.jar -role node -hub http://192.168.1.2:4444/grid/register
//-browser "browserName=internet explorer, maxInstances=2"

//java -Dwebdriver.chrome.driver="D:\Local_Automation\Selenium_softwares\chromedriver.exe" -jar selenium-server-standalone-3.7.1.jar -role node -hub http://192.168.1.2:4444/grid/register
//-browser "browserName=internet explorer, maxInstances=2"

// from mail 
//Hub : java -jar selenium-server-standalone-3.10.0.jar -role hub

//Node: java -Dwebdriver.chrome.driver="chromedriver.exe" -jar selenium-server-standalone-3.7.1.jar -role node -hub http://192.168.1.5:4444/grid/register/
