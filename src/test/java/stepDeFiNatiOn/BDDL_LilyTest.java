package stepDeFiNatiOn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BDDL_LilyTest {
	
	public static WebDriver driver;
	
	@Given("^I open buyrentbd website for Lily$")
	public void i_open_buyrentbd_website_for_Lily() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ubox0\\Desktop\\Driver(Chrome+Mozilla+ internet)\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("https://buyrentbd.com");
		
	}

	@Given("^I click on number two links$")
	public void i_click_on_number_two_links() throws Throwable {
		
		driver.findElement(By.xpath(".//*[@id='home-properties-section-inner']/div[3]/a[2]")).click();
		
	}

	@When("^I click on Lily flat$")
	public void i_click_on_Lily_flat() throws Throwable {
		
		driver.get("https://buyrentbd.com/property/bddl-lily-bashundhara-k-block-dhaka-bangladesh/");
		
		
	}

	@When("^I click on next buttons for Lily$")
	public void i_click_on_next_buttons_for_Lily() throws Throwable {
		

		driver.findElement(By.xpath(".//*[@id='property-detail-flexslider']/div/ul/li[2]/a")).click();
		driver.findElement(By.xpath(".//*[@id='property-detail-flexslider']/div/ul/li[1]/a")).click();
		
	}

	@When("^verift the text on the page Lily$")
	public void verift_the_text_on_the_page_Lily() throws Throwable {
		
		WebElement element = driver.findElement(By.xpath(".//*[@id='overview']/article/div[3]/h1"));

		System.out.println(element.getText());

		
	}

	@Then("^I close browser for Lily$")
	public void i_close_browser_for_Lily() throws Throwable {
		
		driver.quit();


		
	}


	
	

}
