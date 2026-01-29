package basicpgms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Search {
	public static void main(String args[]) throws InterruptedException{
		System.out.println("Hello and welcome");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		WebElement l =driver.findElement(By.name("q"));
		Actions a=new Actions(driver);
		a.moveToElement(l).click();
		a.keyDown(Keys.SHIFT);
		a.sendKeys("hello").keyUp(Keys.SHIFT).build().perform ();
		a.contextClick().perform();
		Thread.sleep(3000);
		driver.quit();
		
	}
		
	

}
