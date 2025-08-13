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
		WebElement ele = driver.findElement(By.cssSelector("h1[id='sampleHeading']"));
		String frameText = ele.getText();
		System.out.println(frameText);
		
		driver.switchTo().defaultContent();
		
		try {
			WebElement frame2 = driver.findElement(By.xpath("(//iframe[@src='/sample'])[1]"));
			driver.switchTo().frame(frame2);
			System.out.println(driver.findElement(By.cssSelector("h1[id='sampleHeading']")).getText());
		}catch(Exception e){
			WebElement frame2 = driver.findElement(By.xpath("(//iframe[@src='/sample'])[1]"));
			js.executeScript("arguments[0].ScrollIntoView(true)", frame2);
			//driver.switchTo().frame(frame2);
			driver.switchTo().frame("frame2");
			System.out.println(driver.findElement(By.cssSelector("h1[id='sampleHeading']")).getText());	
		}	
		
		Thread.sleep(5000);
		driver.quit();
	}

}
