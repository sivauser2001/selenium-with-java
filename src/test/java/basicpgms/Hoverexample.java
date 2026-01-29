package basicpgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hoverexample {
	public static void main(String args[]) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demoqa.com/menu");
		WebElement menu =driver.findElement(By.xpath("//a[text()='main Item 2']"));
		Actions a=new Actions(driver);
		a.moveToElement(menu).perform();
		
	}
	

}
