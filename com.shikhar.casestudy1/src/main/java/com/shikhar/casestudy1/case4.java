package com.shikhar.casestudy1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class case4 {
	WebDriver driver;
	  @BeforeTest(alwaysRun = true)
	    public void LaunchBrowser()
	    {
	        System.setProperty("webdriver.chrome.driver","C:\\Users\\Shikhar\\Desktop\\seleniumtrain\\chromedriver_win32\\chromedriver.exe");
	        driver=new ChromeDriver();        
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	        
	    }
	  @Test
	   public void Iframes() throws InterruptedException
       {
			
		  
			
			  driver.get("http://demo.automationtesting.in/Frames.html");
			  driver.switchTo().frame("singleframe");
			  driver.findElement(By.tagName("input")).sendKeys("Text Entered");
			  driver.switchTo().defaultContent();
			  driver.findElement(By.xpath("//a[@href='#Multiple']")).click();
			  driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
			 		
				/*
				 * driver.navigate().to("https://www.rediff.com/");
				 * driver.switchTo().frame("moneyiframe");
				 * driver.findElement(By.id("nseindex")).click(); Thread.sleep(3000);
				 */
		 
		  
		  
		  
		  ;
		  
		  
       }
	  
	  
	  
}