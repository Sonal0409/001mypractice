package com.wiki.seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Script2 {
	
	@Test
	public void wikiSearchtest()
	{
		// open the browser using selenium
		
				WebDriver driver = new ChromeDriver();
				
				// Maximize the window
				
				driver.manage().window().maximize();
				
				// open the app on browser
				
				driver.get("https://www.wikipedia.org/");
				
				// selenium to find the inputbox and enter data -> selenium automation
				
		driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("Selenium Automation");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
				
		driver.close();		
				
				
				
				
				
				
				
				
				
	}

}
