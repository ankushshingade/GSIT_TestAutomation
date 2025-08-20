package SeleniumFirst;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizeableExample {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/resizable");
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement resizeWithRestiction = driver.findElement(By.xpath("//div[@id='resizableBoxWithRestriction']/span[@class='react-resizable-handle react-resizable-handle-se']"));
		js.executeScript("arguments[0].scrollIntoView(true)", resizeWithRestiction);
		action.clickAndHold(resizeWithRestiction)
		.moveByOffset(200, 100)
		.release()
		.perform();
		
		Thread.sleep(2000);
		
		WebElement resize = driver.findElement(By.xpath("//div[@id='resizable']/span[@class='react-resizable-handle react-resizable-handle-se']"));
		action.clickAndHold(resize)
	//	.scrollByAmount(0, 5)
		.moveByOffset(200, 100)
		.release()
		.perform();
		
		Thread.sleep(4000);
		driver.quit();
		
	}

}
