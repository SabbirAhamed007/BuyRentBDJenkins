package stepDeFiNatiOn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Arsi_NagarTest {
	
	public static WebDriver driver;
	
	@Given("^I open buyrentbd website(\\d+)$")
	public void i_open_buyrentbd_website(int arg1) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ubox0\\Desktop\\Driver(Chrome+Mozilla+ internet)\\Chrome\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("https://buyrentbd.com");
		


		
	}

	@When("^I click on Arshi Nangar flat$")
	public void i_click_on_Arshi_Nangar_flat() throws Throwable {
		
		driver.findElement(By.xpath(".//*[@id='home-properties']/div[5]/article/h4/a")).click();
		
		


		
	}

	@When("^I click on next butto(\\d+)$")
	public void i_click_on_next_butto(int arg1) throws Throwable {
		
		driver.findElement(By.xpath(".//*[@id='property-featured-image']/a/img")).click();
		
		driver.findElement(By.xpath(".//*[@id='swipebox-close']")).click();
		
	   


		
	}

	@When("^verift the text on(\\d+)$")
	public void verift_the_text_on(int arg1) throws Throwable {
		
		WebElement element = driver.findElement(By.xpath(".//*[@id='overview']/article/div[3]/p"));

		System.out.println(element.getText());


		
	}

	@Then("^I close it(\\d+)$")
	public void i_close_it(int arg1) throws Throwable {
		
		driver.quit();


		
	}



}
