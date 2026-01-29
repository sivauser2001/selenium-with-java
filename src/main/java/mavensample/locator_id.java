package mavensample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator_id {
	public static void main(String args[]) throws InterruptedException{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www..saucedemo.com/");
	Thread.sleep(2000);
	WebElement usrnm = driver.findElement(By.id("user-name"));
	usrnm.sendKeys("Standard_user");
	
	
	}
	

}
