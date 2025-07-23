package SeleniumFirst;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnderstandingLocators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();		
		
		driver.get("https://www.saucedemo.com/");
		
		// Using Locators
		driver.findElement(By.id("user-name")).sendKeys("standard_user");	// Using ID
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("secret_sauce");	// Using Name
		Thread.sleep(2000);
		driver.findElement(By.className("submit-button")).click();			// Using ClassName
		Thread.sleep(2000);
		driver.findElement(By.linkText("Sauce Labs Bike Light")).click();	// Using LinkText
		Thread.sleep(2000);
		List<WebElement> ListWebElements = driver.findElements(By.tagName("a"));	// Using Tag
		System.out.println(ListWebElements.size());
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Test.allTheThings()")).click();	// Using Partial LinkText
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		driver.quit();
	}

}
