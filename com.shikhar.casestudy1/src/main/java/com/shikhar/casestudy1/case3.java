package com.shikhar.casestudy1;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
public class case3 {
	WebDriver driver;
	  @BeforeTest(alwaysRun = true)
	    public void LaunchBrowser()
	    {
	        System.setProperty("webdriver.chrome.driver","C:\\Users\\Shikhar\\Desktop\\seleniumtrain\\chromedriver_win32\\chromedriver.exe");
	        driver=new ChromeDriver();        
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	        driver.get("http://demo.automationtesting.in/Windows.html");
	    }
	  @Test
	   public void Windows() throws InterruptedException
	    {  
			
			  driver.findElement(By.xpath("//*[@id='Tabbed']/a/button")).click();
			  
			  Set<String> set=driver.getWindowHandles(); 
			  
			  
			  Iterator<String> it=set.iterator(); String
			  parentId=it.next(); 
			 
			  System.out.println("parent window pop-up id"+ parentId); String
			  childId=it.next(); 
			  
			  System.out.println("child window pop-up id" +childId); 
			  
			  driver.switchTo().window(childId); 
			  
			  System.out.println("child window pop-up title:"+ driver.getTitle());
			  Thread.sleep(3000); 
			  
			  driver.close(); 
			 
			  driver.switchTo().window(parentId);
			  System.out.println("parent window pop-up title:"+
			  driver.getTitle());
			  Thread.sleep(3000);
			 
		  
		  
		  
		  driver.findElement(By.xpath("//a[contains(text(),'Open New Seperate Windows')]")).click(); 
		  driver.findElement(By.xpath("//*[@class=\"btn btn-primary\"]")).click();
		  Set<String> set1=driver.getWindowHandles();
		  
		  Iterator<String> itr=set1.iterator();
		  String pId=itr.next();
		  
		  System.out.println("parent window pop-up id"+ pId); 
		  String cId=itr.next();
		  
		  System.out.println("child window pop-up id" +cId);
		 
		  driver.switchTo().window(cId);
		  
		  System.out.println("child window pop-up title:"+ driver.getTitle());
		  Thread.sleep(3000); 
		  
		  driver.close();
		  
		  driver.switchTo().window(pId);
		  
		  System.out.println("parent window pop-up title:"+ driver.getTitle());
		  
		  driver.close();    
		  
		  
		  
	    }
	
	
	
	
	
	
	
}
