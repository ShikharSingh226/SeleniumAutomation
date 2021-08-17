package com.shikhar.casestudy1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
public class case2 {
	WebDriver driver;
	  @BeforeTest(alwaysRun = true)
	    public void LaunchBrowser()
	    {
	        System.setProperty("webdriver.chrome.driver","C:\\Users\\Shikhar\\Desktop\\seleniumtrain\\chromedriver_win32\\chromedriver.exe");
	        driver=new ChromeDriver();        
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	        driver.get("http://demo.automationtesting.in/Alerts.html");
	    }
	  @Test
	   public void Alert() throws InterruptedException
	    {  
			
		  driver.findElement(By.linkText("Alert with OK")).click();
		  driver.findElement(By.xpath("//button[contains(text(),'alert box:')]")).click();
		  Alert a1=driver.switchTo().alert();
		  Thread.sleep(3000);
		  a1.accept(); 
		  
	      driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]")).click(); 
	      driver.findElement(By.id("CancelTab")).click();
			  
	      Alert a2=driver.switchTo().alert(); Thread.sleep(3000); 
	      a2.accept(); 
		  //act.dismiss();  
	   
	    
	      driver.findElement(By.linkText("Alert with Textbox")).click();
	      driver.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box')]")).click();
	      Alert a3=driver.switchTo().alert(); 
	      Thread.sleep(3000); 
	      a3.accept();
	    }
	  
	  
	  
	  
	
	
	
	
	
	
	
	
	
	
}
