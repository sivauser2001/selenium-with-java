package basicpgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssprogram {
	public static void main(String args[]) throws InterruptedException{
		System.out.println("Hello and welcome");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("username")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("#login-button")).click();
				Thread.sleep(3000);
				driver.quit();
}
}
