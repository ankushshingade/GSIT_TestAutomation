package SeleniumFirst;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UnderstandingXpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		
		//)
		driver.get("https://demoqa.com/automation-practice-form");
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Ankush");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Shingade");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("ankush@test.com");
		Thread.sleep(500);
		WebElement element = driver.findElement(By.xpath("//label[text()='Male']"));		// .click(); // gender-radio-1
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("8765432109");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[starts-with(@id,'date')]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//option[@value='1987']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//option[@value='0']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[text()='11']")).click();
		Thread.sleep(500);
		String subject = "History, Data Structure, English";
		WebElement subjects = driver.findElement(By.xpath("//div[@class='subjects-auto-complete__placeholder css-1wa3eu0-placeholder']"));
		executor.executeAsyncScript("arguments[1].sendKeys(subject);", subjects);
		Thread.sleep(500);
		driver.findElement(By.xpath("//label[text()='Reading']")).click();
		Thread.sleep(500);
		Thread.sleep(2000);
		driver.quit();
	}

}
