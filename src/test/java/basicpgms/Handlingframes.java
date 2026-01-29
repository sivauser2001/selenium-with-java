package basicpgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingframes {
	public static void main(String args[]) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https//the-internet.herokuapp.com/nested_frames");
		driver.findElement(By.linkText("Nested frames")).click();
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-:Left");
		WebElement lefttext=driver.findElement(By.tagName("Body"));
		
		System.out.println("Left frame text: "+lefttext.getText());
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame("frame-middle");
		WebElement middleText=driver.findElement(By.id("content"));
		System.out.println("Middle frame text: "+middleText.getText());
		driver.switchTo().parentFrame();
		driver.switchTo().frame("frame-right");
		WebElement rightText=driver.findElement(By.id("content"));
		System.out.println("right frame text: "+rightText.getText());
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame-bottom");
		WebElement bottomText=driver.findElement(By.id("body"));
		System.out.println("bottom frame text: "+bottomText.getText());
		driver.close();
		
		
		
		
		
	}
}
