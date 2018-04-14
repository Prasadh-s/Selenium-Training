package day4;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptExecutor {

	static WebDriver driver;
	static WebElement element;
	
	public static void highlightElement()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver; 
		js.executeScript("arguments[0].setAttribute('style', 'background: white; border: 5px solid red;');", element);
	}
	
	public static void scrollElementIntoView(WebElement Element) throws Exception
	{
		// used to scroll the element into view 
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
}
