package SeleniumFirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnderstandingNestedFrames {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/nestedframes");
		
		driver.switchTo().frame("frame1");
		System.out.println(driver.findElement(By.tagName("body")).getText());
		
		WebElement childFrame = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
		driver.switchTo().frame(childFrame);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		
		driver.switchTo().parentFrame();
		System.out.println(driver.findElement(By.tagName("body")).getText());
		
		Thread.sleep(4000);
		driver.quit();
	}

}
