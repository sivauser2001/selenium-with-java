package basicpgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobuttons {
	public static void main(String args[]) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demoqa.com/radio-button");
		WebElement yesRadio=driver.findElement(By.xpath("//label[@for='yesRadio']"));
		yesRadio.click();
		Thread.sleep(30000);
		driver.quit();
		
	}
	
}
