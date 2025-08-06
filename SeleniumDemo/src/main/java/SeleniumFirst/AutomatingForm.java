package SeleniumFirst;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutomatingForm {

	public static void main(String[] args) throws InterruptedException {
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
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
		executor.executeScript("arguments[0].scrollIntoView(true)", element);
		element.click();
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
		
		WebElement subjectText = driver.findElement(By.id("subjectsInput")); // driver.findElement(By.cssSelector("//input[@id='subjectsInput']"));
		subjectText.sendKeys("Computer science");
		subjectText.sendKeys(Keys.ENTER);
		subjectText.sendKeys("Histo");
		subjectText.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		//WebElement subjects = driver.findElement(By.xpath("//div[@class='subjects-auto-complete__placeholder css-1wa3eu0-placeholder']"));
		//executor.executeAsyncScript("arguments[0].sendKeys(subject);", subjects);
		//executor.executeScript("document.querySelector('//div[@class=\"subjects-auto-complete__placeholder css-1wa3eu0-placeholder\"]').value = arguments[0];", subject);
		Thread.sleep(500);
		
		//WebElement hobbies = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-3']"));
		//executor.executeScript("argument[1].scrollIntoView(true)", hobbies);
		//hobbies.click();
		driver.findElement(By.xpath("//label[text()='Reading']")).click();
		Thread.sleep(500);
		 
		driver.findElement(By.xpath("//textarea[@placeholder='Current Address']")).sendKeys("Test Address. \r 2nd Line");		
		
		Thread.sleep(500);
		driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\Ankush\\Downloads\\Invite2.png");
		
		
		driver.findElement(By.id("react-select-3-input")).sendKeys("Haryana");
		driver.findElement(By.id("react-select-3-input")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.id("react-select-4-input")).sendKeys("Karnal");
		driver.findElement(By.id("react-select-4-input")).sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);
		driver.quit();
	}

}
