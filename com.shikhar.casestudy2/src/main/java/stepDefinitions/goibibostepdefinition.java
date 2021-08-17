package stepDefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class goibibostepdefinition {
	WebDriver driver= null;
	@Given("^user is on goibibo page$")
	public void user_is_on_goibibo_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shikhar\\Desktop\\seleniumtrain\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.goibibo.com/");
        Thread.sleep(6000);
	}
	@When("user tap on one way")
	public void user_tap_on_one_way() {
		driver.findElement(By.xpath("//span[@id='oneway']"));
	}
	@Then("user enter {string} & {string}")
	public void user_enter(String source, String destination) throws InterruptedException  {
		WebElement ele   = driver.findElement(By.xpath("//input[@id='gosuggest_inputSrc']"));
		ele.sendKeys(source);
		Thread.sleep(2000);
		ele.sendKeys(Keys.ARROW_DOWN);
		ele.sendKeys(Keys.ENTER);
		WebElement el   = driver.findElement(By.xpath("//input[@id='gosuggest_inputDest']"));
		el.sendKeys(destination);
		Thread.sleep(2000);
		el.sendKeys(Keys.ARROW_DOWN);
		el.sendKeys(Keys.ENTER);
		
	}

	@Then("user select departure {string} & {string}")
	public void user_select_departure_date(String date, String month) throws InterruptedException {
		String MonthToBeSelected = month;
		String DAY = date;
		driver.findElement(By.xpath("//input[@type='text' and @placeholder='Departure']")).click();
		// Logic for Expected Date Picker
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
		
		// Clicking over the DAY variable date
		driver.findElement(By.xpath("//div[@class='DayPicker-Week']/div[@class='DayPicker-Day']/div[text()=" + DAY + "]")).click();
	
		Thread.sleep(2000);
		
	}
	@Then("user selects traveller details")
	public void user_selects_traveller_details() throws InterruptedException {
		driver.findElement(By.xpath("//div[@id='pax_link_common']")).click();
		driver.findElement(By.xpath("//button[@id='adultPaxPlus']")).click();
		WebElement e=driver.findElement(By.xpath("//select[@id='gi_class']"));
		e.click();
		e.sendKeys(Keys.ARROW_DOWN);
		e.sendKeys(Keys.ARROW_DOWN);
		e.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//button[@id='gi_search_btn']")).click();
		Thread.sleep(8000);
		
	}

	@Then("user selects cheapest price")
	public void user_selects_cheapest_price() {
		List<WebElement> books = driver.findElements(By.xpath("//button[contains(text(),'BOOK')]"));
		books.get(1).click();
	
	}
	@Then("user book and review")
	public void user_book_and_review() {
		WebElement r=driver.findElement(By.xpath("//span[@class='padL5']"));
		String rr=r.getAttribute("innerHTML");
		System.out.print(rr);
		
	}


	
	
}
