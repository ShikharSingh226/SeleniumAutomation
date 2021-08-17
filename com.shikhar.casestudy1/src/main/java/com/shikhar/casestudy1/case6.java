package com.shikhar.casestudy1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class case6 {
WebDriver driver;
    
    @BeforeTest(alwaysRun = true)
    public void LaunchBrowser()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Shikhar\\Desktop\\seleniumtrain\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();        
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.get("http://demo.automationtesting.in/Selectable.html");
    }   
    @Test
    public void Selectable()
    {   
    	List<WebElement> menu = driver.findElements(By.xpath("//ul[@class='deaultFunc']//li/b"));
         for(int i=0;i<menu.size();i++) {
        	
        	WebElement element=menu.get(i);
        	String innerhtml=element.getAttribute("innerHTML");
        	if(innerhtml.contentEquals("Sakinalium - Method Chaining")) {  		
        		element.click();
        		break;
        	}
         }
        
         driver.findElement(By.xpath("//a[contains(text(),'Serialize')]")).click();
         List<WebElement> m = driver.findElements(By.xpath("//ul[@class='SerializeFunc']//li/b"));
         for(int j=0;j<m.size();j++) {
        	 WebElement e=m.get(j);
        	 String in=e.getAttribute("innerHTML");
        	 if(in.contentEquals("Sakinalium - Method Chaining")) {
        		 e.click();
        	 break;
        	 
        }
         }
    
         }
}
