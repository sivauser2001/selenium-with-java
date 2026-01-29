package basicpgms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alretexample {
	public static void main(String args[]) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[text()='Click for JS prompt']")).submit();
		Alert alert=driver.switchTo().alert();
		String alertText=alert.getText();
		System.out.println("Alert text is: "+ alertText);
		alert.accept();
		driver.quit();
		
	}
		

}
