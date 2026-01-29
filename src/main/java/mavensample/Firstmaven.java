package mavensample;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstmaven {
	public static void main(String args[]) throws InterruptedException{
		System.out.println("Hello and welcome");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		Thread.sleep(3000);
		String pagetitle=driver.getTitle();
		
		System.out.println(pagetitle);
		driver.quit();
		
		
	}

}
