package basicpgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
	public static void main(String args[]) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.get("https//demoqa.com.droppable");
		driver.manage().window().maximize();
		WebElement source=driver.findElement(By.id("drggable"));
		WebElement target=driver.findElement(By.id("drggable"));
		Actions a=new Actions(driver);
		a.dragAndDrop(source, target).perform();
		Thread.sleep(3000);
		driver.quit();
		
		
		
	}
	
}
