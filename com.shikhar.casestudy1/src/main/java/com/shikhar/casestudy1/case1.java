package com.shikhar.casestudy1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class case1 {
WebDriver driver;
    
    @BeforeTest(alwaysRun = true)
    public void LaunchBrowser()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Shikhar\\Desktop\\seleniumtrain\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();        
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.get("http://demo.automationtesting.in/Register.html");
    }   
    @Test
    public void A()
    {   
    	driver.findElement(By.tagName("input")).sendKeys("Shikhar");
    	driver.findElement(By.xpath("//input[contains(@placeholder,'Last Name')]")).sendKeys("Singh"); 
    	driver.findElement(By.tagName("textarea")).sendKeys("Rajajipuram,Lucknow");
    	driver.findElement(By.xpath("//input[contains(@type,'email')]")).sendKeys("Shikharsingh88@gmail.com");
    	driver.findElement(By.xpath("//input[contains(@type,'tel')]")).sendKeys("8400512522");
    	driver.findElement(By.xpath("//input[contains(@value,'Male')]")).click();
    	driver.findElement(By.xpath("//input[contains(@value,'Cricket')]")).click();
    	
    	driver.findElement(By.xpath("//div[@id='msdd']")).click();
    	
    	List<WebElement> langmenu = driver.findElements(By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']//li/a"));
        for(int i=0;i<langmenu.size();i++) {
        	
        	WebElement element=langmenu.get(i);
        	String innerhtml=element.getAttribute("innerHTML");
        	if(innerhtml.contentEquals("English")) {  		
        		element.click();
        		break;
        	}
        	
        }
        
    	WebElement select1=driver.findElement(By.xpath("//select[@id='Skills']"));
    	Select sel= new Select(select1);
        sel.selectByVisibleText("Java");   
        
        WebElement select2=driver.findElement(By.xpath("//select[@id='countries']"));
    	Select sel2= new Select(select2);
        sel2.selectByVisibleText("India");  
        
        driver.findElement(By.xpath("//span[@role='combobox']")).click();
    	
    	List<WebElement> cmenu = driver.findElements(By.xpath("//ul[@id='select2-country-results']/li"));
        for(int i=0;i<cmenu.size();i++) {
        	
        	WebElement element=cmenu.get(i);
        	String innerhtml=element.getAttribute("innerHTML");
        	if(innerhtml.contentEquals("India")) {  		
        		element.click();
        		break;
        	}
        	
        }
        
        WebElement select4=driver.findElement(By.xpath("//select[@id='yearbox']"));
    	Select sel4= new Select(select4);
        sel4.selectByVisibleText("1998");  
        
        WebElement select5=driver.findElement(By.xpath("//select[@placeholder='Month']"));
    	Select sel5= new Select(select5);
        sel5.selectByVisibleText("December"); 
        
        WebElement select6=driver.findElement(By.xpath("//select[@id='daybox']"));
    	Select sel6= new Select(select6);
        sel6.selectByVisibleText("16"); 
    
        driver.findElement(By.cssSelector("#firstpassword")).sendKeys("12345");
        driver.findElement(By.cssSelector("#secondpassword")).sendKeys("12345");
    
    }
}
