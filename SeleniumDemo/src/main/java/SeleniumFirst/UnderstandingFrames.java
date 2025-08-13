package SeleniumFirst;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UnderstandingFrames {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); //FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/frames");
		
		Thread.sleep(5000);
		driver.quit();
	}

}
