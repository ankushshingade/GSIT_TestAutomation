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
		
		WebElement resize = driver.findElement(By.className("react-resizable-handle"));
		js.executeScript("arguments[0].scrollIntoView(true)", resize);
		action.clickAndHold(resize).moveByOffset(200, 100).release().perform();
		
		Thread.sleep(4000);
		driver.quit();
		
	}

}
