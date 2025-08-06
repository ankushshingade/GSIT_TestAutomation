package SeleniumFirst;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UnderstandingWaits {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/dynamic_loading");
		
		driver.findElement(By.linkText("Example 1: Element on page that is hidden")).click();
		
		driver.findElement(By.cssSelector("#start > button")).click();
		
		WebElement HelloWorldText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#finish > h4")));
		
		System.out.println(HelloWorldText.getText());
		
		driver.quit();
	}

}
