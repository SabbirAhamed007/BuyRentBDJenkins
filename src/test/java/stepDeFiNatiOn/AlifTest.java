package stepDeFiNatiOn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AlifTest {
	
	public static WebDriver driver;
	
	@Given("^I open buyrentbd websit$")
	public void i_open_buyrentbd_websit() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ubox0\\Desktop\\Driver(Chrome+Mozilla+ internet)\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("https://buyrentbd.com");
	   
		
		
	}

	@When("^I click on Alif flat$")
	public void i_click_on_Alif_flat() throws Throwable {
		
		driver.findElement(By.xpath(".//*[@id='home-properties']/div[7]/article/h4/a")).click();


		
	}

	@When("^I click on next buttons$")
	public void i_click_on_next_buttons() throws Throwable {
		
		driver.findElement(By.xpath(".//*[@id='property-detail-flexslider']/div/ul/li[2]/a")).click();
		
		driver.findElement(By.xpath(".//*[@id='property-detail-flexslider']/div/ul/li[1]/a")).click();


		
	}

	@When("^verift the text on the page$")
	public void verift_the_text_on_the_page() throws Throwable {
		
		WebElement element = driver.findElement(By.xpath(".//*[@id='overview']/article/div[3]/div[1]/div[1]"));

		System.out.println(element.getText());


		
	}

	@Then("^I close browser$")
	public void i_close_browser() throws Throwable {
		
		driver.quit();


		
	}



}
