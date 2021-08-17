package com.shikhar.casestudy1;


import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class case5 {
	WebDriver driver;
	  @BeforeTest(alwaysRun = true)
	    public void LaunchBrowser()
	    {
	        System.setProperty("webdriver.chrome.driver","C:\\Users\\Shikhar\\Desktop\\seleniumtrain\\chromedriver_win32\\chromedriver.exe");
	        driver=new ChromeDriver();        
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	        driver.get("https://www.goibibo.com/");
	    }
	  @Test
	   public void Datepicker() throws InterruptedException
	    {  
		  String MonthToBeSelected = "December 2021";
			String DAY ="16";
			driver.findElement(By.xpath("//input[@type='text' and @placeholder='Departure']")).click();
			
			while (true) 
			{
				String monthOnPage = driver.findElement(By.xpath("//div[@class='DayPicker-Caption' and @role='heading']")).getText();
						
				if (monthOnPage.equals(MonthToBeSelected)) 
				{
					break;
				} else
				{
					driver.findElement(
							By.xpath("//span[@role='button' and @class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
				}
	 
			}
			driver.findElement(By.xpath("//div[@class='DayPicker-Week']/div[@class='DayPicker-Day']/div[text()=" + DAY + "]")).click();
			
			Thread.sleep(2000);
	    }
	  
	    }
	
	
	

