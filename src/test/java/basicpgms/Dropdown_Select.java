package basicpgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Select {
	public static void main(String args[]) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demoqa.com/select-menu");
		WebElement Dropdown =driver.findElement(By.id("oldselectmenu"));
		Select select = new Select(Dropdown);
		select.selectByIndex(1);
		select.selectByValue("3");
		select.selectByVisibleText("Yellow");
		driver.quit();
	}
	
		
		
		
}
