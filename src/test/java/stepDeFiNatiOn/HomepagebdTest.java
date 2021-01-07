package stepDeFiNatiOn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomepagebdTest {
	
	public static WebDriver driver;
	
	@Given("^I open buyrentbd homepage$")
	public void i_open_buyrentbd_homepage() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ubox0\\Desktop\\Driver(Chrome+Mozilla+ internet)\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("https://buyrentbd.com");

		
		
	}

	@Given("^I verify search options$")
	public void i_verify_search_options() throws Throwable {
		
		driver.findElement(By.xpath("html/body/div[3]/div[1]/div/div/div/section/div/form/div[1]/div[1]/span/div/button")).click();

        driver.findElement(By.xpath(".//*[@id='bs-select-1-1']/span[2]")).click();
        
        driver.findElement(By.xpath("html/body/div[3]/div[1]/div/div/div/section/div/form/div[1]/div[2]/span/div/button")).click();
        
        driver.findElement(By.xpath(".//*[@id='bs-select-2-2']/span[2]")).click();
        
        driver.findElement(By.xpath("html/body/div[3]/div[1]/div/div/div/section/div/form/div[1]/div[3]/span/div/button")).click();
        
        driver.findElement(By.xpath(".//*[@id='bs-select-3-5']/span[2]")).click();
        
        driver.findElement(By.xpath("html/body/div[3]/div[1]/div/div/div/section/div/form/div[1]/div[4]/span/div/button")).click();
        
        
        driver.findElement(By.xpath(".//*[@id='bs-select-4-4']/span[2]")).click();
        
        
        driver.findElement(By.xpath("html/body/div[3]/div[1]/div/div/div/section/div/form/div[1]/div[5]/span/div/button")).click();
        
        driver.findElement(By.xpath(".//*[@id='bs-select-5-20']/span[2]")).click();
        
        
        driver.findElement(By.xpath("html/body/div[3]/div[1]/div/div/div/section/div/form/div[1]/div[8]/span/div/button")).click();
        
        driver.findElement(By.xpath(".//*[@id='bs-select-8-2']")).click();
        
        driver.findElement(By.xpath("html/body/div[3]/div[1]/div/div/div/section/div/form/div[1]/div[9]/span/div/button")).click();
        
        driver.findElement(By.xpath(".//*[@id='bs-select-9-2']")).click();
        
        
        
        boolean isDisplayed = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div/div/section/div/form/div[1]/div[16]/div/input")).isDisplayed();

		boolean isEnbled = driver.findElement(By.xpath("html/body/div[3]/div[1]/div/div/div/section/div/form/div[1]/div[16]/div/input")).isEnabled();

		if (isDisplayed) {
			System.out.println("Button is Displayed");

		} else {
			System.out.println("Button is not Displayed");

		}

		if (isEnbled) {
			System.out.println("Button is Enbled");

		} else {
			System.out.println("Button is not Enbled");

		}


        
        
		
		
	}

	@When("^I verify mission statement$")
	public void i_verify_mission_statement() throws Throwable {
		
		
		WebElement element = driver.findElement(By.xpath(".//*[@id='home-properties-section']/div[1]/h2"));

		System.out.println(element.getText());



		
		
	}

	@Then("^I validate the outcomes$")
	public void i_validate_the_outcomes() throws Throwable {
		
		
		driver.quit();


		
		
	}



}
