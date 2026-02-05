package Stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class LogindemoSteps {

    WebDriver driver;

    @Given("user is on HRM login page {string}")
    public void user_is_on_hrm_login_page(String url) {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }

    @When("user enters username as {string} and password as {string}")
    public void user_enters_username_and_password(String username, String password) {
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
    }

    @Then("user clicks on login")
    public void user_clicks_on_login() {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Then("user should be able to login successfully")
    public void user_should_be_able_to_login_successfully() {
        System.out.println("Login successful");
        driver.quit();
    }
}
