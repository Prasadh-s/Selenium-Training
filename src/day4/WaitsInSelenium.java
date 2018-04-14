package day4;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsInSelenium 
{
	static WebDriver driver=null;

	/*Implicit wait means that we can tell Selenium that we would like it to wait 
	for a certain amount of time before throwing an exception that it cannot 
	find the element on the page. 
	 */
	public static void implicitWait()
	{
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	}

	/*	Explicit Wait
	It is more extendible in the means that you can set it up to wait for any
	condition you might like. Usually, you can use some of the prebuilt
	ExpectedConditions to wait for elements to become clickable, visible, 
	invisible, etc.*/

	public static void explicitWait()
	{

		WebDriverWait wait = new WebDriverWait(driver, 100);

		WebElement element = driver.findElement(By.id("123"));
		
	wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	/*	Fluent Wait
	Each FluentWait instance defines the maximum amount of time to wait for a condition,
	as well as the frequency with which to check the condition. Furthermore, 
	the user may configure the wait to ignore specific types of exceptions 
	whilst waiting, such as NoSuchElementExceptions when searching for an element 
	on the page.*/

	public static void fluentWait()
	{

		// Waiting 30 seconds for an element to be present on the page, checking
		// for its presence once every 5 seconds.

		Wait wait = new FluentWait(driver)

				.withTimeout(20, TimeUnit.SECONDS)

				.pollingEvery(5, TimeUnit.SECONDS);
	}




	//Difference Between Implicit, Explicit and Fluent Wait
	//Implicit Wait:
	/*	During Implicit wait if the Web Driver cannot find it immediately because 
	of its availability, it will keep polling (around 250 milli seconds) the 
	DOM (Document object model)to get the element. If the element is not available within the specified 
	Time an NoSuchElementException will be raised. The default setting is zero.
	Once we set a time, the Web Driver waits for the period of the WebDriver 
	object instance.*/

	//Explicit Wait:
	/*There can be instance when a particular element takes more than a minute to load.
		In that case you definitely not like to set a huge time to Implicit wait, as if 
		you do this your browser will going to wait for the same time for every element.

	To avoid that situation you can simply put a separate time on the required element only. 
	By following this your browser implicit wait time would be short for every element 
	and it would be large for specific element.
	 */
	//Fluent Wait: 
	/*		Let’s say you have an element which sometime appears in just 1 second and some
		time it takes minutes to appear. In that case it is better to use fluent wait, 
		as this will try to find element again and again until it find it or until the 
		final timer runs out*/

}
