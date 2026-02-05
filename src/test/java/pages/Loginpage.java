package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {

    private WebDriver driver;

    private String url = "https://www.saucedemo.com/";

    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");
    private By errorMessage = By.cssSelector("h3[data-test='error']");

    // Constructor
    public Loginpage(WebDriver driver) {
        this.driver = driver;
    }

    // Navigate to login page
    public void navigateTo() {
        if (!driver.getCurrentUrl().equals(url)) {
            driver.get(url);
        }
    }

    // Login method
    public void login(String username, String password) {
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
    }

    // Get error message
    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText();
    }
}
