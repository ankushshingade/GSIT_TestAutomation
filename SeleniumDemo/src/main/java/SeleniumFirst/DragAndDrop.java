package SeleniumFirst;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/droppable");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		js.executeScript("arguments[0].scrollIntoView(true)", source);
		Thread.sleep(1000);
		
		Actions action = new Actions(driver);
		
		action.dragAndDrop(source, target).perform();
		System.out.println(target.getText());
		
		Thread.sleep(3000);
		driver.quit();

	}

}
