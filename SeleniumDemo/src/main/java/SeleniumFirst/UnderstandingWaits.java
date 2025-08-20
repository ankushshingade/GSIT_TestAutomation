package SeleniumFirst;


import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UnderstandingWaits {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	// Global wait
		
		// Explicit (Specific) wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/dynamic_loading");
		
		driver.findElement(By.linkText("Example 1: Element on page that is hidden")).click();
		
		driver.findElement(By.cssSelector("#start > button")).click();
		
		// Element is present in DOM, it is gets visible after the click
		WebElement HelloWorldText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#finish > h4")));
		
		System.out.println(HelloWorldText.getText());
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[@href='/dynamic_loading/2']")).click();
		
		driver.findElement(By.cssSelector("#start > button")).click();
		
		// Element is NOT present in DOM, it is added and visible after the click
		WebElement HelloWorldText_2 = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div[id='finish'] > h4")));
		// Above statement checks if element is present in DOM or not. 
		System.out.println("Checking for PRESENCE of element: "+HelloWorldText_2.getText());
		
		
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@href='/dynamic_loading/2']")).click();
		driver.findElement(By.cssSelector("#start > button")).click();
		
		// Below statement checks if element is visible on web page or not.
		WebElement HelloWorldText_3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='finish'] > h4")));
		System.out.println("Checking for VISIBILITY of element: "+HelloWorldText_3.getText());
		
		driver.navigate().to("https://the-internet.herokuapp.com/dynamic_controls");
		Wait<WebDriver> fluentWait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
		
		WebElement enableButton = driver.findElement(By.xpath("//button[@onclick='swapInput()']"));
		enableButton.click();
		System.out.println(driver.findElement(By.xpath("//div[@id='loading']")).getText());
		WebElement message = fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
		System.out.println(message.getText());
		driver.quit();
	}

}
