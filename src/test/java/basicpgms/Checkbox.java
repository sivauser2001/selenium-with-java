package basicpgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {
	public static void main(String args[]) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demoqa.com/Checkbox");
		driver.findElement(By.xpath("//button[@title='Expand all']")).click();
		Thread.sleep(3000);
		WebElement desktopcheckbox=driver.findElement(By.xpath("//span[test()='desktop']"));
		desktopcheckbox.click();
		Thread.sleep(3000);
		driver.quit();
	}
	
		

}
