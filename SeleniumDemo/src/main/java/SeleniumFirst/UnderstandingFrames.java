package SeleniumFirst;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UnderstandingFrames {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); //FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/frames");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.switchTo().frame("frame1");
		try {
			WebElement ele = driver.findElement(By.cssSelector("h1[id='sampleHeading']"));
			String frameText = ele.getText();
			System.out.println(frameText);
		}catch(Exception e){
			WebElement ele = driver.findElement(By.cssSelector("h1[id='sampleHeading']"));
			js.executeScript("arguments[0].ScrollIntoView(true)", ele);
			String frameText = ele.getText();
			System.out.println(frameText);
		}
		
		
		Thread.sleep(5000);
		driver.quit();
	}

}
