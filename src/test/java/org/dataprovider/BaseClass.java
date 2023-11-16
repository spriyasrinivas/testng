package org.dataprovider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;
	public static void launchBrowser(){
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		
	}
	public static void loadUrl(String Url)
	{
		driver.get(Url);
	}
	public static WebElement findingElement(String locator,String Value)
	{
		if(locator.equals("id"))
		{
			WebElement element=driver.findElement(By.id(Value));
			return element;
		}
		else if(locator.equals("name"))
		{
			WebElement element = driver.findElement(By.name(Value));
			return element;
		}
			
		else
		{
			return null;
		}
	}
	public static void passValue(WebElement element,String Value)
	{
		element.sendKeys(Value);
	}
}
