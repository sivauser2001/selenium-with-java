package Stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Googlesearch {
	WebDriver driver;
	@Given("browser is open");
	public void givenBrowserIsOpen() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	@Given("user is on google search page")
	public void givenUserIsOnGoogleSearchPage() {
		driver.navigate().to("https://www.google.com");
		
	}
	@When("user entersa text search box")
	public void WhenUseEntersTextInSearchBox() {
		driver.findElement(By.name("q")).sendKeys("India");
		driver.findElement(By.name("q")).sendKeys("Enter");
	}
	@Then("user is navigate to search box");
	public void thenUserIsNavigateResult() throws InterruptedException{
		Thread.sleep(4000);
		driver.quit();
		
	}

}
