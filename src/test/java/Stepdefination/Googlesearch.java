package Stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class Googlesearch {

    WebDriver driver;

    @Given("user is on google search page")
    public void user_is_on_google_search_page() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
    }

    @When("user enters a text in search box")
    public void user_enters_a_text_in_search_box() {
        driver.findElement(By.name("q"))
              .sendKeys("Selenium", Keys.ENTER);
    }

    @Then("user is navigated to search result")
   public void user_is_navigated_to_search_result() {
        System.out.println("Search results displayed");
        driver.quit();
    }
}
