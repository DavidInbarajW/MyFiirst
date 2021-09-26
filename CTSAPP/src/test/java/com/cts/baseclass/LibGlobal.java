package com.cts.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {
	public static WebDriver driver;
	public static void siteLaunch(String url) 
	{
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				
				
				driver.get(url);
	}
				
	
	public static void TxtFill(WebElement element, String Text) 
	{
		element.sendKeys(Text);

	}
	public static void buttonClk(WebElement element) 
	{
		element.click();
	
		
	}
	public static  String getText(WebElement element) 
	{
		String text=element.getText();
		return text;

	}
	public static void SwitchFrame(int index)
	{
		
		driver.switchTo().frame(index);
	

	}
	public static void SwitchFrameWebElem(WebElement element) {
		driver.switchTo().frame(element);
		

	}

	

}