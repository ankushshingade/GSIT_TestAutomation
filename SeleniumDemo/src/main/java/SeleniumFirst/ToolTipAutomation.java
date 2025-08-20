package SeleniumFirst;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToolTipAutomation {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/tool-tips");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		WebElement toolTipButton = driver.findElement(By.id("toolTipButton"));
		
		Actions action = new Actions(driver);
		js.executeScript("arguments[0].scrollIntoView(true)", toolTipButton);
		action.moveToElement(toolTipButton).perform();
//		WebElement message = explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.className("tooltip-inner")));
//		System.out.println(message.getText());
		System.out.println(explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.className("tooltip-inner"))).getText());
		
		driver.quit();
	}

}
