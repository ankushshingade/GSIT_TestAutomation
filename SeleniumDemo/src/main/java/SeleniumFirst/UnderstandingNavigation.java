package SeleniumFirst;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnderstandingNavigation {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		

		driver.navigate().refresh();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
		driver.get("https://the-internet.herokuapp.com/windows");
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Click Here")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
		Thread.sleep(3000);
		driver.quit();
	}

}
