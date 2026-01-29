package basicpgms;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Navigationcmds {
	public static void main(String args[]) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https//www.google.com");
		Thread.sleep(30000);
		driver.navigate().to("https//www.facebook.com");
		Thread.sleep(30000);
		driver.navigate().back();
		Thread.sleep(20000);
		driver.navigate().forward();
		Thread.sleep(20000);
		driver.navigate().refresh();
		Thread.sleep(20000);
		driver.quit();
		
		

}}

