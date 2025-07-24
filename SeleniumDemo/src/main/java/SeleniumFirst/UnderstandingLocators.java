package SeleniumFirst;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UnderstandingLocators {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\Ankush\\Downloads\\edgedriver_win64 (5)\\msedgedriver.exe");
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver(); 
		//WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();		
		
		driver.get("https://www.saucedemo.com/");
		
		// Using Locators
		driver.findElement(By.id("user-name")).sendKeys("standard_user");			// Using ID
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("secret_sauce");			// Using Name
		Thread.sleep(2000);
		driver.findElement(By.className("submit-button")).click();					// Using ClassName
		Thread.sleep(2000);
		driver.findElement(By.linkText("Sauce Labs Bike Light")).click();			// Using LinkText
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		List<WebElement> ListWebElements = driver.findElements(By.tagName("a"));	// Using Tag
		System.out.println(ListWebElements.size());
		Thread.sleep(2000);
		driver.findElement(By.name("back-to-products")).click();
		Thread.sleep(2000);
		ListWebElements = driver.findElements(By.tagName("a"));	// Using Tag
		System.out.println(ListWebElements.size());
		driver.findElement(By.partialLinkText("Test.allTheThings()")).click();		// Using Partial LinkText
		Thread.sleep(2000);
		String url = "https://www.saucedemo.com/inventory-item.html?id=3";
		System.out.println("Expected URL: "+url);
		System.out.println("Current URL: "+driver.getCurrentUrl());
		//driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(2000);

		Thread.sleep(3000);
		driver.quit();
	}

}
