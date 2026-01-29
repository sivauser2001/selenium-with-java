package Stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LogindemoSteps {
	WebDriver driver;
	@Given("Chrome browser is open")
	public void Chrome_browser_is_open() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();	
		}
	@Given("user is on google search page")
	public void user_is_on_google_search_page() throws InterruptedException {
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(3000);
	}
	@When("^user enters(.*) and (.*)")
	public void user_enters(String username,String password) throws InterruptedException {
		driver.findElement(By.id("user-name")).sendKeys(username);
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(3000);
	}
	@When("user clicks on login")
	public void user_clicks_on_login() {
		driver.findElement(By.id("login-button")).click();
	}
	
	}
	


