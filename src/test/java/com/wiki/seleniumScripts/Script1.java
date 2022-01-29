package com.wiki.seleniumScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Script1 {
	
	
	@Test(priority='2')
	public void wikipageTest()
	{
		// open the browser using selenium
		
		WebDriver driver = new ChromeDriver();
		
		// Maximize the window
		
		driver.manage().window().maximize();
		
		// open the app on browser
		
		driver.get("https://www.wikipedia.org/");
		
		
		
		driver.close();
		
	}
	
	

}












