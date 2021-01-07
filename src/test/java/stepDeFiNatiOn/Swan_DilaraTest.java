package stepDeFiNatiOn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Swan_DilaraTest {
	
	public static WebDriver driver;
	
	@Given("^I open buyrentbd website for Swan Dilara$")
	public void i_open_buyrentbd_website_for_Swan_Dilara() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ubox0\\Desktop\\Driver(Chrome+Mozilla+ internet)\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("https://buyrentbd.com");
		
		
	}

	@Given("^I click on two links for Swan Dilara$")
	public void i_click_on_two_links_for_Swan_Dilara() throws Throwable {

		driver.findElement(By.xpath(".//*[@id='home-properties-section-inner']/div[3]/a[2]")).click();


		
	}

	@When("^I click on Swan Dilara flat$")
	public void i_click_on_Swan_Dilara_flat() throws Throwable {
		
		driver.get("https://buyrentbd.com/property/swan-dilara-villa/");


		
	}

	@When("^I click on next buttons for Swan Dilara$")
	public void i_click_on_next_buttons_for_Swan_Dilara() throws Throwable {
		
		driver.findElement(By.xpath(".//*[@id='property-detail-flexslider']/div/ul/li[2]/a")).click();
		driver.findElement(By.xpath(".//*[@id='property-detail-flexslider']/div/ul/li[1]/a")).click();
			
		
	}

	@When("^verift the text on the page Swan Dilara$")
	public void verift_the_text_on_the_page_Swan_Dilara() throws Throwable {
		
		WebElement element = driver.findElement(By.xpath(".//*[@id='overview']/article/div[3]/p[1]"));

		System.out.println(element.getText());
	
	}

	@Then("^I close browser for Swan Dilara$")
	public void i_close_browser_for_Swan_Dilara() throws Throwable {
		
		driver.quit();
	   
		
		
	}



}
