package SeleniumFirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		Thread.sleep(500);
		Thread.sleep(2000);
		driver.quit();
	}

}
